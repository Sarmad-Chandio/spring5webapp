package guru.springframework.spring5webapp.service;

import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //Over ride method from JPA : don't distrub the business logic of service
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
