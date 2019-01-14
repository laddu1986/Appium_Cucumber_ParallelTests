# README FIRST

## Notes:
This paralel testing mobile automation using TestNG.

## Tools:
1. Intellij IDEA
2. Appium
3. TestNG
4. JDK
5. Android SDK
6. Node.js

## URL refs:
1. [Maven Repo] (https://mvnrepository.com/artifact/info.cukes).
2. [Intellij IDEA] (https://www.jetbrains.com/idea/download/#section=windows).
3. [JDK] (http://www.oracle.com/technetwork/java/javase/downloads/index.html).
4. [Node.js] (https://nodejs.org/en/).
5. [Android SDK] (https://developer.android.com/sdk/download.html).
6. [Maven Repository] (https://mvnrepository.com/).

## Installing Appium:
1. Install Node.js first. (If using Linux, do not install Node from package but from Node website)
2. Open command prompt.
3. Type a command: ```npm install -g appium``` then press enter

## Environment Variable:
#### Windows
1. Make a new variable with name: ```JAVA_HOME``` and value  ```C:\Program Files\Java\java-8```
2. Make a new variable with name: ```ANDROID_HOME``` and value  ```C:\Android\Android-sdk```
3. Edit PATH variable and add new value at the back
```;C:\Android\Android-sdk\tools;C:\Android\Android-sdk\platform-tools;C:\Program Files\Java\java-8\bin```

#### Linux
1. Open your bashrc file using command ```gedit ~/.bashrc```
2. Type this value on first line:
```export JAVA_HOME=/usr/lib/jvm/java-8```
```export ANDROID_HOME=/home/itworker/Android/Sdk```
```export PATH=$PATH:$ANDROID_HOME/tools```
```export PATH=$PATH:$ANDROID_HOME/platform-tools```
```export PATH=$PATH:/usr/lib/jvm/java-8/bin```
3. Save and reboot your Linux

_Directory mentioned above is depend of your JDK and Android SDK directory. If not give affect, try type that conf to .profile or .bash profile file_

## Project Structure Setup:
1. Open Intellij IDEA, Click File > Project Structure > Project
2. Choose Project SDK and Project language level according to your JDK
3. Click Modules > + > Import Module, point to automation folder
4. Click Libraries > + > Java, point to automation folder

## Setup:
1. Open with Intellij IDEA
2. Open device.xml
3. Arrange according to your device 

### You can get the UD/ID device with command on command prompt:
```
adb devices
```

## Run the automation:
1. Open with Intellij IDEA
2. Right click device.xml > Run