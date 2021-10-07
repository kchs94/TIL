## MVC와 템플릿엔진
- MVC: Model, View, Controller
- 역할에 따라 파일을 3가지로 분리합니다. 
    - View: 디자인적 요소
    - Controller: 비즈니스적 로직
    - Model: 비즈니스적 로직
    
#### 팁
- 타임리프의 장점: 서버없이 html 껍데기를 바로 열 수 있다.
- 파라미터 정보: ctrl + p
- url에서 ?를 이용해 파라미터를 넘겨줄 수 있다.(GET방식)
- $: 모델에서 값을 꺼낸다는 의미
- viewresolver: view를 찾아주고 템플릿 엔진을 찾아주는 역할을 합니다.
- 

### xml vs json
- xml
  - html 태그를 말함
  
- json
  - 가벼움
  
### 객체를 제이슨으로 바꿔주는 프로그램
- MappingJackson2HttpMessageConverter: 객체를 json으로 바꿔줌

