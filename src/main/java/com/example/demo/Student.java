package com.example.demo;

public class Student {
    private String name;
    private long id;
    private String album;
    private String artist;
    private int rating;
    private int year;

    public Student() {
    }

    public Student(String name, long id, String album, String artist, int rating, int year) {
        this.name = name;
        this.id = id;
        this.album = album;
        this.artist = artist;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

