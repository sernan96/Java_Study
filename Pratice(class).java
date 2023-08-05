package practice;
import java.util.Scanner;
class Day{
	private String work;
	public Day(int date1) {
		// TODO Auto-generated constructor stub
	}
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work ==null) System.out.println("Nothing");
		else System.out.println("To Do "+work);
	}
}

public class practice {

	public static void main(String[] args) {
		System.out.println("Month Shedule Manager Program");
		Day [] todo;

		todo = new Day[31];
		while(true) {
			System.out.println("ToDoThing(Register:1, Show:2, End:3) >> ");
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();

			switch(n) {
				case 1:
					System.out.println("Date(1~30)? ");
					int date1 = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("ToDoThing(Except Blank)?");
					String work = scanner.nextLine();
					todo[date1] = new Day(date1);
					todo[date1].set(work);
					break;
				case 2:
					System.out.println("Date(1~30)? ");
					int date2 = scanner.nextInt();
					todo[date2].show();
					break;
				case 3:
					scanner.close();
					System.out.println("End~");
					return;
				default:
					scanner.close();
					continue;
			}
		}
	}
}
