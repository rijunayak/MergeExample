//An Authenticator has a predefined list of users, for which it can authenticate given a userId, password pair
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class Authenticator {

    private ArrayList<User> users;

    public Authenticator() {
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        User user3 = new User("user3", "password3");
        users = new ArrayList<User>(Arrays.asList(user1, user2, user3));
    }

    public boolean authenticate(String userId, String password) {
        User userToAuthenticate = new User(userId, null);
        return users.get(users.indexOf(userToAuthenticate)).authenticate(password);
    }
}
