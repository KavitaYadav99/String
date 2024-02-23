public class CountWords {
    public static void main(String[] args) {
        String name = "ramanujan is ok";
        String []ch=name.split(" ");
        for(String word:ch)
        {
            System.out.print(word+" ");
        }
        System.out.println();
        System.out.println("total words in given string are: "+ch.length);

    }
}
