import java.util.HashSet;
import java.util.Set;

class CharacterSet {
    private Set<Character> set;

    public CharacterSet() {
        this.set = new HashSet<>();
    }

    public CharacterSet(char[] elements) {
        this.set = new HashSet<>();
        for (char element : elements) {
            this.set.add(element);
        }
    }

    public boolean contains(char element) {
        return set.contains(element);
    }

    public CharacterSet intersection(CharacterSet otherSet) {
        CharacterSet result = new CharacterSet();
        for (char element : set) {
            if (otherSet.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public CharacterSet union(CharacterSet otherSet) {
        CharacterSet result = new CharacterSet();
        
        for (char element : this.set) {
            result.add(element);
        }

        for (char element : otherSet.set) {
            result.add(element);
        }

        return result;
    }

    public CharacterSet difference(CharacterSet otherSet) {
        CharacterSet result = new CharacterSet();
        for (char element : this.set) {
            if (!otherSet.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public void add(char element) {
        set.add(element);
    }

    public void remove(char element) {
        set.remove(element);
    }

    public CharacterSet multiply(CharacterSet otherSet) {
        CharacterSet result = new CharacterSet();
        for (char element : this.set) {
            if (otherSet.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public char[] toArray() {
        char[] result = new char[set.size()];
        int i = 0;
        for (char element : set) {
            result[i++] = element;
        }
        return result;
    }

    public void assign(CharacterSet otherSet) {
        this.set.clear();
        this.set.addAll(otherSet.set);
    }

    @Override
    public String toString() {
        return set.toString();
    }
}

public class App {
    public static void main(String[] args) {
        CharacterSet[] sets = {
                new CharacterSet(new char[]{'a', 'b', 'c', 'd'}),
                new CharacterSet(new char[]{'c', 'd', 'e', 'f'}),
                new CharacterSet(new char[]{'b', 'd', 'f', 'h'})
        };

        System.out.println("Sets:");
        for (CharacterSet set : sets) {
            System.out.println(set);
        }

        CharacterSet intersectionSet = sets[0].intersection(sets[1]);
        System.out.println("\nIntersection Set (Set1 ∩ Set2): " + intersectionSet);

        CharacterSet unionSet = sets[0].union(sets[2]);
        System.out.println("Union Set (Set1 ∪ Set3): " + unionSet);

        CharacterSet differenceSet = sets[1].difference(sets[2]);
        System.out.println("Difference Set (Set2 - Set3): " + differenceSet);

        CharacterSet multiplicationSet = sets[0].multiply(sets[2]);
        System.out.println("Multiplication Set (Set1 * Set3): " + multiplicationSet);

        CharacterSet indexedSet = new CharacterSet(new char[]{'a', 'b', 'c'});
        CharacterSet assignedSet = new CharacterSet();
        assignedSet.assign(indexedSet);

        System.out.println("\nIndexed Set: " + indexedSet);
        System.out.println("Assigned Set: " + assignedSet);

        indexedSet.add('d');
        assignedSet.remove('a');

        System.out.println("\nAfter Adding 'd' to Indexed Set: " + indexedSet);
        System.out.println("After Removing 'a' from Assigned Set: " + assignedSet);
    }
}
