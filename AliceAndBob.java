import java.util.Scanner;
public class AliceAndBob {
    public static void main(String[]args) {
        Scanner stdin = new Scanner(System.in);
        
        String usersName;
        String upperCaseName;
        
        System.out.print("Please enter your name:");
        usersName = stdin.nextLine();
        upperCaseName = usersName.toUpperCase();
        System.out.println(usersName.toUpperCase());
        
   if (upperCaseName.equals("BOB")){
            System.out.println("Hello, " + upperCaseName + ", nice to meet you!");
    }   else if (upperCaseName.equals("ALICE")){
            System.out.println("Hello, " + upperCaseName + ", nice to meet you!");
}       else {System.out.println("Goodbye");
    }     
}
}
    