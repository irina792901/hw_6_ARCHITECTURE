package data;


import domain.Book;

import java.util.ArrayList;
import java.util.List;

public interface BookRepository {
    /**
     * Получает список книг из репозитория
     *
     * @return список всех книг
     */
    List<Book> getAllBooks();

    /**
     * Удаляет книгу из репозитория
     * @param book книга, которую необходимо убрать
     */
    void removeBook(Book book);

    /**
     * Добавляет книгу в репозиторий
     * @param book книга для добавления
     */
    void addBook(Book book);

    /**
     * Печатает параметры книги
     * @param book
     */
    void printBook(Book book);

    /**
     * Печатает все книги в репозитории
     * @param books
     */
    void printBooks(List<Book> books);
}
