import java.util.*;

public class CountDuplicateWords {
    public static void main(String[] args) {
        String str = "abcab";
        char c[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : c) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> me : map.entrySet()) {
            if (me.getKey() > 1) {
                System.out.println(me.getKey() + "=" + me.getValue());

            }


        }
    }
}


