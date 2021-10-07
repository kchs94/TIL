package IT도서.doit자료구조와알고리즘.챕3_검색.삼_이진검색_BinarySearch;
// 이진 검색

import java.util.Scanner;

public class BinarySearch {
    // 요솟수가 n인 배열 arr에서 key와 같은 요소를 이진 검색합니다.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("배열의 길이: ");
        int num = in.nextInt(); // 요솟수
        int[] arr = new int[num];   // 길이가 num인 배열 arr 선언

        System.out.println("배열의 길이만큼 오름차순으로 입력하세요.");
        System.out.print("arr[0]: ");
        arr[0]= in.nextInt();   // 비교를 위해 첫 요소값 먼저 입력

        for(int i=1; i<num; i++){   // 두번째 요소 부터
            do{
                System.out.print("arr[" + i + "]: ");
                arr[i] = in.nextInt();
            } while(arr[i] < arr[i-1]); // 바로 앞 요소보다 작으면 다시 입력
        }

        System.out.print("검색 하고싶은 값 입력: ");
        int key = in.nextInt();

        int index = binarySearch(arr,key);  //배열 arr에서 key 값을 갖는 요소를 검색

        if(index == -1)
            System.out.println("그런 값의 요소가 없습니다.");
        else
            System.out.println(index);
    }

    public static int binarySearch(int[] arr, int key){
        int pl = 0;     // 검색 범위의 첫 인덱스
        int pr = arr.length-1;  // 검색 범위의 끝 인덱스

        do{     // 왜?
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            if(arr[pc] == key)
                return pc;  // 검색 성공
            else if(arr[pc] < key)
                pl = pc + 1;        // 검색 범위를 뒤쪽 절반으로 좁힘니다.
            else    // key < arr[pc]인 경우
                pr = pc - 1;
        } while( pl <= pr);  // 정상 검색범위 일 때 까지
        
        return -1;  // 검색 값을 가지는 요소가 없을 경우.
    }
}
