//An Authenticator has a predefined list of users, for which it can authenticate given a userId, password pair
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class Authenticator {

    private ArrayList<User> users;

    public Authenticator() {
        User user1 = new User("000-0001", "password1", "user", "name1", "email1", "phone1");
        User user2 = new User("000-0002", "password2", "user", "name2", "email2", "phone2");
        User user3 = new User("000-0003", "password3", "user", "name3", "email3", "phone3");
        User librarian = new User("100-0001", "passwordl", "librarian", "namel", "emaill", "phonel");
        users = new ArrayList<User>(Arrays.asList(user1, user2, user3, librarian));
    }

    public User authenticate(String userId, String password) {
        User userToAuthenticate = new User(userId, null, null, null, null, null);
        if(users.get(users.indexOf(userToAuthenticate)).authenticate(password)) {
            return users.get(users.indexOf(userToAuthenticate));
        }
        return new User("000-0000", "password", "undefined", "name1", "email1", "phone1");
    }
}
