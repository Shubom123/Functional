import java.util.Scanner;

public class SumOfInteger {
    public static void main(String args[]) {
	int array[]={1, 7, 4, 2, -5, 8, 3};
        int Total;
        for (int i = 0; i < 4; i++) {
	 System.out.println(array[i]);
            for (int j = i + 1; j < 5 ; j++) {
	    System.out.println(array[j]);
                for (int k = j + 1; k < 6; k++) {
		System.out.println(array[k]);
            	 Total = array[i] + array[j] + array[k];
	        if (Total == 0) {
			System.out.println(" the numbers " + array[i] + ", " + array[j] + ", " + array[k] + " add to 0");
                        
                    }
                }
            }
        }

	}
}
