package Lecture2;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 5;
		int space = -1;
		while (row<=n) {
			
			if (row <= 1) {
				int i = 1;
				while (i<=9) {
					System.out.print("*"+" ");
					i++;
				}
			}
			else  {
				int i = 1;
				while (i <= star) {
					System.out.print("*"+" ");
					i++;
				}
				int j = 1;
				while (j <= space) {
					System.out.print("  ");
					j++;
				}
				int k = 1;
				while (k <= star) {
					System.out.print("*"+" ");
					k++;
				}
				}
			row++;
			System.out.println();
			star--;
			space += 2;
			
		}

	}

}
