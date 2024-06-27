import java.util.HashSet;
import java.util.Iterator;

public class SetDiTest {
    private HashSet<String> set;

    public SetDiTest() {
        this.set = filled();
    }

    public void removeElementFromSet(String obj) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (obj.equals(iterator.next())) {
                iterator.remove();
            }

        }
    }
    public void clearSet(){
        set.clear();
    }
    private HashSet<String> filled() {
        HashSet<String> array = new HashSet<String>();
        array.add("Milk");
        array.add("Bread");
        array.add("Cookies");
        return array;
    }

    public HashSet<String> getSet() {
        return set;
    }
}
