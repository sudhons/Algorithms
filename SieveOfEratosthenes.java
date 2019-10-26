import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SieveOfEratosthenes {
  static List<Integer> getPrimes(List<Integer> integerList) {
    List<Integer> primeList = new ArrayList<>();

    while (!integerList.isEmpty()) {
      int frontInt = integerList.remove(0);
      primeList.add(frontInt);

      Iterator<Integer> iterator = integerList.iterator();

      while (iterator.hasNext()) {
        int nextInt = iterator.next();
        if (nextInt % frontInt == 0)
          iterator.remove();
      }
    }

    return primeList;
  }
}
