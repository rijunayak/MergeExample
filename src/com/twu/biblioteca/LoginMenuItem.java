//A Login  menu item takes credentials from the user and logs in
package com.twu.biblioteca;

public class LoginMenuItem {

    private ConsoleInput consoleInput;
    private Session session;

    public LoginMenuItem(Session session) {
        this.consoleInput = new ConsoleInput();
        this.session = session;
    }

    @Override
    public String toString() {
        return "Login";
    }
}
