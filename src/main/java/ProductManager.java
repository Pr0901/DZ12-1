public class ProductManager {

    private int limit;

    private String[] films = new String[0];

    public ProductManager() {

        this.limit = 10;
    }

    public ProductManager(int limit) {

        this.limit = limit;
    }


    public void addFilm(String newFilm) {

        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

    public String[] findAll() {

        return films;
    }


    public String[] findLast() {

        int sumFilms;
        if (films.length < limit) {
            sumFilms = films.length;
        } else {
            sumFilms = limit;
        }
        String[] tmp = new String[sumFilms];
        for (int i = 0; i < sumFilms; i++) {

            tmp[i] = films[sumFilms - 1 - i];
        }
        return tmp;
    }
}
