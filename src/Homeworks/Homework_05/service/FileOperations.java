package Homeworks.Homework_05.service;

import Homeworks.Homework_05.model.FamilyTree;

import java.io.IOException;
public interface FileOperations<T> {
    void saveToFile(FamilyTree<T> familyTree, String fileName)
            throws IOException;
    FamilyTree<T> loadFromFile(String fileName) throws IOException,
            ClassNotFoundException;
}
