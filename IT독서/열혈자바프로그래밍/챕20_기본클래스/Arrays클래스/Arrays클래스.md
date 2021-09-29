# Arrays 클래스

java.util.Arrays 클래스는 배열 조작에 도움을 주는 메소드들이 포함되어 있습니다.
정의된 메소드들을 이용하여 다음을 수행할 수 있습니다.

- 배열의 복사
- 배열의 비교
- 배열의 정렬
- 배열의 탐색

## 배열 복사하기

`Arrays.copyOf()`를 이용하여 배열을 복사해 새로운 배열을 생성할 수 있습니다.

메소드의 호출된 자리에는 생성된 배열의 참조 값(=주소 값)이 반환됩니다.

original에 전달된 배열을 첫 번째 요소부터 newLength의 길이만큼 복사합니다.

```java
public static int[] copyOf(int[] original, int newLength)
```

```java
import java.util.Arrays;

public class CopyOfArrays {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};

        // 배열 전체를 복사
        double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);

        // 세 번재 요소까지만 복사
        double[] arCpy2 = Arrays.copyOf(arOrg, 3);
        
        // 두 번째 요소부터 네 번재 요소까지 복사
        double[] arCpy3 = Arrays.copyOf(arOrg, 1, 5);
        
        for(double d : arCpy1)
            System.out.print(d + "\t");
        System.out.println();

        for(double d: arCpy2)
            System.out.print(d + "\t");
        System.out.println();

        for(double d: arCpy3)
            System.out.print(d + "\t");
        System.out.println();
    }
}
```

만약 배열을 새로 생성하지 않고 존재하는 배열에 복사하려는 경우에는 java.lang.System 클래스의 
`arraycopy`메소드를 사용하면 됩니다.

```java
public class CopyOfSystem {
    public static void main(String[] args) {
        double[] org = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] cpy = new double[3];

        // 배열 org의 인덱스 1에서 배열 cpy 인덱스 0으로 세 개의 요소 복사하기
        System.arraycopy(org, 1, cpy, 0, 3);

        for(double d : cpy)
            System.out.print(d + "\t");
        System.out.println();
    }
}
```

## 배열 비교하기
java.util.Arrays 클래스의 `equals` 메소드로 배열을 비교할 수 있습니다.

```java
public static boolean eqauls(int[] a, int[] a2)
```
매개변수 a와 a2로 전달된 배열의 내용을 비교하여 boolean 값을 반환합니다.

```java
import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = Arrays.copyOf(ar1, ar1.length); // 배열 복사하기

        System.out.println(Arrays.equals(ar1, ar2));    // 배열 비교하기
    }
}
```

---

```java
public static boolean equals(Object[] a, Object[] a2)
```

- 인스턴스의 참조 값을 저장하고 있는 두 배열을 비교할 경우 오버라이딩을 하지 않으면
  참조 값을 비교하고, 참조 값이 아닌 `참조하는 인스턴스 내용`을 비교하려면 equals 메소드를
  오버라이딩 해야합니다.

```java
class INum{ // equals 메소드 오버라이딩 안한 예 --> 참조값 비교
    private int num;
    public INum(int num){
        this.num = num;
    }
}

public class ArrayObjEquals {
    public static void main(String[] args) {
        INum[] ar1 = new INum[3];
        INum[] ar2 = new INum[3];

        ar1[0] = new INum(1); ar2[0] = new INum(1);
        ar1[1] = new INum(2); ar2[0] = new INum(2);
        ar1[2] = new INum(3); ar2[0] = new INum(3);

        System.out.println(Arrays.equals(ar1, ar2));
    }
}
```

## 배열 정렬하기
``` java
public static void sort(int[] a)
```
- 매개변수 a에 전달된 배열을 오름차순으로 정렬합니다.

``` java
public static void sort(Object[] a)
```
- 객체를 원소로 갖는 배열에 대한 정렬
- 인터페이스 Comparable의 메소드 `int compareTo(Object o) ` 메소드 구현을 통해
인스턴스의 순서를 판단하는 기준을 만듭니다.