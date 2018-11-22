package com.biz.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.input.vo.GradeVO;

public class GradeExec01 {
	// !! 한글입력할땐 마우스로 >> 오른쪽에 클릭해주고 해야 오류가 안남
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<GradeVO> gradeList = new ArrayList();

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 이름 >>");
			String strName = scanner.nextLine();

			System.out.print("국어 >>");
			String strKor = scanner.nextLine();

			System.out.print("영어 >>");
			String strEng = scanner.nextLine();

			System.out.print("수학 >>");
			String strMath = scanner.nextLine();

			GradeVO vo = new GradeVO();
			vo.setIntNum(i + 1); // 학번
			vo.setStrname(strName);
			try {
				// 문자열 로 입력받은 점수를 정수형으로
				// 변환했음.
				int intKor = Integer.valueOf(strKor);
				int intEng = Integer.valueOf(strEng);
				int intMath = Integer.valueOf(strMath);

				vo.setIntKor(intKor);
				vo.setIntEng(intEng);
				vo.setIntMath(intMath);

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace(); // 개발단계에서 try문 내에서
										// 오류가 발생하면 어디에서 어떤오류가
										// 발생했는가 알려주는 명령 구문.
										// 개발이 완료된 후 배포할때는 삭제ㄱ
				System.out.println((i + 1) + "학생점수오류");
				System.out.println((i + 1) + "번 다시입력");
				i--;
				continue;
			}
			gradeList.add(vo);
		} // for end
		for (GradeVO vo : gradeList) {
			System.out.println(vo/* .toString() */);
		}
	}

}
