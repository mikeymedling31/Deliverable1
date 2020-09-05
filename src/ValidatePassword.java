import java.util.Scanner;
import java.util.regex.*;

public class ValidatePassword {
	public static void main (String []args) {
		
		
		Scanner input = new Scanner (System.in);
		
		String createdPassword;
		
		System.out.println("Please create a createdPassword.\n\n" 
				+ "The createdPassword must contain:\n"
				+ " * At least one lowercase letter\n"
				+ " * At least one uppercase letter\n"
				+ " * At least minimum 7 characters\n" 
				+ " * At least maximum 12 characters\n" 
				+ " * An exclamation point: !\n\n"
				+ "Enter new createdPassword:"); 
		
		createdPassword = input.next();
		if(Pattern.matches(".*[!].*", createdPassword)){
			if(Pattern.matches(".*[A-Z].*", createdPassword)) {
				if(Pattern.matches(".*[a-z].*", createdPassword)) {
					if(createdPassword.length() >= 7 && createdPassword.length() <= 12) {
					System.out.println("Password valid and accepted!");
					}else{
						System.out.println("ERROR Password must be less than 12 and more than 7 characters in length");
						main(args);
					}
				}else {
					System.out.println("ERROR Password must have atleast one lowercase character");
					main(args);
				}
			}else {
				System.out.println("ERROR Password must have atleast one uppercase character");
				main(args);
			}
		}else {
			System.out.println("ERROR Password must have atleast one !");
			main(args);
		}
		
	}
}