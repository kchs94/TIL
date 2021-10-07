package IT도서.doit자료구조와알고리즘.챕6_정렬.src;
/*
* 1.아직 정렬하지 않은 부분에서 가장 작은 키의 값(a[min])을 `선택`합니다.
* 2. a[min]과 아직 정렬하지 않은 부분의 첫 번째 요소를 `교환`합니다.
* */
public class 단순선택정렬 {

    public static void swap(int[] a, int i, int min){
        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }

    public static void selectionSort(int[] a, int n){
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j= i+1; j<n; j++)
                if(a[j] < a[min])
                    min = j;
            swap(a, i, min);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,6,7,4,10,5};

        selectionSort(arr, 9);

        for(int i=0; i<9; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
