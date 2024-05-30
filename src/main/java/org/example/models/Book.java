
package org.example.models;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String bookTitle;
    private int currentNoOfCopies;
    private boolean isAvailable;

//CONSTRUCTOR
    public Book(String bookTitle,boolean isAvailable, int currentNoOfCopies) {
        this.bookTitle = bookTitle;
        this.isAvailable = isAvailable;
        this.currentNoOfCopies = currentNoOfCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", currentNoOfCopies=" + currentNoOfCopies +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
