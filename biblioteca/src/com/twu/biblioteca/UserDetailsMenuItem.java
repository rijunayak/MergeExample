//A User Details Menu Item has a library which shows current session user details
package com.twu.biblioteca;

public class UserDetailsMenuItem implements MenuItem {

    private Session session;

    public UserDetailsMenuItem(Session session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "User Details";
    }

    @Override
    public String doOperation() {
        return session.getUser().userDetails();
    }
}
