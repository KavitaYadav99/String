
import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {

        String str = "ABCDEFGABEF";
        int longestSubstringLength=0;
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        char []ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            char c= ch[i];
            if(!map.containsKey(c))
            {
               map.put(c,i);
            }
            else {
                i=map.get(c);
                map.clear();
            }
            if(map.size()>longestSubstringLength)
            {
                longestSubstringLength=map.size();
            }
        }
        System.out.println("the longest substring is: "+longestSubstringLength);
    }
}



