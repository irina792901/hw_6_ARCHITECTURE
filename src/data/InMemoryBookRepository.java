package data;

import domain.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBookRepository implements BookRepository {
    private Map<String, Book> books;

    /**
     * Создает новый экземпляр класса InMemoryBookRepository
     */
    public InMemoryBookRepository() {
        books = new HashMap<>();
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book.getId());
    }

    @Override
    public void printBook(Book book){
        System.out.println("Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
    }

    @Override
    public void printBooks(List<Book> books){
        for (Book book:books) {
            printBook(book);
        }
    }
}
