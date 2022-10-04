public class Test1 {
    public static void main(String[] args) {

        // 1부터 5까지 출력 (1씩 증가)
        // 증감식 i++ 와 i+=1 은 같은 뜻.
        for(int i=0; i<5; i+=1) {
            System.out.print(i);
        }
        System.out.println();

        // 2,4,6,8,10 을 출력(2씩 증가)
        for(int i=0; i<=10; i+=2) {
            System.out.print(i);
        }
        System.out.println();

        // 2,4,6,8,10 을 출력(2씩 증가) _ 강사님
        for(int i=1; i<=5; i+=1) {
            System.out.print(i*2);
        }
        System.out.println();

    }
}
