package Lecture2;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int row = 1;
		int star = 1;
		while (row <= n) {
			if (row<=4) {
				int i = 1;
				while (i<=star) {
					System.out.print("*"+" ");
					i++;
				}
				star++;
			}
			else {
				int i = 1;
				while (i<=star) {
					System.out.print("*"+" ");
					i++;
				}
				star--;
			}
			row++;
			System.out.println();
		}

	}

}
