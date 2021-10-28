package loopy;

public class if4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = "looy";
		String pw = "12345";

		if ( id == "loopy" && pw=="1235" )
			System.out.println("로그인성공");
		else if ( id == "loopy" && pw !="1235")
			System.out.println("비밀번호 틀림");
		else if (id!="loopy")
			System.out.println("없는아이디");
		//나중에 아이디와 비번은 입력 화면에서 읽어오고 데이터를 데이터베이스와 비교하면 실제 로그인가능

	}

}
