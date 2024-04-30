package ru.vsu.cs.course1.tree.console;

import ru.vsu.cs.course1.tree.bst.avl.AVLTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        AVLTreeMap<String,Integer> myAVLm = new AVLTreeMap<>();
        taskLogic(tm);
        taskLogic(myAVLm);
    }

    public static void taskLogic(Map<String, Integer> m) {
        /*
            Пишите логику вашего таска здесь
         */
        m.put("a", 1);
        System.out.println(m.get("a"));
    }
}
