package com.jontxu.LibraryManagementSystem.logic;

import com.jontxu.LibraryManagementSystem.data.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {
    @BeforeAll
    void prepareContents(){
        List<Book> books = List.of(new Book(1, "title1", new Creator(CreatorType.AUTHOR, "author1", "spanish", LocalDate.now()), "12s3f5d46fs8d"));
        List<CD> cds = List.of(new CD(2, "title2", new Creator(CreatorType.ARTIST, "artist1", "italy", LocalDate.now()), 10));
        List<Member> members = List.of(new Member("jon", "address1", 1234));
        Library library = new Library(books, cds, members);
        new LibraryService(library);
    }
    @Test
    void booksWrittenByAuthor() {
    }

    @Test
    void getMembersWith3Items() {
    }

    @Test
    void getCreatorsBornInThe90s() {
    }
}