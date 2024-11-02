package Homeworks.Homework_06.view;

import Homeworks.Homework_06.model.Person;
import Homeworks.Homework_06.presenter.TreePresenter;

import java.util.List;

public interface TreeView extends MessageView, PersonView, InputView {
    void setPresenter(TreePresenter presenter);
}
