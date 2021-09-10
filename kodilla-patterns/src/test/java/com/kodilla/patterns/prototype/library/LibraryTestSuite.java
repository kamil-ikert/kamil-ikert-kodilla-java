package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        Book book1 = new Book("Room 1408", "Stephen King", LocalDate.of(1996,4,15));
        Book book2 = new Book("Red Carpet", "Stephen King", LocalDate.of(1999,12,5));
        Book book3 = new Book("Telephone", "Stephen King", LocalDate.of(2004,1,27));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //shallow
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
