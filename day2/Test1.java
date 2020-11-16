

public class Test1{
    public static void main(String[] args){
        int i = 0;
        int k = 1;
        System.out.println(i != 0 & ++k == 2);  //单个& 时，两边都参与运算
        System.out.println(k);
        System.out.println(2&1); //位运算符

        int i0 = 1;
        int k0 = i0 > 0 ? 1 : 0;
        System.out.println(k0); //三元运算符
    }
}