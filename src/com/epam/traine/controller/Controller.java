package com.epam.traine.controller;

import com.epam.traine.model.Address;
import com.epam.traine.model.Group;
import com.epam.traine.model.NoteBook;
import com.epam.traine.model.User;
import com.epam.traine.view.IView;
import com.epam.traine.view.View;


import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by andreyholovan on 5/15/16.
 */
public class Controller {
    private NoteBook noteBook;
    private View view;

    public Controller(NoteBook noteBook, View view) {
        this.noteBook = noteBook;
        this.view = view;
    }


    public void processUser(){
        System.out.println("create data");
        Scanner scanner = new Scanner(System.in);


        String fullName     = inputStringValueWithScanner(scanner, RegexExpressions.FULL_NAME_REGEX, IView.FULL_NAME);
        String nickName     = inputStringValueWithScanner(scanner, RegexExpressions.NICK_NAME, IView.NICKNAME);
        String comment      = inputStringValueWithScanner(scanner,"","");
        Group group         = Group.valueOf(inputStringValueWithScannerForGroup(scanner,IView.GROUP));
        String homePhone    = inputStringValueWithScanner(scanner,RegexExpressions.PHONE,IView.HOME_PHONE);
        String mobilePhone  = inputStringValueWithScanner(scanner,RegexExpressions.PHONE,IView.MOBILE_PHONE);
        String email        = inputStringValueWithScanner(scanner,RegexExpressions.REGEX_MAIL,IView.EMAIL);
        String skype        = inputStringValueWithScanner(scanner,RegexExpressions.NICK_NAME,IView.SKYPE);
        Address address     = address(scanner);

        noteBook.save(new User(fullName,fullName,fullName,nickName,comment,group,
                homePhone,mobilePhone,email,skype,address));


    }


    public Address address(Scanner scanner){
         String index = inputStringValueWithScanner(scanner,RegexExpressions.INDEX,IView.INDEX);
         String city = inputStringValueWithScanner(scanner,RegexExpressions.CITY_STREET, IView.CITY);
         String street = inputStringValueWithScanner(scanner,RegexExpressions.CITY_STREET,IView.CITY);
         String houseNumber = inputStringValueWithScanner(scanner,"","");
         String apartmentNumber = inputStringValueWithScanner(scanner,"","");
        return new Address(index, city, street, houseNumber, apartmentNumber);
    }

    public boolean validGroup(String input){
        for (Group group : Group.values()){
            if (group.name().equals(input)){
                return true;
            }
        }
        return false;
    }


    public boolean validData(String input, String regex){
        return Pattern.matches(regex, input);
    }

    public String inputStringValueWithScanner(Scanner scanner, String regex, String wrongMessage){
        String tmp = scanner.nextLine();
        if (validData(tmp,regex)){
            return tmp;
        } else {
            view.printMessage(wrongMessage);
            return inputStringValueWithScanner(scanner,regex,wrongMessage);
        }


    }

    public String inputStringValueWithScannerForGroup(Scanner scanner, String wrongMessage){
        String tmp = scanner.nextLine();
        if (validGroup(tmp)){
            return tmp;
        } else {
            view.printMessage(wrongMessage);
            return inputStringValueWithScannerForGroup(scanner, wrongMessage);
        }
    }

}
