import java.util.Scanner;

public class Study {
    public static void main(String[] args) {

        // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        for(int x=0; x<=5; x++) {
            for(int y=0; y<=x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();

        switch(score/10) {
            case 10:
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            case 6 :
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

        // 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
        int a = s.nextInt();
        int b = s.nextInt();

        if(a>b) {
            System.out.println(">");
        } else if (a<b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        //연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
        //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        //예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
        // 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
        int year = s.nextInt();

        if(year%4 == 0 && year%100 !=0 || year%400 == 0 ) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
