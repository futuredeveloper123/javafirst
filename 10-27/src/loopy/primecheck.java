package loopy;

public class primecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//su가 소수인지 확인 //
		int su=11;
		
		boolean flag=true;
		
		for(int i=2; i<su/2+1 ; i = i+ 1 ) {
		
		if(su%i==0 ){
			flag=false;
			break;
		}
		}
		{
			if(flag==true) {
			System.out.println("소수");
		}else {
			System.out.println("소수no");
		}
		

	}
	}
}
