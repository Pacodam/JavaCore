package competitiveProgramming.adhocproblems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = null;
        do {
            boolean equals = true;
            System.out.println("Enter text: (type 'exit' to leave");
            text = sc.nextLine();
            char[] textChar = text.toCharArray();
            for(int i = 0, j = text.length()-1; i < text.length() ; i++, j--){
                if(textChar[i] != textChar[j]){
                    equals = false;
                }
            }
            if(equals) System.out.println("Is palindrome");
            if(!equals) System.out.println("Is not palindrome");
        }while(!text.equals("exit"));
    }
}
