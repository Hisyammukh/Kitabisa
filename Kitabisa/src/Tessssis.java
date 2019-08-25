import java.util.Arrays;

public class Tessssis {
	
	public static boolean isMatch(int array1[], int array2[]) {
		
		
		if(array1.length != array2.length) {
			return false;
		}
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		for(int i=0; i< array2.length; i++) {
			if(array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main (String args[]) {
		int array1[] = {1,9,2,0,5};
		int array2[] = {2,1,5,3,9};
		
		if (isMatch(array1, array2)) {
			System.out.println("MATCH");
		}
		else {
			System.out.println("NOT MATCH");
		}
				
		
	}

}
