package com.jontxu.LibraryManagementSystem.data;

public class CD extends LibraryItem {
    private final int amountOfTracks;
    public CD(int uniqueId, String title, Creator creator, int amountOfTracks) {
        super(uniqueId, title, creator);
        this.amountOfTracks = amountOfTracks;
    }

    public int getAmountOfTracks() {
        return amountOfTracks;
    }
}
