package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    PosterManager manager;
    PosterManager managerCustom;
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
        manager = new PosterManager();
        managerCustom = new PosterManager(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        managerCustom.add(movie1);
        managerCustom.add(movie2);
        managerCustom.add(movie3);
        managerCustom.add(movie4);
        managerCustom.add(movie5);
    }


    @Test
    public void shouldGetTen() {
        manager.add(movie10);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetEleven() {
        manager.add(movie10);
        manager.add(movie11);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetNinth() {
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetCustomInSix() {
        managerCustom.add(movie6);
        MovieItem[] actual = managerCustom.getAll();
        MovieItem[] expected = new MovieItem[]{movie6, movie5, movie4, movie3, movie2};
        assertArrayEquals(expected, actual);
    }

}