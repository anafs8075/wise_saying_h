package com.ws;

import java.util.HashMap;
import java.util.Map;

public class Rq {
	private String actioncode;							// String 타입 actioncode 정의
	private Map<String, String> params;					// Map<String, String> params 정의

	public Rq(String cmd) {				

		String[] cmdBits = cmd.split("\\?", 2);           // String 배열 cmdbits 에 cmd에 담긴 문자열을 ?를 기준으로 나눈걸 담음
														  // ?는 메타문자 \\를 써주고 써야한다.

		actioncode = cmdBits[0];						// actioncode = cmdBits에 0번째이다. 예로 cmd = 삭제?id=1 이면 actioncode는 삭제

		params = new HashMap<>();						// params에 hashmap객체를 담음
		
		if (cmdBits.length == 1){						// 길이가 1이라면 함수가 끝나게 return; 을 써준다
			return;
		}
		

		String[] paramBits = cmdBits[1].split("&");		// String 배열 paramBits는 cmdbits의 "?" 뒤에 있는 문자열인데 이걸 "&"로 나눔
														// 예로 삭제?id=1&작가=123 라면 id=1, 작가=123 으로 나눔

		for (String paramStr : paramBits) {								// for each문 paramBits를 순회해서 "="으로 나눈걸 paramStrBits에 담는다
			String[] paramStrBits = paramStr.split("=", 2);				// 예로 삭제?id=1 이라면 id, 1 으로 나눔
			String key = paramStrBits[0];								// key에는 id를
			String value = paramStrBits[1];								// value에는  1을 담아준다.

			params.put(key, value);										// 그리고 params.put 으로 key와 value를 넣어준다.
																		// 2개를 넣어주는 이유는 hashmap은 key와 value 2개가 필요하기 때문
		}
	}

	public String getActioncode() {
		return actioncode;
	}

	public String getParams(String name) {
		return params.get(name);
	}

}
