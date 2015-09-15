//A User has an id, password and authenticates an input password
package com.twu.biblioteca;

public class User {

    private String userId;
    private String password;

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public boolean authenticate(String password) {
        return this.password == password;
    }
}
