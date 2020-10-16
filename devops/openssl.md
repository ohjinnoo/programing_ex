# 설치전 필수 설치

### yum install perl gcc


- 이 글 작성기준 최신버전 1.1.1h 

 

 ### cd /usr/local/src

 ### wget https://www.openssl.org/source/openssl-1.1.1h.tar.gz

 ### tar -xvzf openssl-1.1.1b.tar.gz

 ### cd openssl-1.1.1b

 ### ./config --prefix=/usr/local/ssl --openssldir=/usr/local/ssl shared

 ### make

 ### make install

 ### ldconfig -v

 

## 접근성

 ### ln -s /usr/local/ssl/lib/libssl.so.1.1 /usr/lib64/libssl.so.1.1

 ### ln -s /usr/local/ssl/lib/libcrypto.so.1.1 /usr/lib64/libcrypto.so.1.1

 

 

- 기존버전을 엄밀히 주사용으로 두고 싶다면 아래는 스킵

 ### mv /usr/bin/openssl /usr/bin/openssl1.0.2

 ### ln -s /usr/local/ssl/bin/openssl /usr/bin/openssl

 

- 업데이트된 openssl버전을 확인합니다.

 ### openssl version

  OpenSSL 1.1.1h  22 Sep 2020



 ### /usr/local/ssl/bin/openssl version

  OpenSSL 1.1.1h  22 Sep 2020

