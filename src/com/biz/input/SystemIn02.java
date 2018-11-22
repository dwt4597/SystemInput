package com.biz.input;

import java.io.InputStream;
import java.util.Scanner;

public class SystemIn02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input = System.in;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(input);

		// prompt :
		// nextLine()을 실행하기 전에
		// 뭐를 해야할지 알려주는 메시지를 먼저 출력하라.
		System.out.println("영문자열을 입력후 Enter..");
		@SuppressWarnings("unused")
		String strInput = scanner.nextLine();

		System.out.println(strInput);
	}

}
