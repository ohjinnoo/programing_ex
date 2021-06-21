### @Component
##### @Component 은 개발자가 직접 작성한 Class를 Bean으로 등록하기 위한 Annotation이다.
```
@Component
public class Student {
    public Student() {
        System.out.println("hi");
    }
}

@Component(value="mystudent")
public class Student {
    public Student() {
        System.out.println("hi");
    }
}
```

Component에 대한 추가 정보가 없다면 Class의 이름을 camelCase로 변경한 것이 Bean id로 사용된다.  
하지만 @Bean과 다르게 @Component는 name이 아닌 value를 이용해 Bean의 이름을 지정한다.

### @Bean
#####@ Bean은 개발자가 직접 제어가 불가능한 외부 라이브러리등을 Bean으로 만들려할 때 사용되는 Annotation이다.
```
@Configuration
public class ApplicationConfig {    
    @Bean
    public ArrayList<String> array(){
        return new ArrayList<String>();
    }   
}
```
위와 같이 @Bean에 name이라는 값을 이용하면 자신이 원하는 id로 Bean을 등록할 수 있다.

### @Autowired
##### 속성(field), setter method, constructor(생성자)에서 사용하며 Type에 따라 알아서 Bean을 주입 해준다.

Bean을 주입받는 방식 (3가지)
 1. @Autowired
 2. setter
 3. 생성자 (@RequiredArgsConstructor 사용, private final ) -> 권장방식
 
 ### @Inject
##### @Autowired 어노테이션과 비슷한 역할을 한다.


### @Controller
##### Spring의 Controller를 의미한다. Spring MVC에서 Controller클래스에 쓰인다.
   

### @RestController
###### Spring에서 Controller 중 View로 응답하지 않는, Controller를 의미한다.
   
method의 반환 결과를 JSON 형태로 반환한다.  
이 Annotation이 적혀있는 Controller의 method는 HttpResponse로 바로 응답이 가능하다.  
@ResponseBody 역할을 자동적으로 해주는 Annotation이다.  
@Controller + @ResponseBody를 사용하면 @ResponseBody를 모든 메소드에서 적용한다.  

@Controller 와 @RestController 의 차이  
1. @Controller 
    - API와 view를 동시에 사용하는 경우에 사용한다.  
    - 대신 API 서비스로 사용하는 경우는 @ResponseBody를 사용하여 객체를 반환한다.  
    - view(화면) return이 주목적이다.
   
2. @RestController
    - view가 필요없는 API만 지원하는 서비스에서 사용한다.
    - Spring 4.0.1부터 제공
    - @RequestMapping 메서드가 기본적으로 @ResponseBody 의미를 가정한다.
    - data(json, xml 등) return이 주목적이다. 

즉, @RestController = @Controller + @ResponseBody 이다.


###@Service
#####Service Class에서 쓰인다.
비즈니스 로직을 수행하는 Class라는 것을 나타내는 용도이다.


### @Repository
##### DAO class에서 쓰인다.
DataBase에 접근하는 method를 가지고 있는 Class에서 쓰인다.


### @SpringBootApplication
##### @Configuration, @EnableAutoConfiguration, @ComponentScan 3가지를 하나의 애노테이션으로 합친 것이다.


### @Value
##### properties에서 값을 가져와 적용할 때 사용한다.
     
     @Value("${value.from.file}")
     
 
