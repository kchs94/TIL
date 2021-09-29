# StringTokenizer 클래스

- `StringTokenizer 클래스`: 특정 기준을 가지고 문자열을 쪼개야 할 때 사용하는 클래스입니다.

- 예를 들어 `PM:08:45`의 경우 3가지 정보(PM,08,45)가 콜론을 기준으로 나뉘어 있습니다.
- 이때 특정 문자열을 나누는 기준이 되는 것을 `구분자(Delimiter)`라고 합니다.
- 또한 구분자로 나뉘어진 문자열 조각을 `토큰(Token)`이라고 합니다.

생성자는 다음과 같습니다.
``` java
public StringTokenizer(String str, String delim)
```

앞서 보여드린 `"PM:08:45"` 문자열로 토큰을 추출하려면 
다음과 같이 인스턴스를 생성하면 됩니다.

```java
StringTokenizer st = new StringTokenizer("PM:08:45", ":");
```

또한 구분자를 여러 문자로 할 수 있습니다. 예를들어
다음과 같은 문자열에서 숫자만 뽑으려 한다면 다음과 같이
인스턴스를 생성하면 됩니다.

`"12 + 36 -8 / 2 = 44"`

```java
StringTokenizer st = new StringTokenizer("12 + 36 -8 / 2 = 44", "+-/= ");
```

위 문장의 구분자에 공백이 포함되어있음을 주의하세요.

```java
import java.util.StringTokenizer;

public class TokenizeString {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("PM:08:45", ":");

        while(st1.hasMoreTokens())
            System.out.print(st1.nextToken() + ' ');
        System.out.println();

        StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/= ");

        while(st2.hasMoreTokens())
            System.out.print(st2.nextToken() + ' ');
        System.out.println();
    }
}

```

- `public boolean hasMoreTokens()`: 반환할 토큰이 남아 있는지 확인하는 메소드.
- `public String nextToken()`: 토큰을 반환하는 메소드.

만약 구분자도 토큰으로 반환하고 싶다면 다음과 같이 인스턴스를 생성하면 됩니다.

```java
StringToknizer st = new StringTokenizer("PM:08:45", ":", true);
```

