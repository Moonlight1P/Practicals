import java.util.Scanner;
class Palindrome{
    Scanner sc = new Scanner(System.in);
    String str;
    String rev;
    StringBuffer strl = new StringBuffer();
    void input(){
        System.out.println("Enter a string");
        str=sc.nextLine();
        strl.append(str);
    }
    void palindrome(){
        strl.reverse();
        rev=strl.toString();
        if(str.equalsIgnoreCase(rev))
        System.out.println(str+ " is a Palindrome");
        else
        System.out.println(str+ " is not a Palindrome");
    }
}

class Exp7{
    public static void main(String[] args){
        Palindrome ob = new Palindrome();
        ob.input();
        ob.palindrome();
    }
}
