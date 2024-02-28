package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publishe) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository =publishe;
    }

    @Override
    public void run(String... args) throws Exception {
        // Alber Camus, the writer
        Author camus=new Author();
        camus.setFirstName("Albert");
        camus.setLastName("Camus");

        // Alber Camus Book "Stranger"
        Book stranger=new Book();
        stranger.setTitle("Stranger");
        stranger.setIsbn("225665889114");

        Author savedAuthorCamus=authorRepository.save(camus);
        Book savedBookStranger=bookRepository.save(stranger);

        // Franz kafka, the writer
        Author kafka = new Author();
        kafka.setFirstName("Franz");
        kafka.setLastName("kafka");

        // Franz kafka, book "The Metamorphosis"
        Book metamorphosis=new Book();
        metamorphosis.setTitle("The Metamorphosis");
        metamorphosis.setIsbn("159753654");

        Author savedAuthorKafka=authorRepository.save(kafka);
        Book savedBookMetamorphosis=bookRepository.save(metamorphosis);

        savedAuthorCamus.getBooks().add(savedBookStranger);
        savedAuthorKafka.getBooks().add(savedBookMetamorphosis);

        //The Metamorphosis , publisher
        Publisher publisherMetamorphosis=new Publisher();
        publisherMetamorphosis.setPublisherName("Simon & Schuster");
        publisherMetamorphosis.setAddress("Germany");
        Publisher savedPublisherMetamorphosis=publisherRepository.save(publisherMetamorphosis);

        //Stranger publisher
        Publisher publisherStranger= new Publisher();
        publisherStranger.setPublisherName("Alfred A. Knopf");
        publisherStranger.setAddress("U.K");
        Publisher savedPublisherStranger=publisherRepository.save(publisherStranger);


        savedBookMetamorphosis.setPublisher(savedPublisherMetamorphosis);
        savedBookStranger.setPublisher(savedPublisherStranger);


        authorRepository.save(savedAuthorCamus);
        authorRepository.save(savedAuthorKafka);
        bookRepository.save(savedBookMetamorphosis);
        bookRepository.save(savedBookStranger);


        System.out.println("in boorstrap data");
        System.out.println("Author Count: "+authorRepository.count());
        System.out.println("Book Count: "+bookRepository.count());


        System.out.println("Publisher Count: "+publisherRepository.count());






    }
}
