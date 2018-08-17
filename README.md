# Spring Cloud Sample

#### 演示技术内容
- Spring Cloud
  - 注册与发现 Eureka
  - 客户端负载均衡 Ribbon
  - 客户端调用 Feign
  - 路由网关 Zuul
- Kubernetes
  - k8s 安装与配置
  - k8s Dashboard 与 Heapster
  - 应用发布与更新（Jenkins + Docker Registry + K8S）

#### 模块介绍
- eureka-server: 服务注册与发现 http://localhost:4000
- zuul-server: 路由网关 http://localhost:4001
- member-service: 会员服务 http://localhost:9080/api/member/getAllMember
- order-service: 订单服务 http://localhost:9081/api/order/showAllMember
  - 订单服务通过 Feign 调用 会员服务，获取所有会员信息 http://localhost:4001/orderservice/api/order/showAllMember
  
#### 参考
- 官网：http://projects.spring.io/spring-cloud
- 源码：https://github.com/spring-cloud
- 官方示例：https://github.com/spring-cloud-samples

