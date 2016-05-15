package com.epam.traine.controller;

/**
 * Created by andreyholovan on 5/15/16.
 */
public interface RegexExpressions {
    String REGEX_MAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    String PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    String FULL_NAME_REGEX = "^\\p{Upper}{1}\\p{Lower}+\\s\\p{Upper}{1}\\p{Lower}+\\s\\p{Upper}{1}\\p{Lower}+$";
    String NICK_NAME = "^[A-Za-z]+$";
    String INDEX = "^[0-9]{5}$";
    String CITY_STREET = "^\\p{Upper}{1}\\p{Lower}+$";

}
