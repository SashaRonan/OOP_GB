package Homeworks.Homework_06.view;

import Homeworks.Homework_06.model.Person;
import Homeworks.Homework_06.presenter.TreePresenter;

import java.util.List;

public abstract class PresenterView {
    public abstract void displayMessage(String message);

    public abstract String getUserInput();

    public abstract void displayPersons(List<Person> persons);

    public abstract void setPresenter(TreePresenter presenter);
}