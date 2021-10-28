package loopy;

public class for_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for에서 두개의 실행물 할때는 컴마,,,,,,,,,,,,,,
		int i,j;
		for(i=0,j=0;j<3;i=i+1,j=j+1){
			System.out.println("for"+i+j);
			for(;;)
				//()안의 내용을 생략하면 무한 반복되거나 한 번도 수행되지 않음. .
			{System.out.println("for"+i+j);}

		}

	}

}
