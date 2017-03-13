import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sda.model.User;
import pl.sda.xml.XMLFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class XMLFactoryTest{

    private String login;
    private String password;
    private String xmlUser;

    public XMLFactoryTest() {
    }

    @Before
    public void setUp() throws Exception{
        login = "kowalski";
        password = "abs123";
        xmlUser = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><User><login>kowalski</login><password>abs123</password></User>";
    }

    @Test
    public void objectToXML() {
        XMLFactory<User> xmlFactory = new XMLFactory<User>(User.class);

        User user = new User(login, password);
        String xmlUserResult = xmlFactory.objectToXML(user);
//        System.out.println(xmlUser);
        Assert.assertTrue(xmlUserResult.equals(xmlUser));
    }

    @Test
    public void xmlToObject() {
        XMLFactory<User> xmlFactory = new XMLFactory<User>(User.class);
        User userFromXML = xmlFactory.xmlToObject(xmlUser);
        User user = new User(login, password);
//        System.out.println(xmlUser);
        Assert.assertTrue(user.equals(userFromXML));
    }
}
