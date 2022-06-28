package Lecture2;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = 7;
		while (row<=n) {
			if (row<=4) {
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
			else {
				int i = 1;
				while (i<=9) {
					System.out.print("*"+" ");
					i++;
				}
				
			}
			row++;
			System.out.println();
			star++;
			space -= 2;
			
		}

	}

}
