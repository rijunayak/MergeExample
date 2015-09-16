// A log out menu item has a menu entry and logs out on selection
package com.twu.biblioteca;

public class LogoutMenuItem implements MenuItem {

    private Session session;

    public LogoutMenuItem(Session session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Logout";
    }

    @Override
    public String doOperation() {
        session.setUser(new User("000-0000", "password", "undefined"));
        return "\nLogged Out.\n";
    }
}
