# PracticeAutomationAppiumAndroid
Practicing Appium with Android for Automation
APPIUM을 이용하 Android 자동화 기초 연습 입니다.
현재 Mac 기준으로 작성되었습니다.

# 연습에 들어가기 전 아래의 선행작업이 완료되어야 합니다.

**1. Brew 설치**
터미널 실해 후 아래의 명렁어 입력
> /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"


[참고 페이지](https://brew.sh/index_ko)



**2. Brew를 통해 node 설치**
터미너 실행 후 아래의 명령어 입력
> brew install node


**3. Android Studio 설치**
[다운로드](https://developer.android.com/studio)
설치 후 SDK Manger 실행 하여 
SDK platform(API Level 23 이상 임의 1개 선택),  
SDK Tool(Android SDK Build, Android SDK Command-line Toold, Android Emulator, Android SDK platform-Tools) 설치. 
#Android SDK Location 내 경로 기억하기(환경변수 설정 시 필요). 


**4. brew를 통해 appium 설치**
터미널 실해 후 아래의 명령어 입력
> brew install appium



**5. brew를 통해 OpenJDK 설치**
터미널 실행 후 아래의 명령어 입력
> brew tap AdoptOpenJDK/openjdk


이 후

> brew cask install adoptopenjdk8


현재 프로젝트는 JDK8 기준으로 함

[참고페이지](https://findstar.pe.kr/2019/01/20/install-openjdk-by-homebrew/)



**6. MAVEN 다운로드**

[다운로드](https://maven.apache.org/download.cgi)

위 URL 접속 후 Files 아래의 Binary zip archive이 LINK를 클릭하여 다운로드 및 압축 해제


**7. 환경변수 설정하기**

[참고페이지](https://whitepaek.tistory.com/28)

우 페이지 참고하여 Android, Maven, openJDK 도 동일하게 설정

ex)
```
export MAVEN=/Users/kimkitae/Documents/maven
export ANDROID_HOME=/Users/kimkitae/Library/Android/sdk
export PATH=${PATH}:$ANDROID_HOME/platform-tools:$ANDROID_HOME/tools/bin
export PATH=${PATH}:$MAVEN/bin
export JAVA_HOME=/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
export PATH=${PATH}:$JAVA_HOME/bin
```
