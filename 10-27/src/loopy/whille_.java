package loopy;

public class whille_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			//5초 대기 - 자바는 시간을 1/1000 초 단위로 사용
			try {
				Thread.sleep(5000);
			}catch(Exception e) {}

			System.out.println("무한 반복");
		}

	}

}


