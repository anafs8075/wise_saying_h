import java.util.ArrayList;
import java.util.List;
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
		
		
		List<WiseSaying> wisesayings = new ArrayList<>();
		
		while (true) {
			
			int id = 마지막_번호 + 1;

			System.out.print("명령어 ) ");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("종료")) {
				break;
			}
			else if (cmd.equals("등록")) {
				System.out.println("명언 : ");
				String 명언 = sc.nextLine().trim();
				System.out.println("작가 : ");
				String 작가 = sc.nextLine().trim();
				
				WiseSaying ws = new WiseSaying(id, 명언, 작가);
				wisesayings.add(ws);
				
				System.out.printf("%d번 명언이 등록 되었습니다.\n", id);
				마지막_번호++;
			}
			else if (cmd.equals("목록")) {
				if(wisesayings.size() == 0) {
					System.out.println("등록 된 명언이 없어");
				}else {
					System.out.println("번호 / 작가 / 명언");
					System.out.println("등록 된 명언 수 : " + wisesayings.size());
				}
			}else {
				System.out.println("존재하지 않는 명령어 입니다.");
			}
			

		}
	}
}


class WiseSaying{
	private int id;
	private String 명언;
	private String 작가;
	
	
	public WiseSaying(int id, String 명언2, String 작가2) {
		this.id = id;
		this.명언 = 명언;
		this.작가 = 작가;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String get명언() {
		return 명언;
	}
	public void set명언(String 명언) {
		this.명언 = 명언;
	}
	public String get작가() {
		return 작가;
	}
	public void set작가(String 작가) {
		this.작가 = 작가;
	}
	
	
}