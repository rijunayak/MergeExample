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
        return this.password.equals(password);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;

        User thatUser = (User) that;

        if(userId != null && thatUser.userId != null) {
            return userId.equals(thatUser.userId);
        } else {
            return false;
        }
    }
}
