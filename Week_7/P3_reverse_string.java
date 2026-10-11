import java.util.Scanner;
public class P3_reverse_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        
        String name = input.next();
        String reverse="";
        
        for(int i = 0;i<name.length();i++)
        {
            reverse = name.charAt(i)+reverse;
        }
        System.out.println("Reverse String= "+reverse);
        
        if(name.equals(reverse))
        {
            System.out.print("Yes it is palindrome");
        }
        else
        {
            System.out.print("No it is not palindrome");
        }
    }
    
}