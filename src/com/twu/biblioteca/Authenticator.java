//An Authenticator has a predefined list of users, for which it can authenticate given a userId, password pair
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class Authenticator {

    private ArrayList<User> users;

    public Authenticator() {
        User user1 = new User("000-0001", "password1", "user");
        User user2 = new User("000-0002", "password2", "user");
        User user3 = new User("000-0003", "password3", "user");
        User librarian = new User("100-0001", "passwordl", "librarian");
        users = new ArrayList<User>(Arrays.asList(user1, user2, user3, librarian));
    }

    public User authenticate(String userId, String password) {
        User userToAuthenticate = new User(userId, null, null);
        if(users.get(users.indexOf(userToAuthenticate)).authenticate(password)) {
            return users.get(users.indexOf(userToAuthenticate));
        }
        return new User("000-0000", "password", "undefined");
    }
}
