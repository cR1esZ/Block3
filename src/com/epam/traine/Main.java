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


    }
}
