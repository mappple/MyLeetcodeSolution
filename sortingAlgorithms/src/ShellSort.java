public class ShellSort {
    public static void main(String[] args) {
       int[] array={8,9,1,7,2,3,5,4,6,0};

        for (int x: shellSort(array)) {
            System.out.println(x);
        }
    }

    public static int[] shellSort(int[] array) {
        if (array.length==0) return array;
        int len=array.length;
        int temp, gap=len/2;
        while (gap>0) {
            for (int i=gap; i<len; i++) {
                temp=array[i];
                int preIndex=i-gap;
                while (preIndex>=0 && array[preIndex]>temp) {
                    array[preIndex+gap]=array[preIndex];
                    preIndex-=gap;
                }
                array[preIndex+gap]=temp;
            }
            gap/=2;
        }
        return array;
    }
}
