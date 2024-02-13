package com.itbank.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class Ex01Service {
	// 공공데이터포털, 부산 축제 정보
	
	private final String serviceKey = "gH%2BNkjfRSoH7hZoKaTI7AuP%2B7akx51UJjhfO553oAjcYOB05Hd06X%2B3ULg5ZakssqrSP%2BiWjgtCKez6aFkdHRA%3D%3D";
	
	public String getFestivalJson() throws MalformedURLException, IOException {
		// 1) 요청 주소 및 파라미터 준비
		String url = "https://apis.data.go.kr/6260000/FestivalService/getFestivalKr";
		HashMap<String, String> param = new HashMap<>();
		param.put("pageNo", "1");
		param.put("numOfRows", "10");
		param.put("resultType", "json");	// xml로 하고 싶으면 이 줄을 없애면 된다.
		param.put("serviceKey", serviceKey);
		url += "?";
		for(String key : param.keySet()) {	// 이런식으로 쿼리스트링을 붙여준다.
			url += key + "=" + param.get(key) + "&"; // 마지막에 &는 있어도 없어도 상관 없다. 
			// 메서드는 get 방식이다.
		}
		
		// 2) 요청을 전송하여 응답을 받아서 저장
		// 정상적으로 했다면 응답은 문자열로 온다.
		Scanner sc = null;
		String response = "";
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		if(conn.getResponseCode() == 200) {	// 정상
			sc = new Scanner(conn.getInputStream());
			while(sc.hasNextLine()) {
				response += sc.nextLine();
			}
			sc.close();
			conn.disconnect();
		}
		return response;
	}

	
}
