## XSS 방지

>lucy-xss-servlet-filter는 JSON에 대한 XSS는 처리해주지 않는다.  
따라서, JSON에 대한 XSS가 필요하다면  
- Jackson의 com.fasterxml.jackson.core.io.CharacterEscapes를 상속하는 클래스 A를 직접 만들어서 처리해야 할 특수문자를 지정하고,
- ObjectMapper에 A를 설정하고,
- ObjectMapper를 MessageConverter에 등록해서 Response가 클라이언트에 나가기 전에 XSS 방지 처리 해준다.

정리

lucy-xss-servlet-filter - form-data  
com.fasterxml.jackson.core.io.CharacterEscapes를 상속하는 클래스를 만들어 messageConverter - json  
[homoefficio.github.io - Spring에서 JSON에 XSS 방지 처리 하기](https://homoefficio.github.io/2016/11/21/Spring%EC%97%90%EC%84%9C-JSON%EC%97%90-XSS-%EB%B0%A9%EC%A7%80-%EC%B2%98%EB%A6%AC-%ED%95%98%EA%B8%B0/)  


WebMvcConfigurerAdapter가 스프링부트 버전 업으로 Deprecated
response를 클라이언트로 내보내는 단계에서 xss 체크
[https://jojoldu.tistory.com - Spring Boot에서 JSON API에 XSS Filter 적용하기](https://jojoldu.tistory.com/470?category=635883)
