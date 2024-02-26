

#

[TOC]

##

## 监控

### otel

## 日志收集

### elasticsearch

#### 经典的ELK架构或现被称为Elastic Stack。Elastic Stack架构为 Elasticsearch + Logstash + Kibana + Beats 的组合：

Beats负责日志的采集
Logstash负责做日志的聚合和处理
ES作为日志的存储和搜索系统
Kibana作为可视化前端展示


- Application -> Filebeat -> Logstash -> Elasticsearch
- Application -> Filebeat -> Elasticsearch
- Application (Java) + Logstash-logback-encoder -> Logstash -> Elasticsearch

#### EFK架构（ Elasticsearch + Fluent + Kibana）


#### PLG架构（ Promtail + Loki + Grafana）

### loki


```shell
elasticsearch-create-enrollment-token --scope kibana
```

```shell
elasticsearch-reset-password --username elastic -i
```

## 链路追踪


### Tempo

### Jaeger

### Zipkin

### SkyWalking

### OpenTelemetry




