### 리눅스(RedHat계열)에 Apache 2.4 설치
 

**1.패키지 설치**

    yum install -y gcc gcc-c++ pcre-devel

 
**2.apr, apr-util, apache 다운로드**

    wget http://www.atblog.co.kr/file/package/apr-1.5.1.tar.gz

    wget http://www.atblog.co.kr/file/package/apr-util-1.5.4.tar.gz

    wget mirror.navercorp.com/apache//httpd/httpd-2.4.46.tar.gz

    (apache download의 경우, 버전이 바꾸면 주소가 안맞을 수 있으니, 직접 홈페이지에서 받으셔야 합니다.)

 

**3.apr 설치**

    tar zxvf apr-1.5.1.tar.gz

    cd apr-1.5.1
    
    cp -arp libtool libtoolT

    ./configure

    make

    make install
    


**4.apr-util 설치**
    tar zxvf apr-util-1.5.4.tar.gz

    cd apr-util-1.5.4

    ./configure --with-apr=/usr/local/apr

    make

    make install



**5.apache 설치**

    tar zxvf httpd-2.4.46.tar.gz

    cd httpd-2.4.46

     ./configure 
     --prefix=/APP/apache/httpd 
     --enable-rule=SHARED_CORE 
     --enable-modules=all 
     --enable-rewire 
     --enable-mods-shared=most 
     --enable-so 
     --enable-ssl 
     --with-ssl=/usr/local/ssl 
     --enable-cgi 
     --with-pcre 
     --enable-mpms-shared=all

    make

    make install

    cd /APP/apache/httpd/bin


**6.apache 시작**

  sh apachectl start
 
  서비스 시작 후, 웹페이지 뜨는지 확인

