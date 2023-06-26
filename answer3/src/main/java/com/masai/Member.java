package com.masai;

public class Member {

	private int member_id;
	private String member_name;
	private int age;
	private String member_type;
	public Member(int member_id, String member_name, int age, String member_type) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.age = age;
		this.member_type = member_type;
	}
	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", member_name=" + member_name + ", age=" + age + ", member_type="
				+ member_type + "]";
	}
	
	
	
	
	
	
	
}
