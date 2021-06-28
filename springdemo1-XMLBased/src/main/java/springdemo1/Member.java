package springdemo1;

public class Member {
	public Member() {
		
	}
public Member(int id, String memberName) {
		super();
		this.id = id;
		this.memberName = memberName;
	}
private int id;
private String memberName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
}
