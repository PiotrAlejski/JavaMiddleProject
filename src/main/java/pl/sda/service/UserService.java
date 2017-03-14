package pl.sda.service;

import pl.sda.model.User;

/**
 * Created by RENT on 2017-03-13.
 */
public class UserService {

    public UserService() {
    }

    public boolean authenticate(User user) {
        DataService dataService = new DataService();
        User userFromFile = dataService.loadData();

        return user.equals(userFromFile);
    }
}
