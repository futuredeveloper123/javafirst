package loopy;

public class while_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		while ( i<3) {
			System.out.println("hello java");
			i=i+1; //i++;로 작성해도됨 

			//책들은 자바만 사용해서 i++ 사용하지만 우리는 여러가지 언어를 하므로
			//공통된 방법을 사용하기 위해서 i = i+1 사용
		}	
		int j=1;
		//image 1,2,3, 출력
		while (j<4) {
			System.out.println("image"+j);
			j=j+1; //image 글자는 그대로 쓰고 숫자만 바꿔주는 형식으로 돌리기,,,,,j<4,,,,,
		}
		{System.out.println("==================");
		}
		int p=1;
		while(p<8) {
			System.out.println("image"+p);
			p=p+2;
		}
		//규칙찾는 생각을 바꿔보기 !!!!!!!!!!!!!!!!!!!!!

		{System.out.println("==================");
		}

		int u=4;
		while(u>0) {
			System.out.println("image"+u);
			u=u-1;//틀린방법은 아니나,,,,
			{System.out.println("==================");
			}
			//이렇게 하는 방법도 있어!!!!!!이게 훨신 쉬어!!!!!
			int t=1;
			while(t<5) {
				System.out.println("image"+(5-t));
				t=t+1;//틀린방법은 아니나,,,,


				//방법을 바꿔서 생각하고...연습해보기!!!!! 경우의 수 찾는것 같음 .....
			}
		}
	}
}























