import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        int money; // 금액
        int type[] = {50000,10000,5000,1000,500,100,10}; // 지폐종류

        Scanner s = new Scanner(System.in);

        System.out.print("금액을 넣으세요 : ");
        money = s.nextInt();

        for(int i=0; i<type.length; i++) {
            int count = money/type[i];
            money %= type[i];

            System.out.println(type[i] + "원?" + count +"개");
        }
    }
}
