package org.example.services;

import org.example.models.Book;
import org.example.models.Library;
import org.example.models.Person;

public interface LibraryService {

 public String requestBook( Person person, Book book );

 public String borrowBook( Book book, Person librarian);

 void addToQueueOnFirstCome(Person person);

 String getBookOnFirstCome(Book bookTitle, Person librarian);


}
