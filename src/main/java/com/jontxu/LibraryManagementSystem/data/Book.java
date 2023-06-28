package com.jontxu.LibraryManagementSystem.data;

public class Book extends LibraryItem {
    private final String isbn;
    public Book(int uniqueId, String title, Creator creator, String isbn) {
        super(uniqueId, title, creator);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
