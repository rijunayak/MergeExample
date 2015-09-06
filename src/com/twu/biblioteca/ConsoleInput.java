//A console input takes an input from console and returns it
package com.twu.biblioteca;

import java.util.Scanner;

public class ConsoleInput implements Input {

    @Override
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
