import java.util.Scanner;
public class Soln2_main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Soln2 ob = new Soln2();

        System.out.println("Enter password : ");
        String input = sc.nextLine();
        char str[]=input.toCharArray();

        System.out.println(ob.checkPassword(str, 4));
    }    
}
