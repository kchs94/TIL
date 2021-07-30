package IT독서.doit자료구조와알고리즘.챕3_검색.삼_이진검색_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class 이진탐색메서드이용하기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("배열의 길이를 입력하세요: ");
        int N = in.nextInt();
        int[] arr = new int[N];

        System.out.print("오름차순으로 값을 입력하세요: ");
        for(int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("검색할 값을 입력하세요: ");
        int value = in.nextInt();

        int index = Arrays.binarySearch(arr, value);  // 배열  arr에서 키 값이 key인 요소 검색

        if(index < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(value + "의 값을 갖는 요소의 인덱스 값: "  +index);
    }
}
