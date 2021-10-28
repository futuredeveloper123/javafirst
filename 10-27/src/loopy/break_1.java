package loopy;

public class break_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지 출력되는 반복문
		int i=1;
		//3의 배수가 되면 반복문 종료
		//3이 되면 반복문을 더이상 수행하지 않고 종료
		for(i=1;i<=10;i=i+1) {
			if(i%3==0){
				//continue는 3의 배수 빼고 진행/ 브레이크는3배수나오면 끝
				break;}
			{
				System.out.println(i);

			}

		}

	}
}
