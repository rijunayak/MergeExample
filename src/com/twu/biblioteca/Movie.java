//A movie has a name, year, director and rating which it can return as a string
package com.twu.biblioteca;

public class Movie {

    private String name;
    private int year;
    private String director;
    private String rating;

    public Movie(String name, int year, String director, String rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%40s%40d%40s%40s", name, year, director, rating);
    }
}
