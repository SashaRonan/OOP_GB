package Homeworks.Homework_07.main;

import Homeworks.Homework_07.model.Note;
import Homeworks.Homework_07.model.Notebook;
import Homeworks.Homework_07.presenter.CommandHandler;
import Homeworks.Homework_07.presenter.NotesPresenter;
import Homeworks.Homework_07.service.FileOperationsImpl;
import Homeworks.Homework_07.view.ConsoleNotebookView;

public class Main {
    public static void main(String[] args) {
        Notebook<Note> notebook = new Notebook<>();
        ConsoleNotebookView view = new ConsoleNotebookView();
        FileOperationsImpl<Note> fileOperations = new FileOperationsImpl<>();
        NotesPresenter presenter = new NotesPresenter(notebook, view, view, view, view, fileOperations);
        CommandHandler commandHandler = new CommandHandler(presenter, view);
        commandHandler.handleUserInput();
    }
}

