package Lecture3;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int row = 1;
		int star = 1;
		while (row <= n) {
				int i = 1;
				while (i<=star) {
					System.out.print("*"+" ");
					i++;
				}
			row++;
			System.out.println();
			if (row <= 4) {
			star++;
		}
			else {
				star--;
			}

	}

}
}
