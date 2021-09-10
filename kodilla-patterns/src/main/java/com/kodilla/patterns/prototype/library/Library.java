package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

     private String name;
     private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        clonedLibrary.books.addAll(getBooks());
        return clonedLibrary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {

        StringBuilder x = new StringBuilder(name + "\n");
        for (Book theBook : books) {
            x = x.append(theBook.toString());
        }
        return x.toString();
    }
}
