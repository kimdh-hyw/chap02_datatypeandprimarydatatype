package sec02_primarydatatype.EX04_TypeCasting_1;

/*두 가지 타입 변환 방법*/

public class TypeCasting_1 {	
    public static void main(String[] args) {		
        //#1. 캐스팅 방법
        //@1-1 캐스팅 방법 1 (데이터타입)
        int value1 = (int)5.3;
        long value2 = (long)10;
        float value3 = (float)5.8;
        double value4 = (double)16;
        
        System.out.println(value1); //5
        System.out.println(value2); //10
        System.out.println(value3); //5.8
        System.out.println(value4); //16.0
        System.out.println();
        
        //@1-2 캐스팅 방법 2 (L, F)
        long value5 = 10L;
        long value6 = 10l;
        float value7 = 5.8F;
        float value8 = 5.8f;
        
        System.out.println(value5); //10
        System.out.println(value6); //10
        System.out.println(value7); //5.8
        System.out.println(value8); //5.8
    }	
}
