package com.ws;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.ws.system.controller.SystemController;
import com.ws.wiseSaying.controller.WiseSayingController;

public class App {

	public App() {

	}

	public void run() {
		System.out.println("== 명령 앱 실행 ==");

		SystemController systemController = new SystemController();						//SystemController타입 systemController 변수에 SystemController 객체를 담음
		WiseSayingController wiseSayingController = new WiseSayingController();			//WiseSayingController타입 wiseSayingController 변수에 WiseSayingController 객체 담음
		
		
		byte system_status = 1;	// 변수 만들고 1 담음

		while (system_status == 1) { // 종료를 했을때 종료 케이스 안에서 변수를 0으로 while문이 더이상 돌아가지 않게 하기 위해 이렇게 설정 

			System.out.println("명령어 ) ");
			String cmd = Container.getScanner().nextLine().trim();	// String 타입 cmd에 getScanner 메서드 안에 있는 sc 를 담음

			Rq rq = new Rq(cmd);									// Rq타입 rq변수 만들고 cmd인자를 넣은 rq 객체 담음 명령어 파싱한 코드를 여기에 넣었음

			switch (rq.getActioncode()) {							// switch문에 rq.getActioncode() 메서드 실행했을 때 actioncode에 따라서 case분류
			case "종료":
				systemController.exit();							// actioncode가 종료일때 변수를 0으로 바꿔서 while문 더 돌아가지 않게 만들어서 시스템종료
				system_status = 0;
				break;
			case "등록":
				wiseSayingController.write();						// 등록일 때 wiseSayingController.write(); 실행
				break;
			case "목록":											
				wiseSayingController.list();						// 목록일 때 wiseSayingController.list(); 실행
				break;
			case "삭제":
				wiseSayingController.remove();						// 삭제일 때 wiseSayingController.remove(); 실행
				break;
			default:
				System.out.println("존재하지 않는 명령어입니다.");		// case에 해당되지 않을 때 출력문 나오고 다시 while문
				break;

			}

		}

	}
}
