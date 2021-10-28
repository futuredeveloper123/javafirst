package loopy;

public class toggle_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			if( i % 2 == 0 ) {
				System.out.println("on");}
			else{
				System.out.println("off");}
		}

	}

}
