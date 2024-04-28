````shell
docker ps # 도커 확인
docker-compose -f kafka-compose.yml up # 도커 띄우기

docker exec -it kafka /bin/bash # 도커컨테이너 들어가기

````

````shell
# topic 생성
kafka-topics.sh --create --topic topic1 --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3

#토픽 리스트 확인: 
kafka-topics.sh --list --bootstrap-server localhost:9092
#토픽 상세 조회: 
kafka-topics.sh --describe --topic topic1 --bootstrap-server kafka:9092
#토픽 삭제: 
kafka-topics.sh --delete --bootstrap-server kafka:9092 --topic topic1

kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic1 --from-beginning
# 특정 파티션 안의 값 가져오기, 0번 부터 시작한다.
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic1 --partition 1 --from-beginning
````

````shell
# 컨슈머 실행
cd /opt/kafka_2.13-2.8.1/bin/
./kafka-console-consumer.sh --topic topic1 --bootstrap-server kafka:9092

# 프로듀서 실행
./kafka-console-producer.sh --topic topic1 --broker-list kafka:9092

# 프로듀서 실행 시킨후, 메시지전송 하면 컨슈머에 찍힘
````

