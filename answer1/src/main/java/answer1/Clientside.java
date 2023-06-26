package answer1;

import java.util.Scanner;

public class Clientside {

	Mathserver mathserver;

	public void setMathserver(Mathserver mathserver) {
		this.mathserver = mathserver;
	}
	
	
	public  void execute() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your input");
		String str=sc.next();
		if(isNumber(str)) {
			System.out.println(str);
			int n= Integer.parseInt(str);
		System.out.println(str+"is prime number  "+	mathserver.isprime(n));
		}else if(isBoolean(str)) {
			boolean b = Boolean.parseBoolean(str);
			System.out.println("reverse of "+str+"  is "+  mathserver.reverseboolean(b));
		}else {
		System.out.println("pallindrom of given string  "+str+" is "+mathserver.isPalindrom(str));
		}
		
		
		
		
		
		
		
		
	}

	public boolean isNumber(String input) {
	    //String str = "hello";
	   // String s = "1";
	    try {
	    int m = Integer.parseInt(input);
	    return true;
	    }catch(NumberFormatException p) {
	    return false;
	    }
	    
	}

	public boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }
}
