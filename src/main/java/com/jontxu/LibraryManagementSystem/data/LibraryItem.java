package com.jontxu.LibraryManagementSystem.data;

public abstract class LibraryItem {
    private final int uniqueId;
    private final String title;
    private final Creator creator;


    public LibraryItem(int uniqueId, String title, Creator creator) {
        this.uniqueId = uniqueId;
        this.title = title;
        this.creator = creator;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public String getTitle() {
        return title;
    }

    public Creator getCreator() {
        return creator;
    }
}
