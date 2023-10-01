import java.util.*;

class p40 {
    public static void main(String args[]) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String sentence = sc.nextLine();
        String[] tokens = sentence.split("");
        for (String token : tokens) {
            String word = token.toLowerCase();
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        for (String str : sortedKeys) {
            System.out.println("word=" + str + " and it's count =" + map.get(str));
        }
        System.out.println("Id-22DCE069");
    }
}
