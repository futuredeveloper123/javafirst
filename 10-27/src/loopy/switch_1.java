package loopy;

public class switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu=1;

		switch(menu) {
		case 0 :
			System.out.println("한식");
			break;
		case 1 :
			System.out.println("분식");
			break;
		case 2 :
			System.out.println("일식");
			break;
		case 3 :
			System.out.println("약식");
			break;

		default :
			System.out.println("아무거나");
			break;
		}



		//final을 앞에 붙이면 읽기 전용 변수가 됨
		//읽기전용은 변수이름을 모두 대문자!!!!!!!!!!!!!!!!로 씀 
		final int KOREA=0;
		final int CHINA=1;
		final int JAPAN=2;
		final int SNACK=3;
		switch(menu) {
		case KOREA:
			System.out.println("한식");
			break;
		case CHINA:
			System.out.println("ㅈ중");
			break;
		case JAPAN:
			System.out.println("일식");
			break;
		case SNACK:
			System.out.println("간식");
			break;

		}


	}

}
