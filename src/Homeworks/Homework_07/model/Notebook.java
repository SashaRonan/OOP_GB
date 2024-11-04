package Homeworks.Homework_07.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Notebook<T extends Note> implements Serializable {

    private List<T> notebook = new ArrayList<>();

    public void addNote(T note) {
        notebook.add(note);
    }

    public List<T> getNotes() {
        return new ArrayList<>(notebook);
    }

    public void sortByAuthor() {
        notebook.sort(Comparator.comparing(note -> note.getAuthor().getName()));
    }

    public void sortByTime() {
        notebook.sort(Comparator.comparing(Note::getTime));
    }

    public List<T> getNotesForDay() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime startOfDay = now.toLocalDate().atStartOfDay();
        LocalDateTime endOfDay = startOfDay.plusDays(1);
        List<T> notesForDay = new ArrayList<>();

        for (T note : notebook) {
            LocalDateTime noteTime = note.getTime();
            if (noteTime.isAfter(startOfDay) && noteTime.isBefore(endOfDay)) {
                notesForDay.add(note);
            }
        }
        return notesForDay;
    }

    public List<T> getNotesForWeek() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime startOfWeek = now.minusDays(now.getDayOfWeek().getValue() - 1).toLocalDate().atStartOfDay();
        LocalDateTime endOfWeek = startOfWeek.plusWeeks(1);
        List<T> notesForWeek = new ArrayList<>();

        for (T note : notebook) {
            LocalDateTime noteTime = note.getTime();
            if (noteTime.isAfter(startOfWeek) && noteTime.isBefore(endOfWeek)) {
                notesForWeek.add(note);
            }
        }

        return notesForWeek;
    }

}
