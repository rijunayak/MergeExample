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
        if(isNumberBetweenOneAndTen(rating)) {
            this.rating = rating;
        } else {
            this.rating = "unrated";
        }
    }

    @Override
    public String toString() {
        return String.format("%40s%40d%40s%40s", name, year, director, rating);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;

        Movie thatMovie = (Movie) that;

        if(name != null && thatMovie.name != null) {
            return name.equals(thatMovie.name);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    private boolean isNumberBetweenOneAndTen(String rating) {
        if(isNumeric(rating)) {
            int ratingNumber = Integer.parseInt(rating);
            if(ratingNumber >= 1 && ratingNumber <= 10) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumeric(String rating) {
        try {
            Integer.parseInt(rating);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
