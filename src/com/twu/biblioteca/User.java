//A User has an id, password and authenticates an input password
package com.twu.biblioteca;

public class User {

    private String userId;
    private String password;
    private String role;
    private String name;
    private String email;
    private String phone;

    public User(String userId, String password, String role, String name, String email, String phone) {
        this.userId = userId;
        this.password = password;
        this.role = role;
        this.name = name;
        this.email = email;
        this.phone = phone;
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

    public String userDetails() {
        String userDetails = "";
        userDetails += String.format("\n%40s%40s%40s\n", "Name", "Email ID", "Phone Number");
        for(int i = 0; i < 120; i++) {
            userDetails += "-";
        }
        userDetails += "\n";
        userDetails += String.format("%40s%40s%40s\n", name, email, phone);
        return userDetails;
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
