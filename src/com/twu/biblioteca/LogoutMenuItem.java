// A log out menu item has a menu entry and logs out on selection
package com.twu.biblioteca;

public class LogoutMenuItem {

    private Session session;

    public LogoutMenuItem(Session session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Logout";
    }
}
