package Homeworks.Homework_07.service;

import Homeworks.Homework_07.model.Note;
import Homeworks.Homework_07.model.Notebook;

import java.io.*;

public class FileOperationsImpl <T extends Note> implements FileOperations<T>{
    @Override
    public void saveToFile(Notebook<T> notebook, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(notebook);
        }
    }

    public Notebook<T> loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Notebook<T>) ois.readObject();
        }
    }
}
