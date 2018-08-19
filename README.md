# Spring Cloud Finchley SR1 Sample

#### 演示技术内容
- **Spring Cloud**
  - 注册与发现 Eureka
  - 分布式配置中心
  - 客户端负载均衡和调用 Feign, 基于 Ribbon 实现(默认依赖 Hystrix)
  - 断路器, 服务容错保护 Hystrix
  - 路由网关 Zuul
  - 分布式链路追踪 Sleuth, 使用 Zipkin
    - 自行研究知识点: 数据存储(DB, ElasticSearch), 链路收集(MQ)
  
- **Kubernetes**
  - k8s 安装与配置
  - k8s Dashboard 与 Heapster
  - 应用发布与更新（Jenkins + Docker Registry + K8S）

#### 模块介绍, 请按顺序启动
- eureka-server: 服务注册与发现 http://localhost:4000
- config-server: 分布式配置中心 http://localhost:4001
- zuul-server: 路由网关 http://localhost:4002
- turbine-server: 断路器\监控面板\聚合监控数据
  - 监控面板: http://localhost:4003/hystrix
  - 聚合监控数据: http://localhost:4003/turbine.stream
  - 独立服务监控数据: 服务 URL/actuator/hystrix.stream
- member-service: 会员服务 http://localhost:9080/api/member/getAllMember
- order-service: 订单服务 http://localhost:9081/api/order/showAllMember
  - 订单服务通过 Feign 调用 会员服务，获取所有会员信息 http://localhost:4001/orderservice/api/order/showAllMember
  
#### 参考
- 官网：http://projects.spring.io/spring-cloud
- 源码：https://github.com/spring-cloud
- 官方示例：https://github.com/spring-cloud-samples

