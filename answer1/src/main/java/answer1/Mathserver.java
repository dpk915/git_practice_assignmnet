package answer1;

public class Mathserver {
	
	
	
	
	public boolean isprime(int number) {
		  if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	
	
	public boolean reverseboolean(boolean s) {
		return (!s);
	}
	
	
		
		public static boolean isPalindrom( String str) {
			
			StringBuilder s=new StringBuilder(str);
			s.reverse();
			if(!str.equals(s.toString())) {
			
			
			return false;
		}
			return true;
			

		}

}
