package Homeworks.Homework_07.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Notebook<T extends Note> implements Serializable {
    private List<T> notes;

    public void addNote(T note) {
        notes.add(note);
    }

    public List<T> getNotes() {
        return new ArrayList<>(notes);
    }

    public void sortByAuthor() {
        notes.sort(Comparator.comparing(note -> note.getAuthor().getName()));
    }

    public void sortByTime() {
        notes.sort(Comparator.comparing(Note::getTime));
    }
}
