package loopy;

public class for_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<5; i++) {
			if(i<3) {
				for(int j=0; j<i+1; j++) {
					System.out.print("*");}
			}
			else {
				for(int j=0; j<5-i; j++) {
					System.out.print("*");
				}{
					System.out.println("");
				}
			}

		}
	}
}