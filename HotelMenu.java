import java.util.ArrayList;
import java.util.Scanner;

public class HotelMenu {

    public static void main(String[] args) {

		ArrayList<UserBean> users = new ArrayList<>();
		Scanner scr = new Scanner(System.in);
		int choice = -1;

		while (true) {
			System.out.println("1 for Signup\n2 For Login\n3 For exit");
			System.out.println("\nEnter your choice");
			choice = scr.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Etner firstname email and password....");
				String fn = scr.next();
				String em = scr.next();
				String pwd = scr.next();
				int id = (int) (Math.random() * 1000000); // 025612.65322652636336 * 100000
				UserBean user = new UserBean();
				user.setEmail(em);
				user.setFirstName(fn);
				user.setPassword(pwd);
				user.setUserId(id);
				users.add(user);
				break;
			case 2:
				System.out.println("****Login*****");
				System.out.println("Enter email and password ");
				em = scr.next();
				pwd = scr.next();
				// forEach
				boolean isCorrect = false;
				for (UserBean x : users) {
					if (x.getEmail().equalsIgnoreCase(em) && x.getPassword().equals(pwd)) {
						isCorrect = true;
						System.out.println("****bhoom*****");
					}
				}
				if (isCorrect == false) {
					System.out.println("Invalid credentials...");
				}

				break;
			case 3:
				for (int i = 0; i < users.size(); i++) {
					System.out.println(users.get(i).getUserId() + " :: " + users.get(i).getFirstName());
				}
				System.exit(0);// 0 1 2 ---integer
			default:
				System.out.println("Invalid choice.....");

			}// switch
		} // while
	}//
    
}
