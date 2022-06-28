package Lecture3;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;
		while (row <= 9) {
			if (row <= 4) {
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
                space+=2;
                star--;
		}
			else {
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
			space-=2;
			star++;
	}
			row++;
			System.out.println();
		}
	}
}
		
