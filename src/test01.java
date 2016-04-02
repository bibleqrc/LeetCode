import java.util.Scanner;
public class test01 {
    public boolean canWinNim(int n) {
       return n%4!=0;
    }
    
    public static void main(String[] args)
    {
        int n1=13;
        int n2=20;
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
//        String s = input.next();
//        System.out.println(s);
        
        test01 solu = new test01();
        System.out.println("It's "+solu.canWinNim(n1)+" to win the game");
        System.out.println("It's "+solu.canWinNim(n2)+" to win the game");
    }
}