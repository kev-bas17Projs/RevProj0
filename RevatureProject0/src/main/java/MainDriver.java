import java.util.Scanner;

import com.revature.exceptions.InvalidCredentialsException;
import com.revature.models.User;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean finished = false; // controls loop shown in SocialHub Project
		
		User u1 = null;
		while(!finished) {
			if(u1 == null) {
				System.out.println("Welcome to Bank17! Would you like to login or signup for a new account today?");
				String choice = null;
				if(choice.equals("login")) {
					System.out.println("Please enter your username: ");
					String username = input.nextLine();
					System.out.println("Please enter your password");
					String password = input.nextLine();
					try {
						
					} catch(InvalidCredentialsException e) {
						System.out.println("Username or password is incorrect.");
						finished = true;
					}
				} else {
					System.out.println("In order to open a new account please enter the following.");
					System.out.println("First Name: ");
					String firstNam = input.nextLine();
					System.out.println("Last Name: ");
					String lastName = input.nextLine();
					System.out.println("Username: ");
					String userNam = input.nextLine();
					System.out.println("Password: ");
					String password2 = input.nextLine();
				}
			}
		}
	}

}
