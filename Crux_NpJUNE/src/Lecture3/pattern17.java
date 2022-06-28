package Lecture3;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n - 3;
		int star = n - 2;
		while (row <= 2*n-3) { 
				int i = 1;
				while(i <= star) {
					System.out.print("*"+" ");
					i++;
				}
				int j = 1;
				while(j <= space) {
					System.out.print("  ");
					j++;
				}
				space +=2;
				star --;
			
		
			
		}

	}

}
