package com.masai;

public class WorkoutProgram {
private int programid;
private String programname;
private int programduration;
public WorkoutProgram(int programid, String programname, int programduration) {
	super();
	this.programid = programid;
	this.programname = programname;
	this.programduration = programduration;
}
@Override
public String toString() {
	return "WorkoutProgram [programid=" + programid + ", programname=" + programname + ", programduration="
			+ programduration + "]";
}




}
