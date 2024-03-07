package com.ws.wiseSaying.entity;
public class WiseSaying {
	
	private int 번호;
	private String 작가;
	private String 명언;
	
	public WiseSaying(int 번호, String 작가, String 명언) {
		this.번호 = 번호;
		this.작가 = 작가;
		this.명언 = 명언;
	}

	public int get번호() {
		return 번호;
	}

	public void set번호(int 번호) {
		this.번호 = 번호;
	}

	public String get작가() {
		return 작가;
	}

	public void set작가(String 작가) {
		this.작가 = 작가;
	}

	public String get명언() {
		return 명언;
	}

	public void set명언(String 명언) {
		this.명언 = 명언;
	}
	
	
}
