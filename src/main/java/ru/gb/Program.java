package ru.gb;

//1. Написать функцию, создающую резервную копию всех файлов
//        в директории(без поддиректорий) во вновь созданную папку ./backup

//2. Доработайте класс Tree и метод print который мы разработали на семинаре.
//        Ваш метод должен распечатать полноценное дерево директорий
//        и файлов относительно корневой директории.

//3***. Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
//        и представляют собой, например, состояния ячеек поля для игры в крестикинолики,
//        где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
//        Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
//        Записать в файл 9 значений так, чтобы они заняли три байта

import java.io.File;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        // Первое задание
        Backup backup = new Backup();
        String backupFrom = "C:/Users/login-16/Desktop/отсюда/";
        String backupTo = "./backup";
        File fileFrom = new File(backupFrom);
        File fileTo = new File(backupTo);
        backup.startBackup(fileFrom, fileTo);

        // Второе задание
        Tree tree = new Tree();
        tree.print(new File("."), "", true);

        //Третье задание
        ThreeBytes threeBytes = new ThreeBytes();
        byte[] arrayField = {101, 121, 100};
        threeBytes.write(arrayField);
    }
}

