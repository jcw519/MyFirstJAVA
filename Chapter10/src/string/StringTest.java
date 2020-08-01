package string;

public class StringTest {

	public static void main(String[] args) {
		
		
		//new로 생성할 경우 힙 메모리에 서로 다른 주소에 저장됨
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		
		//상수풀
		String str3 = "abc";
		String str4 = "abc";
		
		
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str3 == str4);
		
		
	}

}
