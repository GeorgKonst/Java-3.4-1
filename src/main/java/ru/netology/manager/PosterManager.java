package ru.netology.manager;

import ru.netology.domain.MovieItem;


public class PosterManager {
    private MovieItem[] items = new MovieItem[0];
    private int defaultPosterLength = 10;
    private int customPosterLength;

    public PosterManager(){
    }

    public PosterManager(int customPosterLength){
        this.customPosterLength = customPosterLength;
    }

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getAll() {
        int length = items.length;

        if (customPosterLength == 0) {
            if (defaultPosterLength < length) {
                length = defaultPosterLength;
            }
        } else {
            if (customPosterLength < length) {
                length = customPosterLength;
            }
        }

        MovieItem[] result = new MovieItem[length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}