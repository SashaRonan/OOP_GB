package Homeworks.Homework_07.presenter;

import Homeworks.Homework_07.view.PresenterView;

public class CommandHandler {
    private NotesPresenter presenter;
    public PresenterView view;

    public CommandHandler(NotesPresenter presenter, PresenterView view) {
        this.presenter = presenter;
        this.view = view;
    }

    public void handleUserInput() {
        while (true) {
            view.showMessage("Enter command (add, list, sortByName, sortByBirthYear, save, load, exit):");
            String command = view.getUserInput();
            presenter.handleCommands(command);
        }
    }
}
