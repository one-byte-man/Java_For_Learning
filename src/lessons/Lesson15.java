package lessons;

import java.util.*;

/**
 * JAVA COLLECTIONS FRAMEWORK
 * ---------------------------------------------------------
 * 1. CORE INTERFACES & IMPLEMENTATIONS (The "What" and "Why")
 * - List<E> : Ordered (indexed). Allows duplicates.
 * -> ArrayList<E> : Backed by an array. SUPER FAST for reading (get), VERY SLOW for insert/delete in the middle.
 * -> LinkedList<E>: Backed by nodes. SUPER FAST for insert/delete, VERY SLOW for reading (get by index).
 * * - Set<E>  : Unordered. NO DUPLICATES allowed.
 * -> HashSet<E>   : Backed by a Hash Table. Fastest for search/add. No guarantee of insertion order.
 * -> TreeSet<E>   : Elements are automatically sorted (Ascending) as they are added.
 * * - Queue<E>: First-In-First-Out (FIFO) processing.
 * -> PriorityQueue<E>: Elements are ordered by priority (Comparable/Comparator), not just insertion order.
 * * - Map<K,V>: Key-Value dictionary. KEYS must be UNIQUE, VALUES can be duplicates.
 * -> HashMap<K,V> : Fast access. Unordered.
 * -> TreeMap<K,V> : Keys are automatically sorted.
 * ---------------------------------------------------------
 * 2. CRITICAL METHODS (List, Set)
 * - collection.remove(Object) : Removes specific item. Returns boolean.
 * - list.remove(int index)    : Removes item at index. Returns the removed item.
 * - collection.clear()        : Wipes EVERYTHING. Size becomes 0. Much faster than loop-removing.
 * - collection.toArray(new T[0]): Converts Collection -> Standard Array (e.g., String[] arr = list.toArray(new String[0]);)
 * - Arrays.asList(array)      : Converts Array -> List. WARNING: Returns a FIXED-SIZE list. (.add() throws Exception!)
 * ---------------------------------------------------------
 * 3. MAP OPERATIONS (Map<String, Integer> map = new HashMap<>();)
 * - map.put(key, value)   : Inserts new pair OR overwrites value if key exists.
 * - map.get(key)          : Returns the value, or 'null' if key does not exist.
 * - map.remove(key)       : Deletes the key-value pair.
 * - map.keySet()          : Returns a Set<K> of all keys. (Crucial for iterating over maps).
 * - map.values()          : Returns a Collection<V> of all values.
 * ---------------------------------------------------------
 * 4. SORTING: COMPARABLE vs COMPARATOR
 * - Comparable<T> : "Internal" sorting logic. The class itself implements it and overrides `compareTo(T o)`.
 * Defines the "Natural Order" (Ascending).
 * - Comparator<T> : "External" sorting logic. A separate class overrides `compare(T o1, T o2)`. 
 * Used for custom sorting or Descending order without modifying the original class.
 * ---------------------------------------------------------
 * 5. COLLECTIONS UTILITY CLASS (Static Methods)
 * - Collections.sort(list)        : Sorts ASCENDING. Elements MUST implement Comparable.
 * - Collections.sort(list, Collections.reverseOrder()) : Sorts DESCENDING.
 * - Collections.reverse(list)     : Flips the current order (Doesn't sort, just reverses).
 * - Collections.shuffle(list)     : Randomizes the order of elements.
 * - Collections.fill(list, obj)   : Replaces ALL elements in the list with 'obj'.
 * - Collections.copy(dest, src)   : Copies src to dest. TRAP: 'dest' MUST be at least the same size as 'src' beforehand!
 * - Collections.binarySearch(l,k) : TRAP: List MUST BE SORTED FIRST! Returns index, or negative number if not found.
 */

public class Lesson15 {

