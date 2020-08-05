##도커
1. [도커란 무엇인가?](https://subicura.com/2017/01/19/docker-guide-for-beginners-1.html)

## docker stack
컴포즈 파일은 YAML을 사용해서 작성한다. 최상위 services는 서비스 목록을 정의한다. services의 바로 아래는 정의할 서비스 이름이 온다. 위 설정의 경우 이름이 web인 서비스를 정의한다. 실제 생성되는 서비스의 이름은 web이 아니라 스택 이름과 조합한 이름을 사용한다. 스택은 뒤에서 설명한다.

서비스 이름 아래 표시한 속성은 도커 서비스를 생성할 때 사용한 옵션과 이름이 유사하다. 서비스를 생성할 때 사용한 옵션과 유사한 이름을 사용한다. 각 속성의 값은 서비스를 설명할 때 사용한 옵션과 동일한 값을 갖는다.

```yaml
version: '3.6'

volumes:
  sandbox:
    driver: local
    driver_opts:
      device: /APP/patrol/sandbox
      o: bind
      type: none
  logs:
    driver: local
    driver_opts:
      device: /APP/patol/logs
      o: bind
      type: none
services:
  backend:
    image: 127.0.0.1:5000/backend
    deploy:
      replicas: 4
      update_config:
        parallelism: 4
        delay: 10s
        order: stop-first
      restart_policy:
        condition: on-failure
        delay: 5s
    ports:
      - "9000:8090"
    networks:
      - ctms_net
    depends_on:
      - redis

    volumes:
      - logs:/root/.pm2/logs
      - sandbox:/root/sandbox
    restart: always
    env_file:
      - national-internet.env
    environment:
```
