package loopy;

public class Loopy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//20과17을 저장하는변수 생성
		int data1=20; //00010100
		int data2=17; //00010001

		System.out.println("data1 & data2 : "+( data1&data2));//00010000
		System.out.println("data1 | data2 : "+( data1|data2));//00010101
		System.out.println("data1 ^ data2 : "+( data1^data2));//00000101


		//실수를 저장하는 변수2개 생성
		double d1=2.7;
		double d2=9.1;
		//d1>d2이면d1이남고 아니라면 d2 가 남음
		double max = d1 > d1? d1 : d2;
		System.out.println("큰 수는: " + max);


		//-=,+=는 변수에 상수값을 계산해서 리턴함.
		int x=30;
		x-=20;
		System.out.println(x);

		int a=10;
		a+=20;
		System.out.println(a);


		int time=113507;//113507초가 몇시간 몇 분 몇 초인지 계산
		int hour = time/3600;
		//int minute = (time-hour*3600)/60;//시간이 가져간것제외하고 분으로 나누기
		int minute=(time%3600)/60;
		//int second = time-(hour*3600)-(minute*60);//시간과분이가져간것제외하고 초로 나누기
		int second=time%60;
		System.out.println(hour+"시"+minute+"분"+second+ "초");



		//출력


		int z= 30;
		int y= 70;

		//x와y의 데이터 교환하기 -swap
		//2개의 컵의 내용물을 어떻게 바꿀수 있는가 힌트

		int temp= z;
		z=y;
		y=temp; //다른 변수를 만들어서 바꿔주면돼....... ......개....간단...데스.....
		//계산하려면 생각이 참 많이 필요한것같음......음......프로그래밍으로 생각하기 뭘하든....
		//알고리즘으로 생각.................후

		System.out.println("z:"+z);
		System.out.println("y:"+y);		







	}

}
