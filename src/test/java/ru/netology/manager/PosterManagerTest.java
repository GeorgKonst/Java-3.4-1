package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    private PosterManager manager = new PosterManager();
    private MovieItem movie1 = new MovieItem(1, "Name1", "Url1", "Genre1");
    private MovieItem movie2 = new MovieItem(2, "Name2", "Url2", "Genre2");
    private MovieItem movie3 = new MovieItem(3, "Name3", "Url3", "Genre3");
    private MovieItem movie4 = new MovieItem(4, "Name4", "Url4", "Genre4");
    private MovieItem movie5 = new MovieItem(5, "Name5", "Url5", "Genre5");
    private MovieItem movie6 = new MovieItem(6, "Name6", "Url6", "Genre6");
    private MovieItem movie7 = new MovieItem(7, "Name7", "Url7", "Genre7");
    private MovieItem movie8 = new MovieItem(8, "Name8", "Url8", "Genre8");
    private MovieItem movie9 = new MovieItem(9, "Name9", "Url9", "Genre9");
    private MovieItem movie10 = new MovieItem(10, "Name10", "Url10", "Genre10");
    private MovieItem movie11 = new MovieItem(11, "Name11", "Url11", "Genre11");


    @BeforeEach
    public void setUp() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
    }


    @Test
    public void shouldCheckOfTheLastFilms() {
        //В массиве 10 фильмов
        manager.add(movie10);
        MovieItem[] actual = manager.getAll(10);
        int expected = 10;
        assertEquals(expected, actual.length);
    }

    @Test
    public void shouldListMovieOverLimit() {
        //В массиве 11 фильмов
        manager.add(movie10);
        manager.add(movie11);
        MovieItem[] actual = manager.getAll(9);
        int expected = 10;
        assertEquals(expected, actual.length);
    }
    @Test
    public void shouldListMovieLoverLimit() {
        //В массиве 9 фильмов
        MovieItem[] actual = manager.getAll(10);
        int expected = 9;
        assertEquals(expected, actual.length);
    }
}

//    @Test
//    public void shouldRemoveIfExists() {
//        int idToRemove = 1;
 //       manager.removeById(idToRemove);

//        PurchaseItem[] actual = manager.getAll();
//        PurchaseItem[] expected = new PurchaseItem[]{third, second};

//    assertEquals(expected, actual);
//        assertArrayEquals(expected, actual);