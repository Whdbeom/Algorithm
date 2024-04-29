import java.util.Scanner;
import static java.lang.String.valueOf;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (Character.isUpperCase(temp)){
                result += valueOf(temp).toLowerCase();
            } else {
                result += valueOf(temp).toUpperCase();
            }
        }
        System.out.println(result);
    }
}