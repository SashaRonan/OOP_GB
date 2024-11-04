package Homeworks.Homework_07.presenter;

import Homeworks.Homework_07.service.FileOperations;
import Homeworks.Homework_07.model.Author;
import Homeworks.Homework_07.model.Note;
import Homeworks.Homework_07.model.Notebook;
import Homeworks.Homework_07.view.AuthorView;
import Homeworks.Homework_07.view.InputView;
import Homeworks.Homework_07.view.MessageView;
import Homeworks.Homework_07.view.NoteView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class NotesPresenter {

    private Notebook<Note> notebook;
    private MessageView messageView;
    private NoteView noteView;
    private AuthorView authorView;
    private InputView inputView;
    private FileOperations<Note> fileOperations;

    public NotesPresenter(Notebook<Note> notebook, MessageView messageView, NoteView noteView, AuthorView authorView, InputView inputView, FileOperations<Note> fileOperations) {
        this.notebook = notebook;
        this.messageView = messageView;
        this.noteView = noteView;
        this.authorView = authorView;
        this.inputView = inputView;
        this.fileOperations = fileOperations;
    }

    public void addNote(String text, Author author) {
        Note note = new Note(text, author);
        notebook.addNote(note);
        messageView.showMessage("Added notes" + text);
    }

    public void showAllNotes() {
        noteView.displayNotes(notebook.getNotes());
    }

    public void sortNotesByAuthor() {
        notebook.sortByAuthor();
        messageView.showMessage("Sorted notes by author");
        showAllNotes();
    }

    public void sortNotesByTime() {
        notebook.sortByTime();
        messageView.showMessage("Sorted notes by time");
        showAllNotes();
    }

    public void getNotesForDay() {
        List<Note> notesToday = notebook.getNotesForDay();
        noteView.displayNotes(notesToday);
    }

    public void getNotesForWeek() {
        List<Note> notesThisWeek = notebook.getNotesForWeek();
        noteView.displayNotes(notesThisWeek);
    }


    public void saveNotebook(String filename) {
        try {
            fileOperations.saveToFile(notebook, filename);
            messageView.showMessage("Saved notebook to " + filename);
        } catch (IOException e) {
            messageView.showMessage("Error saving notebook" + e.getMessage());
        }
    }

    public void loadNotebook(String filename) {
        try {
            notebook = fileOperations.loadFromFile(filename);
            messageView.showMessage("Loaded notes from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            messageView.showMessage("Failed to load notes from " + e.getMessage());
        }
    }

    public void handleCommands(String command) {
        switch (command) {
            case "add":
                messageView.showMessage("Enter author name");
                String name = inputView.getUserInput();
                Author author = new Author(name);
                messageView.showMessage("Enter note text");
                String note = inputView.getUserInput();
                addNote(note, author);
                break;

            case "list":
                showAllNotes();
                break;

            case "sortByAuthor":
                sortNotesByAuthor();
                break;

            case "sortByTime":
                sortNotesByTime();
                break;

            case "getNotesForDay":
                getNotesForDay();
                break;

            case "getNotesForWeek(":
                getNotesForWeek();
                break;

            case "save":
                messageView.showMessage("Enter file name");
                String filename = inputView.getUserInput();
                saveNotebook(filename);
                break;

            case "load":
                messageView.showMessage("Enter file name");
                loadNotebook(inputView.getUserInput());
                break;

            case "exit":
                messageView.showMessage("Exit program");
                System.exit(0);

            default:
                messageView.showMessage("Invalid command");
        }
    }
}
