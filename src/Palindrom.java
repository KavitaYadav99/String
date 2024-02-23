public class Palindrom {
    public static String reverse(String str) {
        char[] c = str.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        String original = "civic";
        String reversed = reverse(original);
        System.out.println("Reverse string : " + reversed);
        if(original.equals(reversed))
        {
            System.out.println("string is palindrom");
        }
        else {
            System.out.println("string is not palindrom");
        }
    }
}
