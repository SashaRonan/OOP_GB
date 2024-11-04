package Homeworks.Homework_07.view;

import Homeworks.Homework_07.model.Author;
import Homeworks.Homework_07.model.Note;
import Homeworks.Homework_07.presenter.NotesPresenter;

import java.util.List;
import java.util.Scanner;

public class ConsoleNotebookView extends PresenterView implements NotebookView {
    private NotesPresenter presenter;
    private Scanner scanner;

    public ConsoleNotebookView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void displayNotes(List<Note> notes) {
        for (Note note : notes) {
            System.out.println(note.getAuthor() + ": " + note.getText() + ".\n Created at: " + note.getTime());
        }
    }

    @Override
    public void displayAuthors(List<Author> authors) {
        for (Author author : authors) {
            System.out.println("Автор: " + author);
        }
    }

    @Override
    public String getUserInput() {
        return scanner.nextLine();
    }

    @Override
    public void setPresenter(NotesPresenter presenter) {
        this.presenter = presenter;
    }

}
