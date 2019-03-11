package com.step.classroom.day7;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private List<Integer> elements;
    private int currentIndex = -1;

    public ListIterator(List<Integer> elements) {
        this.elements = elements;
    }

    public boolean hasNext() {
        return currentIndex < elements.size() - 1;
    }

    public Integer next() {
        if (hasNext()) {
            return this.elements.get(++currentIndex);
        }
        throw new NoSuchElementException();
    }

}
