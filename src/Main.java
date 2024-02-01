import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		new App(sc).run();

		sc.close();

	}
}

class App {
	private Scanner sc;

	public App(Scanner sc) {
		this.sc = sc;
	}

	
	
	
	public void run() {
		System.out.println("== 명령 앱 실행 ==");
		
		
		int 마지막_번호 = 0;
		
		while (true) {
			
			int id = 마지막_번호 + 1;

			System.out.print("명령어 ) ");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("종료")) {
				break;
			}
			if (cmd.equals("등록")) {
				System.out.println("명언 : ");
				String 명언 = sc.nextLine().trim();
				System.out.println("작가 : ");
				String 작가 = sc.nextLine().trim();
				System.out.printf("%d번 명언이 등록 되었습니다.\n", id);
				마지막_번호++;
			}

		}
	}
}
