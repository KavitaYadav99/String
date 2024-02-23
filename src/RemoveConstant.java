public class RemoveConstant {
    public static void main(String[] args) {
        // Write a program to delete all consonents from the string "Hello, have a good day".

        String s = "hello i am ok";
        for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
               s = s.replace(s.charAt(i), ' ');
           }
       }
     s=s.replaceAll(" ","");
        System.out.println(s);
    }
}



