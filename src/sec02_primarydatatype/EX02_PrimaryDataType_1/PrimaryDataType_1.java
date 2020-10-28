package sec02_primarydatatype.EX02_PrimaryDataType_1;

/*부울대수/정수/실수 값의 저장 및 출력*/

public class PrimaryDataType_1 {	
    public static void main(String[] args) {		
        //#1. boolean : true / false
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1); //true
        System.out.println(bool2); //false
        System.out.println();
		
        //#2. 정수 (byte, short, int, long) : 음의 정수 / 0 / 양의 정수
        byte value1 = 10;
        short value2 = -10;
        int value3 = 100;
        long value4 = -100L;
        System.out.println(value1); //10
        System.out.println(value2); //-10
        System.out.println(value3); //100
        System.out.println(value4); //-100
        System.out.println();
		
        //#3. 실수 (float, double) : 음의 실수 / 0 / 양의 실수
        float value5 = 1.2F;
        double value6 = -1.5;
        double value7 = 5;
        System.out.println(value5); //1.2
        System.out.println(value6); //-1.5
        System.out.println(value7); //5.0				
    }	
}
