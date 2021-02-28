package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class PosterManager {
    private MovieItem[] items = new MovieItem[0];

    public void add(MovieItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getAll(int maxOutMovie) {
        MovieItem[] result = new MovieItem[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < 6; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}