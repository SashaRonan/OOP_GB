package Homeworks.Homework_06.main;

import Homeworks.Homework_06.model.FamilyTree;
import Homeworks.Homework_06.model.Person;
import Homeworks.Homework_06.presenter.CommandHandler;
import Homeworks.Homework_06.presenter.TreePresenter;
import Homeworks.Homework_06.service.FileOperationsImpl;
import Homeworks.Homework_06.view.ConsoleTreeView;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Person> familyTree = new FamilyTree<>();
        ConsoleTreeView view = new ConsoleTreeView();
        FileOperationsImpl<Person> fileOperations = new FileOperationsImpl<>();
        TreePresenter presenter = new TreePresenter(familyTree, view, view, view, fileOperations);
        CommandHandler commandHandler = new CommandHandler(presenter, view);
        commandHandler.handleUserInput();
    }
}
