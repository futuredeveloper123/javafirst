package loopy;

public class flag_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2가지 상태 번갈아가면서10번수행하기
		boolean flag=true;
		for(int i=0; i<10; i=i+1) {
			if(flag==true) {
				System.out.println("flag on");
			}else {
				System.out.println("flag off");
			}flag =!flag; //true와 false번갈아가면 flag에 저장 
		}
////////////////////////////////인덱스 변수를 이용해서 반복문이 끝까지 수행되어있는지 확인
		
		int j;
		
		boolean f=true;

		for( j=0; j<5; j=j+1) {
			if(j%4==1) {
				break;
			}
			System.out.println("반복문이 마지막까지 했는지 확인");
		}
		
		if(j==5) {
			System.out.println("끝까지 수행");
		}else {
			System.out.println("반복문 중간에 종료");
		}
		
		boolean f=true;

	}

	
}
////////////////////////////////
