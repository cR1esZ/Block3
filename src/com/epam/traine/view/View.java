package com.epam.traine.view;


import com.epam.traine.model.Group;

/**
 * Created by andreyholovan on 5/15/16.
 */
public class View {

    public void printMessage(String message){
        System.out.println(message);
    }


    public void printGroups(Enum<?>[] group) {
        for (Enum groups : group){
            System.out.print(groups + " ");
        }
    }

}
