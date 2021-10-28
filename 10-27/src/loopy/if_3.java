package loopy;

public class if_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//score가 80이상이면 장학금 80미만60이상이면보통, 60미만이면 경고

		int score=89;

		if (score>=80)
			System.out.println("장학금");
		else if(score<80 && score>=60)
			System.out.println("보통");
		else if(score<60)
			System.out.println("경고");


		int scor =48;
		//점수는 1-100까지 있다고 가정하고, 90-100수/80-89우/70-79미...

		if(scor>=90&&score>=100)
			System.out.println("수");
		else if(scor<=89 && scor>=80)
			System.out.println("우");
		else if(scor<79 && scor>=70)
			System.out.println("미");
		else if(scor<69 && scor>=60)
			System.out.println("양");
		else if(scor<59 && scor>=0)
			System.out.println("가");


		int sco=20;

		if(sco>=90)
			System.out.println("a");
		else if(sco>=80)
			System.out.println("b");
		else if(sco>=70)
			System.out.println("c");
		else if(sco>=60)
			System.out.println("d");
		else if(sco>=50)
			System.out.println("e");
		else
			System.out.println("f");
		//else는 프로그램을 강건하게 만들어줌.............조건문을 잘 써야해!






	}

}


