//import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        String name = "raja";
//           String name = s.substring(0,1).toUpperCase()+
//                   s.substring(1,3).toLowerCase()
//                   +s.substring(3).toUpperCase();

//        int a [] = {1,2};
//        String d = a.toString().equals();
//        System.out.println(d);
        String result = "";

        for (int i = 0; i < name.length(); i++) {
            String temp = "" + name.charAt(i);
            if (i == 0 || i == name.length() - 1) {
                result = result + temp.toUpperCase();
            } else {
                result += temp;
            }
        }

        System.out.println("Result: " + result);
//        String[] words = sentence.split("\\s+");
//        int a= words.length;
        // return a;
    }
}



