package com.hchhabada.giflib.model;

import java.time.LocalDate;

public class Gif {
    private String Name;
    private LocalDate localDate;
    private String username;
    private boolean favourite;

    public Gif(String name, LocalDate localDate, String username, boolean favourite) {
        Name = name;
        this.localDate = localDate;
        this.username = username;
        this.favourite = favourite;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
