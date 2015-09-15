//A Session maintains the user currently logged in and returns the same
package com.twu.biblioteca;

public class Session {

    private User user;

    public Session(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
