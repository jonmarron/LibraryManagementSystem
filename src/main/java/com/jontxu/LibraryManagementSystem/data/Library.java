package com.jontxu.LibraryManagementSystem.data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library {
    private final List<Book> books;
    private final List<CD> cds;
    private final List<Member> members;
    private final Set<Creator> creators;

    public Library(List<Book> books, List<CD> cds, List<Member> members) {
        this.books = books;
        this.cds = cds;
        this.members = members;
        creators = new HashSet<>();
    }

    public void addCreatorFromItem(LibraryItem item) {
        creators.add(item.getCreator());
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<CD> getCds() {
        return cds;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void addBook(Book book) {
        books.add(book);
        addCreatorFromItem(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addCD(CD cd) {
        cds.add(cd);
        addCreatorFromItem(cd);
    }

    public void removeCD(CD cd) {
        cds.remove(cd);
    }

    public Set<Creator> getCreators() {
        return creators;
    }
}
