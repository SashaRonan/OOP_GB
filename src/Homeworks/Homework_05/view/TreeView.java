package Homeworks.Homework_05.view;

import Homeworks.Homework_05.model.Person;
import Homeworks.Homework_05.presenter.TreePresenter;

import java.util.List;

public interface TreeView {
    void displayMessage(String message);
    void displayPersons(List<Person> persons);
    String getUserInput();
    void setPresenter(TreePresenter presenter);
}
