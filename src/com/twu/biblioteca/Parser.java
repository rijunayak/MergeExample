// A parser takes an input and returns a menu item
package com.twu.biblioteca;

public interface Parser {

    MenuItem parseMenuOptionInput(Library library);
}
