


2. select 팀명,직급,SUM(성과급) from 급여 group by 팀명, 직급

4. 	1.
	2. 스머핑
6.	1) 판매액 > 1,000,000
	2) 광역시
	3) 4

7. 크로스사이트 스크립트의 약자로 악의적인 자바스크립트 코드를 포함하여 웹통신을 하여 
실행되는요청과 상이한 요청이 실행됨

8.	1) 격리성
	2) 영속성

9. 18

10. select distinct 학점 from 성적

15. 15

17.	1) ipsec


18
	2) 전송계층
19.  inset into 성적 values('1004','파이썬','A')


xss - 검증되지 않은 외부 입력 데이터가 포함된 웹페이지가 전송되는 경우, 사용자가 해당 웹페이지를 열람함으로써
웹페이지에 포함된 부적절한 스크립트가 실행되는 공격



디자인 패턴 종류 중 객체들의 관계를 트리구조로, 구성하여 부분-전체 계층을 표현하는 패턴으로, 사용자가 단일 객체와
복합 객체 모두 동일하게 다루도록 하는 구조 패턴은 무엇인가

컴포지트

ipsec
인증헤더
기밀성을 보장하는

RPC ,Netbios 세션게층

 설계 단계에서는 소픝웨어 요규, 설계, 원시 코드 등의 저작자 외의 다른 전문가 또는 팀이
 검사하여 문제를 식별하고 문제에 대한 올바른 해결을 찾아내는 형식적인 검토 기법 인스펙션을 수행
 조건 커버리지
 상태 전이
 
 
 select 결제유형, count(*) as 입장객수 from 결제 group by 결제유형
 
 update 학과 set 학과번호 = 777 where 교수명 like '%황'
 
 스파게티 
 외계인
 
 select 부서, 성과금등급, sum(성과금합계) from 성과금 group by rollup(부서,성과금등급)
 
 어플리케이션 모니터링 툴 
 apm
 
`비즈니스 연속성을 보장하는 체계
 
`비즈니스 영향 분석
 BIA
 업무가 복구되어 가동될때까지의 시간
 
RTO
업무중단 시점부터 데이터가 북구되어 다시 정상가동될 때 데이터의 손실허용시점
RPO
재해복구센터 DRS



단위 테스트는 사용자 요구사항에 대한 단위 모듈, 서브루틴 등을 테스트하는 단계이다.
통합테스트는 단위테스트를 통과한 무듈 사이의 인터페이스, 통합된 컴포넌트 간의 상호작용을 검증하는 테스트 단계
시스템 테스트는 통합된 단위 시스템의 기능이 시스템에서 정상적으로 수행되는지를 검증하는 테스트 단계
인수 테스트는 계액상의 요구사항이 만족되었는지 확인하기 위한 테스트 단계

DRS 4가지 유형
Mirror Site - 즉시
Hot Site
Warm Site
Cold Site

테스트 오라클 종류
참 오라클 - 모든 테스트 케이스 입력값이 기대한 결과값으로 나오는지 확인
샘플링 오라클
휴리스틱 오라클
일관성 검사 오라클

휴리스틱 오라클
일관성 검사 오라클
참 오라클
샘플링 오라클

프로세스 5가지 상태
create 상태
ready 상태
running 상태 
waiting 상태
complete 상태

상태전이
dispatch - 프로세는 준비 상태에서 실행 상태로 전이
timer run out - 프로세스는 실행 상태에서 준비 상태로 전이
block - 프로세스는 실행 상태에서 대기 상태로 전이
wake-up - 프로세스는 대기 상태에서 준비 상태로 전이
K


1.온톨로지
실세계에 존재하는 모든 개념들과 개념들의 속성, 그리고 개념들 간의 관계 정보를 컴퓨터가 이해할 수 있도록 
서술해 놓은 개념화 명세서이다.
실세계에 존재하는 모든 개념들과 개념들의 속성, 그리고 개념들 간의 관계 정보를 컴퓨터가 이해할 수 있도록
서술해 놓은 개념화 명세서이다
실세계에 존재하는 모든 개념들과 개념들의 속성, 그리고 개념들 간의 관계 정보를 컴퓨터가 이해할 수 있도록
서술해 놓은 개념화 명세서이다
실세계에 존재하는 모든 개념들과 개념들의 속성, 개념들 간의 관계 정보를 컴퓨터가 이해할 수 있도록
서술해 놓은 개념화 명세서
2. 스텁은
제어 모듈이 호출하는 타 모듈의 기능을 단순히 수행하는 도구로 더미 객체에의 단순 기능에 특정 상태를 가정해서 특정한
값을 리턴하거나 특정 메시지를 출력
3. 24
4.	UI 시나리오 문서 작성
	완전성 - ui 시나리오는 누락이 없어야 하고, 최대한 빠짐없이 가능한 한 상세하게 기술
	일관성
	이해성
	가독성

1. 
	2. 직관성
5.	1. fitnesse
	2. watir
6.  1
	2
	5
	10
7. dd
	격리성이란
	트랜잭션 실행 중 생성하는 연산의 중간 결과를 다른 트랜잭션이 접근하지 못하도록 보장하는 특성
	격리성이란
	트랜잭션 실행 중 생성하는 연산의 중간 결과를 다른 트랜잭션이 접근하지 못하도록 보장하는 특성
	
8. select 과목,count(*) as 과목건수 from 성적 group by 과목
9. IPS란 네트워크에 대한 공격이나 침입을 실시간적으로 차단하고, 유해트래픽에 대한 조치를 능동적으로 처리하는 시스템
 
10. 
11. SDDC

12. select sum(점수) as 합계 from 학생,성적 where 학년 = 1 and 학생.학번 = 성적.학번
13. 공통결합도 - 파라미터가 아닌 모듈 밖에 선언되어 있는 전역 변수를 참조하고 전역 변수를 갱신하는 식으로 상호작용하는 경우의 겷합도
	자료결합도 - 모듈 간의 인터페이스로 전달되는 파라미터를 통해서만 모듈 간의 상호작용이 일어나는 경우의 결합도
	
14. Programming
	Easy
	Done
15. 비바모델은 무결성을 보장하는 최초의 모델로 No Read Down, No Write Up의 속성을 가지고 있다.
	벨-라파듈라 모델 - 미 국방부 지원 보안 모델로 보안 요소 중 기밀성을 강조하며 강제적 정책에 
	의;해ㅔ 접근 통하는 모델로 No Read up, No Write Down의 속성을 가지고 있다.
	

16.  브로커 패턴
 분리된 컴포넌트들로 이루어진 분산 시스템에서 사용된다.
 
17.NAS
18.  튜플 - 카디널리티
	애트리뷰트의 개수 - 차수
	하나의 애트리뷰트가 취할 수 있는 같은 타입의 원자값 - 도메인
19. 릴레이션에 있는 모든 튜플에 대해 유일성은 만족시키지만 최소성은 만족시키지 못하는 키
20. ARP
