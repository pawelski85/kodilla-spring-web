package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {
    @Test
    void testGetBooks() throws CloneNotSupportedException {
        //given
        //creating the books and assigning the set
        Library books = new Library("Drama books");
        Book book = new Book("Drama", "Mickiewicz", LocalDate.of(2020, 1, 1));
        Book book2 = new Book("Drama2", "Mickiewicz2", LocalDate.of(2021, 2, 2));
        books.getBooks().add(book);
        books.getBooks().add(book2);

        //making a shallow copy of object books
        Library clonedBooks = null;

            clonedBooks = books.shallowCopy();
            clonedBooks.setName("Books 2");


        //making a deep copy of object board
        Library deepClonedBooks = null;

            deepClonedBooks = books.deepCopy();
            deepClonedBooks.setName("Books 3");


        //When
        books.getBooks().remove(book);

        //Then
        System.out.println(books);
        System.out.println(clonedBooks);
        System.out.println(deepClonedBooks);
        assertEquals(1, books.getBooks().size());
        assertEquals(1, clonedBooks.getBooks().size());
        assertEquals(2, deepClonedBooks.getBooks().size());
        assertEquals(clonedBooks.getBooks(), books.getBooks());
        assertNotEquals(deepClonedBooks.getBooks(), books.getBooks());
    }
}
