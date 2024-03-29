package chapter12.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	// key value

	// 생성자
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	// 메서드덜
	// HashMap에 회원을 추가하는 메서드
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
		// Integer, Member
		// key-value 쌍으로 추가
	}

	// HashMap에서 회원을 삭제하는 메서드
	public boolean removeMember(int memberID) {
		if (hashMap.containsKey(memberID)) {
			// HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면
			hashMap.remove(memberID); // 해당 회원 삭제
			return true;
		}
		System.out.println(memberID + "가 존재하지 않습니다");
		return false;
	}

	// Iterator를 사용해 전체 회원을 출력하는 메서드
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
									// ㄴ 리턴타입: Set!!! -> so iterator로...
		while (ir.hasNext()) { // 다음 key가 있으면
			int key = ir.next(); // key값을 가져와서
			Member member = hashMap.get(key); // key로부터 value 가져오기
			System.out.println(member);
		} // while
		System.out.println();
	}

}