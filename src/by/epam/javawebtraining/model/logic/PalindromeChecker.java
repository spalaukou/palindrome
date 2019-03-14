package by.epam.javawebtraining.model.logic;

import org.apache.log4j.Logger;

import java.util.Stack;

/**
 * @author Stanislau Palaukou on 13.03.2019
 * @project Palindrome
 */

public class PalindromeChecker {

  private static final Logger LOGGER;

  static {
    LOGGER = Logger.getRootLogger();
  }

  public static boolean isPalindrome(String string) {
    LOGGER.trace("Method isPalindrome starts");

    char[] array = string.toCharArray();

    Stack stack = new Stack();

    int count = array.length / 2;

    LOGGER.trace("Pushing in stack begins");
    for (int i = 0; i < array.length / 2; i++) {

      if (i < array.length / 2) {
        LOGGER.trace("Push in stack: element " + i + " = '" + array[i] + "'");
        stack.push(array[i]);
      }
    }

    count += ((array.length % 2) == 0 ? 0 : 1);

    LOGGER.trace("Second loop begins");
    for (int i = count; i < array.length; i++) {
      LOGGER.trace("Matching elements: " + stack.peek() + " ? " + array[i]);

      if (!stack.pop().equals(array[i])) {
        LOGGER.trace("String is not a palindrome");
        return false;
      }
    }

    LOGGER.trace("String is a palindrome");
    return true;
  }
}
