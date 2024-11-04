package Homeworks.Homework_07.service;

import Homeworks.Homework_07.model.Note;
import Homeworks.Homework_07.model.Notebook;

import java.io.IOException;

public interface FileOperations<T extends Note> {
    void saveToFile(Notebook<T> notebook, String fileName) throws IOException;
    Notebook<T> loadFromFile(String fileName) throws IOException, ClassNotFoundException;
}
