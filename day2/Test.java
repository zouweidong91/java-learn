
public class Test{
    public static void main(String[] args){
        // int i = 0;
        // i = 1;

        // byte b = 12;
        // int m = b;

        /*
        int i = 1;
        short s = 2;
        byte b = 3;
        int m = i+s+b;  // 将所有数据转化为容量最大的那种数据类型
        */
        String str = "str";
        int i = 1;  // 基本数据类型都被转化为 String类型
        String str0 = "abc" +1 +2 +3;  // abc123
        String str1 = 3+4+"abc";  //7abc

        byte b = 9;
        int i0 = b;
        // 自动隐式转换

        int k = 7;
        byte b0 = (byte)k;
        System.out.println(b0);

        System.out.println('*' + '\t' + '*');
        System.out.println("*" + '\t' + '*');

        int i2 = 1;
        int i1 = 1;
        i2 = i1 = 1;  //赋值运算
    }
}