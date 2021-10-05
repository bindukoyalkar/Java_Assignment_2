import java.util.*;
public class ContainsAllAlphabets {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        boolean flag=isContainAllAlphabets(input);
        if(flag)
            System.out.println("Given string contains all letters of alphabet");
        else
            System.out.println("Given string does not contain all letters of alphabet");
    }
    public static boolean isContainAllAlphabets(String inp){
        inp=inp.toLowerCase();
        Set<Character> lowerCaseLettersSet=new HashSet<>();
        for(char letter:inp.toCharArray()){
            if('a'<=letter && letter<='z')
                lowerCaseLettersSet.add(letter);
        }
        if(lowerCaseLettersSet.size()==26)
            return true;
        else
            return false;
    }
}
// space complexity O(n)
// time complexity O(n)