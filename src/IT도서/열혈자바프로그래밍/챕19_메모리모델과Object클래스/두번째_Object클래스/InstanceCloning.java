package IT도서.열혈자바프로그래밍.챕19_메모리모델과Object클래스.두번째_Object클래스;

class Point implements Cloneable{
    private int xPos;
    private int yPos;

    public Point(int x, int y){
        xPos = x;
        yPos = y;
    }

    public void showPosition(){
        System.out.printf("[%d, %d]",xPos,yPos);
        System.out.println();
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class InstanceCloning {
    public static void main(String[] args) {
        Point org = new Point(3, 5);
        Point cpy;

        try{
            cpy = (Point)org.clone();
            org.showPosition();
            cpy.showPosition();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
