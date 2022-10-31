import java.util.Scanner;

public class ScannerExam1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		String gender = scanner.next();
		int AdmissionYear = scanner.nextInt();
		double gradeGoal = scanner.nextDouble();
		System.out.println(name+gender+AdmissionYear+gradeGoal);

	}

}
