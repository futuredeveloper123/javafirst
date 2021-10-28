package loopy;

public class randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3개의 정수를 저장 
		/*
		int score1=90;
		int score1=99;
		int score1=87;
		*/
		//3개 출력하기 
	    
		int[] scores = {90,99,87};
		for(int i=0; i<scores. length; i=i+1) {
			System.out.println(scores[i]);
		}
		for(int score : scores) {
			System.out.println(score);
			//배열은 반복문을 이용해서 모든 데이터에 접글할수있어서 처리하는 문장이
			//간결해짐..
		}
	}

}
