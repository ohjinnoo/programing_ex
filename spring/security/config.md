##### .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
- cors - [교차출처 리소스 공유](https://developer.mozilla.org/ko/docs/Web/HTTP/CORS)
- cors 이슈는 간단히 말하면 무분별한 http 통신을 제한하기 위해서 같은 출처 혹은 특정 url에 한해서만(설정필요) 통신을 허용하도록 하는 것

##### .sessionManagement().sessionCreationPolicy(?)
- SessionCreationPolicy.ALWAYS      - 스프링시큐리티가 항상 세션을 생성
- SessionCreationPolicy.IF_REQUIRED - 스프링시큐리티가 필요시 생성(기본) 
- SessionCreationPolicy.NEVER       - 스프링시큐리티가 생성하지않지만, 기존에 존재하면 사용
- SessionCreationPolicy.STATELESS   - 스프링시큐리티가 생성하지도않고 기존것을 사용하지도 않음 -> JWT 같은토큰방식을 쓸때 사용하는 설정  
>출처: https://fenderist.tistory.com/342[Devman]
                
         
              
    
