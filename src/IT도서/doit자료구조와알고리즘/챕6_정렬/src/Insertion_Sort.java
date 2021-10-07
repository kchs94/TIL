package IT도서.doit자료구조와알고리즘.챕6_정렬.src;

public class Insertion_Sort {

    public static void insertion_sort(int[] a){
        insertion_sort(a, a.length);
    }


    private static void insertion_sort(int[] a, int size){

        for(int i=1; i<size; i++){  // 두 번째 원소부터 정렬.
            // 타켓 넘버
            int target = a[i];

            int j = i-1;    // 이전 원소 위치.

            // 타켓이 이전 원소(=왼쪽 원소)보다 크기 전까지 반복
            while(j>=0 && target < a[j]){ // 비교
                a[j+1] = a[j];  // 반쪽 교환(왼쪽-->오른쪽)
                j--;
            }
            /*
            * 위 반복문에서 탈출하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
            * 타켓 원소는 j번재 원소 뒤에 와야한다.
            * 그러므로 타겟은 j+1에 위치하게 된다.
            *
            * */
            a[j+1] = target;    // 완성 교환(오른쪽-->왼쪽)
        }
    }

    public static void main(String[] args) {
        int[] a = {7,3,2,8,9,4,6,1,5};

        insertion_sort(a);

        for(int i: a)
            System.out.println(i);
    }
}
