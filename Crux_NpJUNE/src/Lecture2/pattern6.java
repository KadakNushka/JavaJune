package Lecture2;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
	    int row = 1;
		int star = n;
		int space = 0;
		while (row<=n) {
			//space loop
			int j = 1;
			while(j <= space) {
			System.out.print("  ");
			j++;
		}
		//star loop
		int i = 1;
				while(i <= star) {
					System.out.print("*"+" ");
					i++;
				}
		//next row prep
		row++;
		System.out.println();
		star--;
		space += 2;
		

	}
	}
}
