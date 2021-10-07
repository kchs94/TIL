package IT도서.doit자료구조와알고리즘.챕4_스택과큐;


// int형 큐
public class IntQueue {
    private int max;    // 큐의 용량
    private int front;  // 첫 번째 요소 커서
    private int rear;   // 마지막 요소 커서
    private int num;    // 현재 데이터 수
    private int[] que;  // 큐 본체

    // 실행 시 예외: 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException(){}
    }

    // 실행 시 예외: 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException(){}
    }
    
    // 생성자
    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];             // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e){       // 생설할 수 없을 때
            max = 0;
        }
    }

    // enque 메소드: 레어에 데이터를 넣음
    public int enque(int x) throws OverflowIntQueueException {
        if( max <= num)
            throw new OverflowIntQueueException();  // 큐가 가득참
        que[rear++] = x;
        num++;
        if(rear == max)
            rear = 0;
        return x;
    }

    // deque 메서드: 프론트에서 데이터를 뺌
    public int deque() throws EmptyIntQueueException {
        if(num <= 0)    // 빼기전 뺄 데이터가 있는가 확인
            throw new EmptyIntQueueException();  // 큐가 비어있음
        int x = que[front++];
        num--;
        if(front == max)
            front = 0;
        return x;
    }

    // peek(): 맨 앞에 있는 데이터 조회
    public int peek() throws EmptyIntQueueException {
        if(num<= 0) // 큐가 비어있으면
            throw new EmptyIntQueueException();
        return que[front];
    }

    // indexOf(): 값을 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indexOf(int x){
        for(int i=0; i<num; i++){
            int index = (i + front) % max;
            if(que[index] == x) // 검색 성공
                return index;
        }
        return -1;              // 검색 실패
    }

    // clear(): 큐를 비웁니다.
    public void clear(){
        num = front = rear = 0;
    }

    // capacity(): 큐의 크기를 반환합니다.
    public int capacity(){
        return max;
    }

    // size(): 큐에 쌓여있는 데이터 수를 반환
    public int size(){
        return num;
    }

    // isEmpty(): 큐가 비어있는가?
    public boolean isEmpty(){
        return num<=0;
    }

    // isFull(): 큐가 가득찼는가?
    public boolean isFull(){
        return max <= num;
    }

    // dump(): 큐안의 모든 데이터를 프론트에서부터 출력
    public void dump(){
        if(num <= 0)
            System.out.println("큐가 비어 있습니다.");
        else{
            for(int i=0; i<num; i++)
                System.out.print(que[(i+front)% max] + " ");
            System.out.println();
        }
    }
}
