package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러~~개를 쓰고 [엔터]를 누르세요");
		
		int i;
		try {
			while((i = System.in.read()) != -1) { //  -1 = \ 끝!!을 의미
				System.out.print("i: " + i + "   ");
				System.out.println("(char)i: " + (char)i);
				// while문에서 read() 메서드로 한 바이트를 반복해 읽음
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}