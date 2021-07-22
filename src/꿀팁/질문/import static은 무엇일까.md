# static import란 무엇인가요?

- static import는 일반적인 import와 다르게 변수나 메소드에 접근할 때,
패키지, 클래스명없이 접근하는 것을 가능하게 해주는 import입니다.
  
```java
import static java.lang.Math.*; // static import

public class StaticImportCase{
    public static void main(String[] args){
        Double pi = Math.PI;// 클래스명 사용(o)
        Double pi2 = PI;    // 클래스명 없이 접근 가능
    }
}
```


## 왜 사용하는거에요?
결론부터 말하면 `코드의 가독성`을 향상키실 수 있습니다.
특히 테스트 프레임워크인 JUnit을 사용할 때 적절히 사용할 수 있습니다.

```java
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StaticImportTestCase{
    
    @Test
    public void nonStaticImport(){
        Assert.assertThat(1, CoreMatchers.is(1));
    }
    
    @Test
    public void staticImport(){
        assertThat(1, is(1));   // 코드 가독성 향상
    }
}
```

우리가 왜 `코드의 가독성`을 중요하게 생각해야 하는지는 클린 코드에서 나온
한 문장만 읽으면 됩니다.

`코드읽는시간: 코드작성시간 = 10:1`