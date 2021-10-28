package loopy;

public class toggle_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3개 시간단위로 출력

		int i=0;
		for(i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);}
			catch(Exception e) {}

			if(i%3==0) {
				System.out.println("red");}
			else if (i%3==1) {
				System.out.println("blue");}
			else {
				System.out.println("yellow");}



		}

	}

}
