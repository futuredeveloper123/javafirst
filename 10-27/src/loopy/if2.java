package loopy;

public class if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 80;
		
		if(score>=60)
			System.out.println(" 합격");
		
		else
			System.out.println("불합격");
			
		
		
		int su = 77; //수가 짝수이면 짝수 그렇지 않으면 홀수라고 출력
		
		if(su%2==0)
			System.out.println(" 짝수");
		
		else 	
			System.out.println(" 홀수");
			
			
		int year =2024;  //year가 윤년이라면 윤년이라고 출력하고 그렇지 않으면 윤년이 아니라고출력
		//4의 배수이고 100의 배수는 아닌경우
		//400의 배수인 경우
		if(year%4==0 && year%100 != 0 || year%400==0)//year%4==0 &&그리고 year%100 != 0 ||또눈 year%400==0
		//윤년은 4의배수이고100의배수는 아닌경우 이거나 400의 배수
			System.out.println(" 윤년");
		else
			System.out.println(" 윤년아님");
	}

}


