package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		//중복을 허용하지 않는다/ 순서대로 나오지도 않는다.
		//아이디 학번 주민번호등 관리시 사용
		HashSet<String> set = new HashSet<String>();
		
		set.add("이순신");
		set.add("김유신");
		set.add("장보고");
		set.add("강감찬");
		set.add("이순신");
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()){
			String str = ir.next();
			System.out.println(str);
		}
		System.out.println(set);
	}

}
