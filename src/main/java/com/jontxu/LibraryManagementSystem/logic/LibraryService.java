package com.jontxu.LibraryManagementSystem.logic;

import com.jontxu.LibraryManagementSystem.data.Book;
import com.jontxu.LibraryManagementSystem.data.Creator;
import com.jontxu.LibraryManagementSystem.data.Library;
import com.jontxu.LibraryManagementSystem.data.Member;

import java.util.List;

public class LibraryService {
    private final Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    public List<Book> booksWrittenByAuthor(Creator creator){
        return library.getBooks().stream()
                .filter(item -> item.getCreator().equals(creator))
                .toList();
    }

    public List<Member> getMembersWith3Items(){
        return library.getMembers().stream()
                .filter(member -> member.getRentedItems().size() == 3)
                .toList();
    }

    public List<Creator> getCreatorsBornInThe90s(){
        return library.getCreators().stream()
                .filter(creator -> bornInThe90s(creator))
                .toList();
    }

    private static boolean bornInThe90s(Creator creator) {
        return creator.birthDate().getYear() >= 1990 && creator.birthDate().getYear() < 2000;
    }
}
