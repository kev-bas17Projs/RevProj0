import java.util.Scanner;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoDB;
import com.revature.exceptions.InvalidCredentialsException;
import com.revature.models.User;

import com.revature.services.UserServices;

public class MainDriver {

	private static UserDao uDao = new UserDaoDB();

	private static UserServices uServ = new UserServices(uDao);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean finished = false; // controls loop shown in SocialHub Project

		User u1 = null;

		while (!finished) {
			if (u1 == null) {
				System.out.println("Welcome to Banking Services! For Login press 1, for Signup press 2.");
				int choice = Integer.parseInt(input.nextLine());
				if (choice == 1) {
					System.out.println("Please enter your username: ");
					String username = input.nextLine();
					System.out.println("Please enter your password: ");
					String password = input.nextLine();
					try {
						u1 = uServ.signIn(username, password);
						System.out.println("Welcome! " + u1.getFirstName());
					} catch (Exception e) {
						System.out.println("Incorrect username or password.");
						finished = true;
					}
				} else {
					System.out.println("Please enter your first name: ");
					String first = input.nextLine();
					System.out.println("Please enter your last name: ");
					String last = input.nextLine();
					System.out.println("Please enter your username: ");
					String uname = input.nextLine();
					System.out.println("Please enter a password: ");
					String password = input.nextLine();
					try {
						u1 = uServ.signUp(first, last, uname, password);
						System.out.println("You may noew log in with the username: " + u1.getUserName());
					} catch (Exception e) {
						System.out.println("Sorry we could not process your request.");
						System.out.println("Please try again later.");
						finished = true;
					}
				}

			} else {
				System.out.println("To view list press 1, to create a transaction 2.");
				int choice = Integer.parseInt(input.nextLine());
			}
		}
	}

}
