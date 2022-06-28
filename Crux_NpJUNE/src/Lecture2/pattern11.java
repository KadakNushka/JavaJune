package Lecture2;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n = 5;
		int row = 1;
		int space = 4;
		int star = 1;
	    while (row<=n) {
	    	int i = 1;
	    	while (i<=space) {
	    	System.out.print("  ");
	    	i++;
	    }
	    	int j = 1;
	    	while (j <= star) {
	    		if (j%2==0) {
	    			System.out.print("!"+" ");
	    		}
	    		else {
	    			System.out.print("*"+" ");
	    		}
	    		j++;
	    		
	    		}
	    	row++;
	    	star += 2;
	    	space --;
	    	System.out.println();

	}
	}
}
