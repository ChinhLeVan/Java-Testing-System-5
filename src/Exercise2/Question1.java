package Exercise2;

import java.util.Scanner;

public class Question1 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Exercise2 question1 = new Exercise2();
		while(true) {
		System.out.println("Moi ban chon chuc nang... \n"+"1: Create Student... \n"+"2: Muster... \n"
							+"3: call group 1 to learning... \n"+"4: call group 2 to clearning... \n"+"5: Exit()");
		int choise = Integer.parseInt(scanner.nextLine());
		switch (choise) {
		case 1: {
			while (true) {
				int flagAdd = 1;
				System.out.println("Do you want to add student?   1:YES / 0:NO");
				flagAdd = Integer.parseInt(scanner.nextLine());
				if(flagAdd == 1) {
					question1.createStudent();	
				}else {
					System.out.println("You done add student!");
					break;
				}
			}
				break;
		}
		case 2: {
			question1.muster();
			break;
		}
		case 3: {
			question1.callGroup1ToLearn();
			break;
		}
		case 4: {
			question1.callGroup2ToClear();
			break;
		}
		case 5: {
			System.exit(1);
			break;
		}
		default:
			System.out.println("YOUR CHOISE WRONG");
			break;
		}
		}
	}
}
