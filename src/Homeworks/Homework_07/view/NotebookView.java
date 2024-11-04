package Homeworks.Homework_07.view;

import Homeworks.Homework_07.presenter.NotesPresenter;

public interface NotebookView extends MessageView, NoteView, AuthorView, InputView {
    void setPresenter(NotesPresenter presenter);
}
