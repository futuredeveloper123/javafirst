package loopy;

public class scanner_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//키보드로 입력받을 수 있는 인스턴스 생성
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//문자열 입력받기
		System.out.print("write name");
		String name=sc.nextLine();
		System.out.print("name:"+name);
		//정수 입력받기
		
		System.out.print("write su");
		int score=sc.nextInt();
		System.out.print("su:"+score);
		
		//문자열입력받기
		
		System.out.print("write nick");
		
		//숫자입력받고문자입력받을때 nextLine추가
		
		sc.nextLine();
		String nick=sc.nextInt();
		System.out.print("nickname:"+nick);
		
		sc.close();
	}

}
