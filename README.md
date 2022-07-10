# 2022-07-10
## 1. 카프카 다운로드 
- https://www.apache.org/dyn/closer.cgi?path=/kafka/3.2.0/kafka_2.13-3.2.0.tgz

## 2. 카프카 zookeeper 
- 실행
##### .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

## 3. Broker
- 실행 
##### .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

- 토픽생성 
##### .\bin\windows\kafka-topics.bat --create --topic test-topic --bootstrap-server localhost:9092 --partitions 1

