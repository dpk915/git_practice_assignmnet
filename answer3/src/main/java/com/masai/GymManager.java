package com.masai;

import java.util.Map;

public class GymManager {
	
	
	Map<WorkoutProgram,Member> gymPrograms;
	
	
	public void setGymPrograms(Map<WorkoutProgram, Member> gymPrograms) {
		this.gymPrograms = gymPrograms;
	}



	public void initilized() {
		System.out.println("inside initialize method");
	}
	
	
	
	public void shutDown() {
		System.out.println( "inside shutDown method");
	}
	
	public void displaydetails() {
		
		for(Map.Entry<WorkoutProgram,Member> p:gymPrograms.entrySet()) {
			System.out.println("Work out program : "+p.getKey());
			System.out.println("Member Detail : "+p.getValue());
			System.out.println("----------------------------------------------");
		}

	}

}
