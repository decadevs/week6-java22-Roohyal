package org.example.services.implementation;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.example.enums.Gender;
import org.example.enums.Role;
import org.example.models.Book;
import org.example.models.Person;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {
    Person person = new Person("Tobi Bakre", 18,"S28", Gender.MALE, Role.SENIOR_STUDENT);
    Book book = new Book("Half of a Yellow Sun", true,2);
    Person librarian = new Person("Royal Mathias",32,"L28",Gender.FEMALE,Role.LIBRARIAN);

    LibraryServiceImpl libraryService = new LibraryServiceImpl();


    @Test
    void testRequestBookWhenBookIsAvailable() {
        String result = libraryService.requestBook(person,book);
        assertEquals("Tobi Bakre Has requested for Half of a Yellow Sun", result);
    }

    @Test
    void borrowBook() {
        assertNotNull(libraryService.borrowBook(book,librarian));
    }


    @Test
    void getBookOnFirstCome() {
        assertNotNull(libraryService.getBookOnFirstCome(book,librarian));
    }
}