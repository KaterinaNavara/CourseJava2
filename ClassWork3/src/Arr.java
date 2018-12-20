public class Arr {
    public void arraySortByNegativeOrPositive(int[] arr) {
        int countNeg = 0;
        int countPositive = 0;
        while (countNeg+countPositive <arr.length-1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    while (arr[arr.length - countPositive] > 0) {
                        countPositive++;
                    }
                    int tmp = arr[arr.length - countPositive];
                    arr[arr.length - countPositive] = arr[i];
                    arr[i] = tmp;
                } else {
                    countNeg++;
                }

            }
        }
    }
}
