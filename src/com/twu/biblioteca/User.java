//A User has an id, password and authenticates an input password
package com.twu.biblioteca;

public class User {

    private String userId;
    private String password;
    private String role;

    public User(String userId, String password, String role) {
        this.userId = userId;
        this.password = password;
        this.role = role;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public String getRole() {
        return this.role;
    }

    public String getUserId() {
        return this.userId;
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

    @Override
    public int hashCode() {
        return userId != null ? userId.hashCode() : 0;
    }
}
