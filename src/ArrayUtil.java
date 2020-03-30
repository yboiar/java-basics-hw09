import java.util.ArrayList;

/**
 * ArrayUtil exercises.
 */

public class ArrayUtil {

  /**
   * Finds the common elements between two arrays (String values).
   *
   * @param array1 first array
   * @param array2 second array
   * @return String array with common elements
   */
  public static String[] findCommon(String[] array1, String[] array2) {
    ArrayList<String> arrayList = new ArrayList<>();
    for (String string: array1) {
      for (String string2: array2) {
        if (string.equals(string2)) {
          arrayList.add(string);
        }
      }
    }
    return arrayList.toArray(new String[0]);
  }
}