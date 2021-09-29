package IT독서.doit자료구조와알고리즘.챕3_검색.이_선형검색_linearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); // 요솟수
        int[] x = new int[num]; // 길이가 num인 배열


        // 요솟값 입력
        for(int i=0; i<num; i++){
            x[i] = in.nextInt();
        }

        int key = in.nextInt(); // 검색할 키 값

        int index = linearSearch(x, key); // key값을 갖고 있는 요소의 인덱스 값.

        if(index == -1) // 찾는 값이 없으면
            System.out.println("값이 존재 하지 않습니다.");
        else    // 차즌 값이 있으면
            System.out.println(index);
    }
    
    // 반환값: 찾는 값이 있는 요소의 인덱스
    public static int linearSearch(int[] arr, int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;   // 검색 성공
            }
        }
        
        return -1;  // 검색 실패
    }
}
