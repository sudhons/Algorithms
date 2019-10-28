import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * DuplicateLists
 */
public class DuplicateLists {
  public static <T extends Comparable<? super T>> List<T> getDuplicates(List<T> list1, List<T> list2) {
    List<T> result = new ArrayList<>();
    int index1 = 0;
    int index2 = 0;
    final int list1Size = list1.size();
    final int list2Size = list2.size();

    Collections.sort(list1);
    Collections.sort(list2);

    while (index1 < list1Size && index2 < list2Size) {
      int compareResult = list1.get(index1).compareTo(list2.get(index2));

      if (compareResult < 0)
        index1 += 1;
      else if (compareResult > 0)
        index2 += 1;
      else {
        result.add(list1.get(index1));
        index1 += 1;
        index2 += 1;
      }
    }

    return result;
  }

  public static <T extends Comparable<? super T>> List<T> getUniques(List<T> list1, List<T> list2) {
    List<T> result = new ArrayList<>();
    int index1 = 0;
    int index2 = 0;
    final int list1Size = list1.size();
    final int list2Size = list2.size();

    Collections.sort(list1);
    Collections.sort(list2);

    while (index1 < list1Size && index2 < list2Size) {
      int compareResult = list1.get(index1).compareTo(list2.get(index2));

      if (compareResult < 0) {
        result.add(list1.get(index1));
        index1 += 1;
      } else if (compareResult > 0) {
        result.add(list2.get(index2));
        index2 += 1;
      } else {
        index1 += 1;
        index2 += 1;
      }
    }

    while (index1 < list1Size) {
      result.add(list1.get(index1));
      index1 += 1;
    }
    while (index2 < list2Size) {
      result.add(list2.get(index2));
      index2 += 1;
    }

    return result;
  }
}
