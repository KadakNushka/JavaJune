package Lecture3;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int row = 1;
		int star =  1;
		int space = 4;
		while(row <= n) {
				int i = 1;
				while (i <= space) {
					System.out.print("  ");
					i++;
				}
				int j = 1;
				while (j <= star) {
					System.out.print("*"+" ");
					j++;
				}
			row++;
			System.out.println();
			if (row <= 4 ) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			
		}

	}

}