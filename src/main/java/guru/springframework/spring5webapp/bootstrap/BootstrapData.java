package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author camus=new Author();
        camus.setFirstName("Albert");
        camus.setLastName("Camus");

        Book stranger=new Book();
        stranger.setTitle("Stranger");
        stranger.setIsbn("225665889114");

        Author savedAuthorCamus=authorRepository.save(camus);
        Book savedBookStranger=bookRepository.save(stranger);

        Author kafka = new Author();
        kafka.setFirstName("Franz");
        kafka.setLastName("kafka");

        Book metamorphosis=new Book();
        metamorphosis.setTitle("The Metamorphosis");
        metamorphosis.setIsbn("159753654");

        Author savedAuthorKafka=authorRepository.save(kafka);
        Book savedBookMetamorphosis=bookRepository.save(metamorphosis);

        savedAuthorCamus.getBooks().add(savedBookStranger);
        savedAuthorKafka.getBooks().add(savedBookMetamorphosis);

        System.out.println("in boorstrap data");
        System.out.println("Author Count: "+authorRepository.count());
        System.out.println("Book Count: "+bookRepository.count());





    }
}
