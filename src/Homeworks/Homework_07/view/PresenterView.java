package Homeworks.Homework_07.view;

import Homeworks.Homework_07.model.Note;
import Homeworks.Homework_07.presenter.NotesPresenter;

import java.util.List;

public abstract class PresenterView {
    public abstract void showMessage(String message);

    public abstract String getUserInput();

    public abstract void displayNotes(List<Note> notes);

    public abstract void setPresenter(NotesPresenter presenter);
}
