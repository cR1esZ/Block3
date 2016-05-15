package com.epam.traine;

import com.epam.traine.controller.Controller;
import com.epam.traine.model.NoteBook;
import com.epam.traine.view.View;

/**
 * Created by andreyholovan on 5/15/16.
 */
public class Main {


    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        View view = new View();
        Controller controller = new Controller(noteBook,view);
        controller.processUser();


//        ^[A-Za-z]+\\s[A-Za-z]\.(\s[A-Za-z]\.)?$
//        String regex = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
//        String str = "GolovanAndreyVitalievich";
//
//        boolean flag = false;
//
//        flag = str.matches(regex);
//
//        System.out.println(flag);

    }
}
