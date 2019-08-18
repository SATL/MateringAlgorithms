package khan.recursion;

public class MergeSort {


    public static void mergeSort(int[] array, int start, int end){
        if(start<end){
            int middle =(start + end )/ 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle+1, end);
            merge(array, start, middle, end);
        }
    }

    public static void merge(int[] array, int start, int middle, int end){
        int k  = start;

        int[] lowHalf = new int[middle-start+1];
        int[] highHalf = new int[end- middle];

        for(int i=0; k<=middle; k++, i++){
            lowHalf[i] = array[k];
        }

        for(int i=0; k<=end; k++, i++){
            highHalf[i] = array[k];
        }

        k = start;
        int i = 0;
        int j = 0;

        while(i < lowHalf.length && j <highHalf.length){
            if(lowHalf[i]<highHalf[j]){
                array[k] = lowHalf[i];
                i++;
            }else{
                array[k] = highHalf[j];
                j++;
            }
            k++;
        }

        while(i<lowHalf.length){
            array[k] = lowHalf[i];
            i++;
            k++;
        }

        while(j <highHalf.length){
            array[k] = highHalf[j];
            j++;
            k++;
        }

    }

    public static void show(int[] array){
        for(int i:array){
            System.out.print(i+", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] array = new int[]{3, 7, 12, 14, 2, 6, 9, 11};
        show(array);
        merge(array, 0, 3, array.length-1);
        show(array);

        int[] array2 = new int[]{14, 7, 3, 12, 9, 11, 6, 2};
        show(array2);
        mergeSort(array2, 0, array2.length-1);
        show(array2);

    }
}
