import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String convert = "";
        
        for (char c : a.toCharArray()) {
            if(Character.isUpperCase(c)){
                convert += Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)){
                convert += Character.toUpperCase(c);
            } else {
                convert += c;
            } 

        }
        System.out.println(convert);
        sc.close();
    }
}