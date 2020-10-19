package sec02_primarydatatype.EX05_TypeCasting_2;

/*자동타입변환과 수동타입변환*/

public class TypeCasting_2 {
	public static void main(String[] args) {
		
		//#1. 자동타입변환 (업캐스팅)
		float value1 = 3;
		long value2 = 5;
		double value3 = 7;
		byte value4 = 9; //저장할 수 있는 값의 범위값을  byte나 short에 입력하는 경우 정수는 각각 byte나 short로 캐스팅
		short value5 = 11;//저장할 수 있는 값의 범위값을  byte나 short에 입력하는 경우 정수는 각각 byte나 short로 캐스팅
		
		System.out.println(value1); 
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		//#2. 수동 타입변환
		byte value6 = (byte)128;
		int value7 = (int)3.5;
		float value8 = (float)7.5;
		
		System.out.println(value6); 
		System.out.println(value7);
		System.out.println(value8);
		
	}
}













