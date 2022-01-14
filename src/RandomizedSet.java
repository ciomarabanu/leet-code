import java.util.*;

public class RandomizedSet {

    private List<Integer> elems = new ArrayList<>();
    private Map<Integer, Integer> elemToIdx = new HashMap<>();
    private Random randomIdx = new Random();

    public boolean insert(int val) {
        if (elemToIdx.containsKey(val))
            return false;
        else {
            elems.add(val);
            elemToIdx.put(val, elems.size() - 1);
            return true;
        }
    }

    public boolean remove(int val) {
        if (!elemToIdx.containsKey(val))
            return false;
        else {
            var last = elems.remove(elems.size() - 1);
            var idx = elemToIdx.remove(val);
            if (val != last) {
                elems.set(idx, last);
                elemToIdx.put(last, idx);
            }
            return true;
        }
    }

    public int getRandom() {
        return elems.get(randomIdx.nextInt(elems.size()));
    }
}