    public static void main(String[] args) {

        // =========================================================
        // 1. ARRAYLIST + ITERATOR
        // =========================================================
        System.out.println("=== 1. ArrayList + Iterator ===");

        // Örnek 1: ArrayList'e eleman ekle, iterator ile gez
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        Iterator<String> it1 = fruits.iterator();
        System.out.print("Fruits: ");
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
        System.out.println();

        // Örnek 2: iterator.remove() — "Banana" sil
        // iterator.remove() → 0 parametre, son next() ile dönen elemanı siler
        List<String> cities = new ArrayList<>(Arrays.asList("Ankara", "Istanbul", "Izmir"));
        Iterator<String> it2 = cities.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals("Istanbul")) {
                it2.remove(); // iterator üzerinden silmek ConcurrentModificationException vermez
            }
        }
        System.out.println("After iterator.remove(): " + cities);
        // GOTCHA: list.remove() içinde döngüdeyken ConcurrentModificationException fırlatır!

        // =========================================================
        // 2. LINKEDLIST + LISTITERATOR
        // =========================================================
        System.out.println("\n=== 2. LinkedList + ListIterator ===");

        // Örnek 1: addFirst / addLast
        // addFirst(E e) → 1 parametre
        // addLast(E e)  → 1 parametre
        LinkedList<Integer> nums = new LinkedList<>();
        nums.addLast(10);
        nums.addLast(20);
        nums.addFirst(5);
        System.out.println("LinkedList: " + nums); // [5, 10, 20]

        // Örnek 2: ListIterator ile ters gez
        // listIterator(int index) → 1 parametre; index = size() → sondan başlar
        // hasPrevious() / previous() ile geriye doğru iterasyon
        ListIterator<Integer> lit = nums.listIterator(nums.size());
        System.out.print("Reversed: ");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();

        // =========================================================
        // 3. Collections.sort
        // =========================================================
        System.out.println("\n=== 3. Collections.sort ===");

        // sort(List<T> list) → 1 parametre, doğal sıraya göre (Comparable gerekir)
        List<String> names = new ArrayList<>(Arrays.asList("Zeynep", "Ahmet", "Burcu"));
        Collections.sort(names);
        System.out.println("sort (natural): " + names);

        // sort(List<T> list, Comparator<T> c) → 2 parametre, ters sıra
        // Collections.reverseOrder() → Comparator döner, 0 parametre
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("sort (reverse): " + names);

        // =========================================================
        // 4. Collections.shuffle
        // =========================================================
        System.out.println("\n=== 4. Collections.shuffle ===");

        // shuffle(List<?> list) → 1 parametre, rastgele karıştırır
        List<Integer> cards = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(cards);
        System.out.println("After shuffle: " + cards);

        // shuffle(List<?> list, Random rnd) → 2 parametre, seed ile tekrar üretilebilir
        Collections.shuffle(cards, new Random(42));
        System.out.println("After seeded shuffle: " + cards);

        // =========================================================
        // 5. Collections.reverse
        // =========================================================
        System.out.println("\n=== 5. Collections.reverse ===");

        // reverse(List<?> list) → 1 parametre
        List<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        Collections.reverse(letters);
        System.out.println("Reversed: " + letters); // [D, C, B, A]

        // Örnek 2
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        Collections.reverse(nums2);
        System.out.println("Reversed nums: " + nums2); // [30, 20, 10]

        // =========================================================
        // 6. Collections.fill
        // =========================================================
        System.out.println("\n=== 6. Collections.fill ===");

        // fill(List<? super T> list, T obj) → 2 parametre
        List<String> filled = new ArrayList<>(Arrays.asList("x", "x", "x"));
        Collections.fill(filled, "Java");
        System.out.println("After fill: " + filled); // [Java, Java, Java]

        // Örnek 2
        List<Integer> zeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Collections.fill(zeros, 0);
        System.out.println("After fill 0: " + zeros);

        // =========================================================
        // 7. Collections.copy
        // =========================================================
        System.out.println("\n=== 7. Collections.copy ===");

        // copy(List<? super T> dest, List<? extends T> src) → 2 parametre
        // dest.size() >= src.size() olmalı, aksi hâlde IndexOutOfBoundsException!
        List<String> src = Arrays.asList("One", "Two", "Three");
        List<String> dest = new ArrayList<>(Arrays.asList("?", "?", "?"));
        Collections.copy(dest, src);
        System.out.println("After copy: " + dest);

        // Örnek 2
        List<Integer> src2  = Arrays.asList(7, 8, 9);
        List<Integer> dest2 = new ArrayList<>(Arrays.asList(0, 0, 0));
        Collections.copy(dest2, src2);
        System.out.println("After copy ints: " + dest2);

        // =========================================================
        // 8. Collections.min / max
        // =========================================================
        System.out.println("\n=== 8. Collections.min / max ===");

        // min(Collection<? extends T> coll) → 1 parametre
        // max(Collection<? extends T> coll) → 1 parametre
        List<Integer> scores = Arrays.asList(42, 17, 99, 3, 55);
        System.out.println("Min: " + Collections.min(scores)); // 3
        System.out.println("Max: " + Collections.max(scores)); // 99

        // Örnek 2 — String (lexicographic)
        List<String> words = Arrays.asList("banana", "apple", "cherry");
        System.out.println("Min word: " + Collections.min(words)); // apple
        System.out.println("Max word: " + Collections.max(words)); // cherry

        // =========================================================
        // 9. Collections.binarySearch
        // =========================================================
        System.out.println("\n=== 9. Collections.binarySearch ===");

        // binarySearch(List<? extends Comparable<T>> list, T key) → 2 parametre
        // LİSTE ÖNCE SIRALANMIŞ OLMALI! Aksi hâlde sonuç tanımsız.
        List<String> sorted = new ArrayList<>(Arrays.asList("blue", "green", "red", "yellow"));
        Collections.sort(sorted);
        int idx = Collections.binarySearch(sorted, "green");
        System.out.println("binarySearch 'green': index " + idx); // >= 0

        int notFound = Collections.binarySearch(sorted, "purple");
        System.out.println("binarySearch 'purple': " + notFound); // negatif = bulunamadı

        // =========================================================
        // 10. Collections.frequency
        // =========================================================
        System.out.println("\n=== 10. Collections.frequency ===");

        // frequency(Collection<?> c, Object o) → 2 parametre
        List<String> repeated = Arrays.asList("a", "b", "a", "c", "a");
        System.out.println("frequency of 'a': " + Collections.frequency(repeated, "a")); // 3

        List<Integer> nums3 = Arrays.asList(1, 2, 2, 3, 2);
        System.out.println("frequency of 2: " + Collections.frequency(nums3, 2)); // 3

        // =========================================================
        // 11. Collections.disjoint
        // =========================================================
        System.out.println("\n=== 11. Collections.disjoint ===");

        // disjoint(Collection<?> c1, Collection<?> c2) → 2 parametre
        // Ortak eleman yoksa true döner
        List<String> c1 = Arrays.asList("red", "blue");
        List<String> c2 = Arrays.asList("green", "yellow");
        List<String> c3 = Arrays.asList("blue", "orange");
        System.out.println("c1 & c2 disjoint: " + Collections.disjoint(c1, c2)); // true
        System.out.println("c1 & c3 disjoint: " + Collections.disjoint(c1, c3)); // false

        // =========================================================
        // 12. Collections.addAll
        // =========================================================
        System.out.println("\n=== 12. Collections.addAll ===");

        // addAll(Collection<? super T> c, T... elements) → 2+ parametre (varargs)
        List<String> base = new ArrayList<>(Arrays.asList("X"));
        Collections.addAll(base, "Y", "Z", "W");
        System.out.println("After addAll: " + base);

        // Diziden de eklenebilir
        String[] extra = {"P", "Q"};
        Collections.addAll(base, extra);
        System.out.println("After addAll array: " + base);

        // =========================================================
        // 13. PRIORITYQUEUE
        // =========================================================
        System.out.println("\n=== 13. PriorityQueue ===");

        // offer(E e) → 1 parametre, kuyruğa ekler
        // peek()     → 0 parametre, en küçük elemanı gösterir (silmez)
        // poll()     → 0 parametre, en küçük elemanı çıkarır ve döner
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.print("PQ poll order (min-heap): ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // 10 20 30
        }
        System.out.println();

        // Örnek 2 — Double
        PriorityQueue<Double> dpq = new PriorityQueue<>();
        dpq.offer(3.14);
        dpq.offer(1.41);
        dpq.offer(2.71);
        System.out.println("peek (min): " + dpq.peek()); // 1.41

        // =========================================================
        // 14. HASHSET — duplicate elimination
        // =========================================================
        System.out.println("\n=== 14. HashSet ===");

        // HashSet(Collection<? extends E> c) → 1 parametre constructor
        List<String> dupes = Arrays.asList("cat", "dog", "cat", "bird", "dog");
        Set<String> unique = new HashSet<>(dupes);
        System.out.println("HashSet (no dupes): " + unique);

        // Örnek 2
        Set<Integer> intSet = new HashSet<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5));
        System.out.println("HashSet ints: " + intSet);

        // =========================================================
        // 15. TREESET — sorted, no dupes
        // =========================================================
        System.out.println("\n=== 15. TreeSet / SortedSet ===");

        // headSet(E toElement) → 1 parametre, toElement'ten küçükleri döner
        // tailSet(E fromElement) → 1 parametre, fromElement dahil büyükleri döner
        SortedSet<String> tree = new TreeSet<>(Arrays.asList("mango","apple","banana","cherry","apple"));
        System.out.println("TreeSet sorted: " + tree);
        System.out.println("headSet('cherry'): " + tree.headSet("cherry")); // apple, banana
        System.out.println("tailSet('cherry'): " + tree.tailSet("cherry")); // cherry, mango
        System.out.println("first: " + tree.first() + "  last: " + tree.last());

        // =========================================================
        // 16. HASHMAP
        // =========================================================
        System.out.println("\n=== 16. HashMap ===");

        // put(K key, V value) → 2 parametre
        // get(Object key)     → 1 parametre
        // containsKey(Object key) → 1 parametre
        Map<String, Integer> wordCount = new HashMap<>();
        String sentence = "the cat sat on the mat the cat";
        for (String w : sentence.split(" ")) {
            wordCount.put(w, wordCount.containsKey(w) ? wordCount.get(w) + 1 : 1);
        }
        // keySet() → 0 parametre, Set<K> döner
        Set<String> keys = new TreeSet<>(wordCount.keySet()); // sıralı yazdır
        for (String k : keys) {
            System.out.printf("%-8s %d%n", k, wordCount.get(k));
        }
        System.out.println("size: " + wordCount.size() + "  isEmpty: " + wordCount.isEmpty());

        // =========================================================
        // 17. IMMUTABLE FACTORY METHODS (Java 9+)
        // =========================================================
        System.out.println("\n=== 17. Immutable Factory Methods ===");

        // List.of(E... elements) → varargs, immutable list
        List<String> immList = List.of("red", "green", "blue");
        System.out.println("List.of: " + immList);

        // Set.of(E... elements) → varargs, immutable set (duplicates → IllegalArgumentException)
        Set<Integer> immSet = Set.of(1, 2, 3, 4);
        System.out.println("Set.of: " + immSet);

        // Map.of(K k1, V v1, ...) → çiftler hâlinde, max 10 çift
        Map<String, Integer> immMap = Map.of("Mon", 1, "Tue", 2, "Wed", 3);
        System.out.println("Map.of: " + immMap);

        // Map.ofEntries(Map.Entry<K,V>...) → 10'dan fazla çift için
        Map<String, Integer> bigMap = Map.ofEntries(
            Map.entry("Jan", 31),
            Map.entry("Feb", 28),
            Map.entry("Mar", 31)
        );
        System.out.println("Map.ofEntries: " + bigMap);

        // GOTCHA: immutable kolleksiyona add/put/remove → UnsupportedOperationException!
        try {
            immList.add("purple");
        } catch (UnsupportedOperationException e) {
            System.out.println("GOTCHA: List.of is immutable → " + e.getClass().getSimpleName());
        }

        // =========================================================
        // 18. SUBLIST — bonus slayt
        // =========================================================
        System.out.println("\n=== 18. subList + clear ===");

        // subList(int fromIndex, int toIndex) → 2 parametre, [from, to) aralığı
        // Dönen liste orijinalin view'ıdır; .clear() orijinalden de siler.
        List<String> data = new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        data.subList(2, 5).clear(); // C, D, E silinir
        System.out.println("After subList(2,5).clear(): " + data); // [A, B, F]

        System.out.println("\n=== DONE ===");
    }
}