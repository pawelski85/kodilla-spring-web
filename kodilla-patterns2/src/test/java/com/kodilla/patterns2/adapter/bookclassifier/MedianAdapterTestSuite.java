package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianAdapterTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Mickiewicz", "Pan Tadeusz", 2012, "lektura1"));
        books.add(new Book("Sienkiewicz", "Krzyzacy", 2015, "lektura2"));
        books.add(new Book("J. K. Rowling", "Harry Potter", 1997, "lektura3"));
        books.add(new Book("Sienkiewicz", "Potop", 2019, "lektura4"));

        //When
        double median = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2015, median, 0);
    }
}
