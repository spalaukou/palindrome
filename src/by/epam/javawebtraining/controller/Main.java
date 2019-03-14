package by.epam.javawebtraining.controller;

import by.epam.javawebtraining.model.logic.PalindromeChecker;
import org.apache.log4j.Logger;

/**
 * @author Stanislau Palaukou on 13.03.2019
 * @project Palindrome
 */

public class Main {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        String toCheck = "123456789101987654321";

        LOGGER.trace("Result = " + PalindromeChecker.isPalindrome(toCheck));
    }

}
