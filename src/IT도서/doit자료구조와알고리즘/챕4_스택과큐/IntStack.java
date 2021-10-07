package IT도서.doit자료구조와알고리즘.챕4_스택과큐;

// int형 스택
public class IntStack {
    private int max;    // 스택 용량
    private int ptr;    // 스택 포인터
    private int[] stk;  // 스택 본체


    // 실행 시 예외: 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    // 실행 시 예외: 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException(){}
    }
    
    // 생성자
    public IntStack(int capacity){
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max]; // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {  // 생성 할 수 없음
            max = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException {
        if(ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if(ptr<=0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    // 피크 메서드 peek: 스택 꼭대기에 있는 데이터를 읽는 메소드
    public int peek() throws EmptyIntStackException{
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    // 검색 메서드 indexOf
    public int indexOf(int x) {
        for(int i=ptr-1; 0<= i; i--){ // 정상 쪽에서 선형 검색
            if(stk[i] == x)
                return i;
        }
        return -1;
    }

    // clear 메소드: 스택의 모든 요소를 삭제하는 메소드
    public void clear(){
        ptr = 0;
    }

    // capacity 메소드: 용량을 확인하는 메소드
    public int capacity() {
        return max;
    }

    // size 메소드: 데이터 수를 확인하는 메소드
    public int size() {
        return ptr;
    }
    
    // isEmpty 메소드: 스택이 비어 있는지 검사하는 메소드
    public boolean isEmpty(){
        return ptr<=0;
    }
    
    // isFull 메소드: 스택이 가득찼는지 검사하는 메서드
    public boolean isFull(){
        return max <= ptr;
    }
    
    // dump 메소드: 스택 안의 모든 데이터를 바닥부터 꼭대기 순서로 출력
    public void dump(){
        if(ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else{
            for(int i=0; i<ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }
}
