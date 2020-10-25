package sec01_datatype.EX02_NamingVariableAndConstant;

/*변수와 상수의 이름 짓기*/

public class NamingVariableAndConstant {	
    public static void main(String[] args) {		
        //변수의 이름
        boolean aBcD;		//가능은 하지만 권장사항 위배
        byte 가나다;
        short _abcd;
        char $ab_cd;
        //int 3abcd;		//불가능 - 숫자는 제일 앞에 올 수 없다.
        long abcd3;
        //float int;		//불가능 - 자바에서 사용하는 키워드
        double main;		//가능 - 메서드 이름과 변수이름은 동일해도 무관
        //int my Work;		//불가능 스페이스 특수키가 포함
        String myClassName;
        int ABC;			//가능은 하지만 권고사항 위배
		
        //상수이름
        final double PI;
        final int MY_DATA;
        final float myData;	//가능은 하지만 권고사항 위배		
    }	
}
