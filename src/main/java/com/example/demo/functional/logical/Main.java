package com.example.demo.functional.utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static final String AUTHOR = "Rick Riordan";
    public static void main(final String[] args) {
        final List<Book> books = getBooks();

         
        // Stream API 1: list book's name, where author is "Rick Riordan"

        List<String> result1 = new ArrayList<>();
        
        books.forEach(b-> {
        	//b.getAuthors().stream().filter(a->a.getFullName().equals(AUTHOR)).collect(Collectors.toList());
			  for(Author a : b.getAuthors()) { if(a.getFullName().equals(AUTHOR)) {
			  result1.add(b.getName()); } }
        });
        
        List<String> bookName = books.stream()
        		.filter(b->b.getAuthors().stream().anyMatch(a->a.getFullName().equals(AUTHOR)))
        		.map(b->b.getName())
        		.collect(Collectors.toList());
        

        // Stream API 2: Result map, where
        // key is book type
        // and value is a list of book names sorted by isbn

        // final Map<String, List<String>> result2 = ...
    }

    private static List<Book> getBooks() {
        final Author suzanneCollins = new Author();
        suzanneCollins.setFirstName("Suzanne");
        suzanneCollins.setLastName("Collins");

        final Author rickRiordan = new Author();
        rickRiordan.setFirstName("Rick");
        rickRiordan.setLastName("Riordan");

        final Author rickGolding = new Author();
        rickGolding.setFirstName("Rick");
        rickGolding.setLastName("Golding");

        final Book book1 = new Book();
        book1.setIsbn("11111111");
        book1.setName("Harry Potter and the Order of the Phoenix");
        book1.setType("Fantastic");
        book1.setAuthors(Collections.singletonList(suzanneCollins));

        final Book book2 = new Book();
        book2.setIsbn("22222222");
        book2.setName("The Little Prince");
        book2.setType("Fantastic");
        book2.setAuthors(Collections.singletonList(rickRiordan));

        final Book book3 = new Book();
        book3.setIsbn("33333333");
        book3.setName("Lord of the Flies");
        book3.setType("Child");
        final List<Author> authors3 = new LinkedList<>();
        authors3.add(rickGolding);
        authors3.add(rickRiordan);
        book3.setAuthors(authors3);

        final List<Book> books = new LinkedList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        return books;
    }

    static class Book {

        private String isbn;
        private String name;
        private String type;
        private List<Author> authors;

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(final String isbn) {
            this.isbn = isbn;
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public List<Author> getAuthors() {
            return authors;
        }

        public void setAuthors(final List<Author> authors) {
            this.authors = authors;
        }

        public String getType() {
            return type;
        }

        public void setType(final String type) {
            this.type = type;
        }
    }

    static class Author {

        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(final String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(final String lastName) {
            this.lastName = lastName;
        }
        
        public String getFullName() {
        	return firstName +" " +lastName;
        }
    }
}
