package Homeworks.Homework_05.main;

import Homeworks.Homework_05.model.FamilyTree;
import Homeworks.Homework_05.model.Person;
import Homeworks.Homework_05.presenter.TreePresenter;
import Homeworks.Homework_05.service.FileOperationsImpl;
import Homeworks.Homework_05.view.ConsoleTreeView;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Person> familyTree = new FamilyTree<>();
        ConsoleTreeView view = new ConsoleTreeView();
        FileOperationsImpl<Person> fileOperations = new
                FileOperationsImpl<>();
        TreePresenter presenter = new TreePresenter(familyTree,
                view, fileOperations);
        presenter.handleUserInput();
    }

}
