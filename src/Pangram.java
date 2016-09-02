import java.util.Scanner;
public class Pangram {
	public static void main(String args[]) {
		String ab = "abcdefghijklmnopqrstuvwxyz";
		Scanner in = new Scanner(System.in);
		System.out.println("Number of strings to enter:");
		int tests = in.nextInt();
		in.nextLine();
		String enteredStrings[] = new String[tests];
		for(int i=0; i<tests; i++) {
			enteredStrings[i] = in.nextLine().toLowerCase();
		}
		for(int i=0; i<tests; i++) {
			boolean flag = true;
			for(int j=0; j<ab.length(); j++) {
				if(!enteredStrings[i].contains(ab.substring(j, j+1))) {
					flag = false;
					break;
				}
			}
			System.out.println(flag);
		}
	}
}
