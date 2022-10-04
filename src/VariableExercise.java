public class VariableExercise {
    public static void main(String[] args) {

        // 50000 ~ 10 배열에 넣기
        int[] arr = new int[]{50000,10000,5000,1000,500,100,50,10};

        // 계산기
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;

        // arr 0번 + arr1 ---1
        result1 = arr[0] + arr[1] ;
        // arr 2번 + arr3 ---1
        result2 = arr[2] + arr[3];
        // 1번 - 2번
        result3 = result1 + result2;
        // 각 1번 결과, 2번결과, 3번결과 모두 출력
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
