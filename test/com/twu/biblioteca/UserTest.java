package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class UserTest {

    @Test
    public void shouldAuthenticateSuccessfully() {
        User user = new User("user1", "password1");

        assertTrue(user.authenticate("password1"));
    }

    @Test
    public void shouldNotAuthenticateInvalidInputPassword() {
        User user = new User("user1", "password1");

        assertFalse(user.authenticate("password2"));
    }

    @Test
    public void shouldReturnFalseOnComparingWithNullObject() {
        User user = new User("user1", "password1");

        assertNotEquals(user, null);
    }

    @Test
    public void shouldReturnFalseOnComparingWithNullUserID() {
        User user1 = new User("user1", "password1");
        User user2 = new User(null, "password1");

        assertNotEquals(user1, user2);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithDifferentClass() {
        User user = new User("user1", "password1");
        Library library = mock(Library.class);

        assertNotEquals(user, library);
    }

    @Test
    public void shouldReturnTrueOnComparingWithItself() {
        User user = new User("user1", "password1");

        assertEquals(user, user);
    }

    @Test
    public void shouldReturnFalseIfComparingUserIsNull() {
        User user1 = new User(null, "password1");
        User user2 = new User("user2", "password1");

        assertNotEquals(user1, user2);
    }

    @Test
    public void shouldReturnTrueOnComparingUserWithSameUserIDOnly() {
        User user1 = new User("user1", "password1");
        User user2 = new User("user1", null);

        assertEquals(user1, user2);
    }

    @Test
    public void shouldReturnFalseOnComparingDifferentUser() {
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        assertNotEquals(user1, user2);
    }

    @Test
    public void shouldReturnZeroOnComparingHashCodeWithNullUserID() {
        User user = new User(null, "password1");

        assertEquals(0, user.hashCode());
    }

    @Test
    public void shouldHaveSameHashCodeForSameUserIDs() {
        User user1 = new User("user1", "password1");
        User user2 = new User("user1", null);

        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    public void shouldHaveDifferentHashCodeForDifferentUserIDs() {
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        assertNotEquals(user1.hashCode(), user2.hashCode());
    }
}
