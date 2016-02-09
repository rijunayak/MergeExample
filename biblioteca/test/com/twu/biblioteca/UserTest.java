package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class UserTest {

    @Test
    public void shouldAuthenticateSuccessfully() {
        User user = new User("user1", "password1", "user", "name1", "email1", "phone1");

        assertTrue(user.authenticate("password1"));
    }

    @Test
    public void shouldNotAuthenticateInvalidInputPassword() {
        User user = new User("user1", "password1", "user", "name1", "email1", "phone1");

        assertFalse(user.authenticate("password2"));
    }

    @Test
    public void shouldReturnFalseOnComparingWithNullObject() {
        User user = new User("user1", "password1", "user", "name1", "email1", "phone1");

        assertNotEquals(user, null);
    }

    @Test
    public void shouldReturnFalseOnComparingWithNullUserID() {
        User user1 = new User("user1", "password1", "user", "name1", "email1", "phone1");
        User user2 = new User(null, "password1", "user", "name1", "email1", "phone1");

        assertNotEquals(user1, user2);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithDifferentClass() {
        User user = new User("user1", "password1", "user", "name1", "email1", "phone1");
        Library library = mock(Library.class);

        assertNotEquals(user, library);
    }

    @Test
    public void shouldReturnTrueOnComparingWithItself() {
        User user = new User("user1", "password1", "user", "name1", "email1", "phone1");

        assertEquals(user, user);
    }

    @Test
    public void shouldReturnFalseIfComparingUserIsNull() {
        User user1 = new User(null, "password1", "user", "name1", "email1", "phone1");
        User user2 = new User("user2", "password1", "user", "name1", "email1", "phone1");

        assertNotEquals(user1, user2);
    }

    @Test
    public void shouldReturnTrueOnComparingUserWithSameUserIDOnly() {
        User user1 = new User("user1", "password1", "user", "name1", "email1", "phone1");
        User user2 = new User("user1", null, "user", "name1", "email1", "phone1");

        assertEquals(user1, user2);
    }

    @Test
    public void shouldReturnFalseOnComparingDifferentUser() {
        User user1 = new User("user1", "password1", "user", "name1", "email1", "phone1");
        User user2 = new User("user2", "password2", "user", "name1", "email1", "phone1");

        assertNotEquals(user1, user2);
    }

    @Test
    public void shouldReturnZeroOnComparingHashCodeWithNullUserID() {
        User user = new User(null, "password1", "user", "name1", "email1", "phone1");

        assertEquals(0, user.hashCode());
    }

    @Test
    public void shouldHaveSameHashCodeForSameUserIDs() {
        User user1 = new User("user1", "password1", "user", "name1", "email1", "phone1");
        User user2 = new User("user1", null, "user", "name1", "email1", "phone1");

        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    public void shouldHaveDifferentHashCodeForDifferentUserIDs() {
        User user1 = new User("user1", "password1", "user", "name1", "email1", "phone1");
        User user2 = new User("user2", "password2", "user", "name1", "email1", "phone1");

        assertNotEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    public void shouldReturnRoleOfUser() {
        User user = new User("user1", "password1", "user", "name1", "email1", "phone1");

        assertEquals("user", user.getRole());
    }

    @Test
    public void shouldReturnUserIDOfUser() {
        User user = new User("user1", "password1", "user", "name1", "email1", "phone1");

        assertEquals("user1", user.getUserId());
    }

    @Test
    public void shouldReturnUserDetails() {
        User user = new User("user1", "password1", "user", "name1", "email1", "phone1");

        String oneTwentyDashes = "";
        for(int i = 0; i < 120; i++) {
            oneTwentyDashes += "-";
        }
        oneTwentyDashes += "\n";
        assertEquals(String.format("\n%40s%40s%40s\n", "Name", "Email ID", "Phone Number") +
                oneTwentyDashes +
                String.format("%40s%40s%40s\n", "name1", "email1", "phone1"), user.userDetails());
    }
}
