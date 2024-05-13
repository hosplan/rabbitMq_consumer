<img src="https://capsule-render.vercel.app/api?type=waving&color=1120ff&height=150&section=header&text=RabbitMq-Consumerr&fontColor=ffffff" />

### 🎉 소개 - Introduction
---
Spring-Cloud-Stream 과 RabbitMq 를 활용한 메세지 큐 구축 코드 입니다.

Consumer 역할을 하는 코드 입니다.

코드를 실행하기 앞서 2가지를 작업을 해주셔야 정상적으로 어플리케이션이 동작하는 것을 보실 수 있습니다.

1. rabbitMq_consumer 코드를 받아주세요.
2. 도커 컨테이너를 해당 이미지를 받으시고 실행시켜야 됩니다. 도커가 없으시면 도커를 설치해주세요.
    - docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 --restart=unless-stopped rabbitmq:management

3. Postman을 실행하여 API 요청 작업을 진행합니다.

   - http://localhost:8080/send/message

   - method : POST

   - Body : { "title" : "message send", "content" : "message queue test"

### 🌈 구성 요소
---
1. Consumer : Producer 로 부터 메세지를 받아 처리하는 주체 입니다.
2. Queue : Consumer 가 메세지를 소비하기 전까지 메세지를 보관하는 장소 입니다.



<img src="https://capsule-render.vercel.app/api?type=waving&color=1120ff&height=150&section=footer" />
