import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ProductManagerTest {


    @Test
    public void testAdd() {
        String film1 = "filmI";
        String film2 = "filmII";
        String film3 = "filmIII";

        ProductManager manager = new ProductManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {film1, film2, film3};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllLimit() {
        String film1 = "filmI";
        String film2 = "filmII";
        String film3 = "filmIII";
        String film4 = "filmIV";
        String film5 = "filmV";
        String film6 = "filmVI";
        String film7 = "filmVII";
        String film8 = "filmVIII";
        String film9 = "filmIX";
        String film10 = "filmX";


        ProductManager manager = new ProductManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLessLimit() {
        String film1 = "filmI";
        String film2 = "filmII";
        String film3 = "filmIII";

        ProductManager manager = new ProductManager(10);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit() {
        String film1 = "filmI";
        String film2 = "filmII";
        String film3 = "filmIII";
        String film4 = "filmIV";
        String film5 = "filmV";
        String film6 = "filmVI";
        String film7 = "filmVII";
        String film8 = "filmVIII";
        String film9 = "filmIX";
        String film10 = "filmX";

        ProductManager manager = new ProductManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoreLimit() {
        String film1 = "filmI";
        String film2 = "filmII";
        String film3 = "filmIII";
        String film4 = "filmIV";
        String film5 = "filmV";
        String film6 = "filmVI";
        String film7 = "filmVII";
        String film8 = "filmVIII";
        String film9 = "filmIX";
        String film10 = "filmX";
        String film11 = "filmXI";

        ProductManager manager = new ProductManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}

