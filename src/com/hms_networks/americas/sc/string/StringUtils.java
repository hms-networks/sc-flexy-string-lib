package com.hms_networks.americas.sc.string;

/**
 * Class providing utilities for working with and manipulating {@link String} objects.
 *
 * @author HMS Networks, MU Americas Solution Center
 * @since 1.1
 */
public class StringUtils {

  /**
   * Method to replace all instances of <code>target</code> with <code>replacement</code> in <code>
   * string
   * </code> and return the result.
   *
   * @param string string to modify
   * @param target to replace
   * @param replacement replacement
   * @return string with replacement completed
   * @since 1.0
   * @throws NullPointerException if any string parameters are null
   */
  public static String replace(String string, String target, String replacement) {
    // Throw NullPointerException if any supplied strings are null
    if (string == null || target == null || replacement == null) throw new NullPointerException();

    // Create String buffer for building the modified string
    StringBuffer stringBuffer = new StringBuffer();

    // Loop through each character in -string-
    for (int x = 0; x < string.length(); ) {
      // Search for an instance of -target- in -string-
      int indexOfTarget = string.indexOf(target, x);

      // Perform replacement if at start index
      if (x == indexOfTarget) {
        stringBuffer.append(replacement);
        x += target.length();
      } else {
        // Append character and move to next
        stringBuffer.append(string.charAt(x++));
      }
    }

    // Return modified string
    return stringBuffer.toString();
  }
}
