package collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberJeong = new Member(300, "Jeong");
		Member memberJeong2 = new Member(300, "Jeong2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberJeong);
		manager.addMember(memberJeong2);
		
		manager.showAllMember();
		
		manager.removeMember(100);
		
		manager.showAllMember();
	}

}
