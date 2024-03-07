package com.ws.wiseSaying.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ws.Container;
import com.ws.wiseSaying.entity.WiseSaying;

public class WiseSayingController {
	
	private int id = 0;
	private List<WiseSaying> wiseSayings = new ArrayList<>();
	
	public WiseSayingController() {
		id = 0;
		wiseSayings = new ArrayList<>();
	}
	
	public void write() {
		int 번호 = id + 1;
		System.out.println("명언 : ");
		String 명언 = Container.getScanner().nextLine().trim();
		System.out.println("작가 : ");
		String 작가 = Container.getScanner().nextLine().trim();

		WiseSaying wiseSaying = new WiseSaying(번호, 작가, 명언);
		wiseSayings.add(wiseSaying);

		System.out.printf("%d번 명언이 등록되었습니다.\n", 번호);
		id++;
		
	}

	public void list() {
		if (wiseSayings.size() == 0) {
			System.out.println("등록된 명언이 없어");
		} else {

			System.out.println("번호 / 작가 / 명언");
			System.out.println("===============");

			for (int i = wiseSayings.size() - 1; i >= 0; i--) {

				WiseSaying ws = wiseSayings.get(i);
				System.out.printf("%d / %s / %s \n", ws.get번호(), ws.get작가(), ws.get명언());
			}
		}
		
	}

	public void remove(String cmd) {
		
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
