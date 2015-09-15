//A Login  menu item takes credentials from the user and logs in
package com.twu.biblioteca;

public class LoginMenuItem implements MenuItem {

    private ConsoleInput consoleInput;
    private Session session;

    public LoginMenuItem(Session session, ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
        this.session = session;
    }

    @Override
    public String toString() {
        return "Login";
    }

    @Override
    public String doOperation() {
        String userIDToLogin = "";
        String password = "";
        Authenticator authenticator = new Authenticator();
        System.out.print("\nLogin : ");
        userIDToLogin = consoleInput.getInput();
        System.out.print("\nPassword : ");
        password = consoleInput.getInput();
        User userToBePutInSession = authenticator.authenticate(userIDToLogin, password);
        if(userToBePutInSession != null) {
            session = new Session(userToBePutInSession);
            return "Logged In!";
        } else {
            session = new Session(userToBePutInSession);
            return "Invalid Credentials.";
        }
    }
}
