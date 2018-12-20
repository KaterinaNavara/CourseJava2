public class Test {
    public static void main(String[] args) {
        int[] mas = {9, -43, 2, -34, 4, -2, -39, 5, -32, -37, -48};
        int ibeg = 0;
        int iend = mas.length;
        for (int i = ibeg; i < iend; i++, ibeg++) {
            if (mas[i] < 0) {
                for (int j = iend - 1; j > ibeg; j--, iend--) {
                    if (mas[j] > mas[j-1]) {
                        int t = mas[i];
                        mas[i] = mas[j];
                        mas[j] = t;
                        break;
                    }

                }
            }
        }

        for (int i:mas){
            System.out.println(i + ",");
        }
//        int arr[] = {5, -2, 3,-4,8,-10,-22,10,-5};
//        int countNeg = 0;
//        int countPositive = 0;
//        while (countNeg+countPositive <arr.length-1) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] >= 0) {
//                    while (arr[arr.length-1-countPositive] >= 0) {
//                        countPositive++;
//                    }
//                    int tmp = arr[arr.length -1 - countPositive];
//                    arr[arr.length -1 - countPositive] = arr[i];
//                    arr[i] = tmp;
//                } else {
//                    countNeg++;
//                }
//
//            }
//        }
//        System.out.println("mas:");
//        for (int i:arr){
//            System.out.println(i + ",");
//        }
    }

}




