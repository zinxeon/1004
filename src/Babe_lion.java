public class Babe_lion {
    public static void main(String[] args) {

        // 배열에 넣기
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;

        System.out.printf("0번에는 %d가 들어있습니다.\n", arr[0]);
        System.out.printf("1번에는 %d가 들어있습니다.\n", arr[1]);
        System.out.printf("2번에는 %d가 들어있습니다.\n", arr[2]);
        System.out.printf("3번에는 %d가 들어있습니다.\n", arr[3]);
        System.out.printf("4번에는 %d가 들어있습니다.\n", arr[4]);

        System.out.println();

        // 배열에 5만원~ 10원
        int[] arr1 = new int[8];
        arr1[0] = 50000;
        arr1[1] = 10000;
        arr1[2] = 5000;
        arr1[3] = 1000;
        arr1[4] = 500;
        arr1[5] = 100;
        arr1[6] = 50;
        arr1[7] = 10;
        // 21~29 줄의 Array 축약형
//        int[] arr1 = new int[]{50000,10000,5000,1000,500,100,50,10};

        // 37~44을 for문으로 작성
        for(int i=0; i<8; i++) {
            System.out.printf("%d번에는 %d가 들어있습니다.\n", i, arr1[i]);
        }
//        System.out.printf("0번에는 %d가 들어있습니다.\n", arr1[0]);
//        System.out.printf("1번에는 %d가 들어있습니다.\n", arr1[1]);
//        System.out.printf("2번에는 %d가 들어있습니다.\n", arr1[2]);
//        System.out.printf("3번에는 %d가 들어있습니다.\n", arr1[3]);
//        System.out.printf("4번에는 %d가 들어있습니다.\n", arr1[4]);
//        System.out.printf("5번에는 %d가 들어있습니다.\n", arr1[5]);
//        System.out.printf("6번에는 %d가 들어있습니다.\n", arr1[6]);
//        System.out.printf("7번에는 %d가 들어있습니다.\n", arr1[7]);
//        System.out.println();

    }
}
