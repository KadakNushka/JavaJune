package Lecture2;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			int x = 1;
			while (x<=space) {
			System.out.print("  ");
			x++;
		}
		int i = 1;
		while (i<= star) {
			System.out.print("*"+" ");
			i++;
		}
		row++;
		System.out.println();
		star++;
		space--;
		

	}
	}
}
