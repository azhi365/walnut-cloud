# walnut-data-kafka-consumer

## Kafka 操作
- 创建Topic：`kafka-topics --zookeeper walnut195:2181,walnut211:2181,walnut215:2181/walnut-kafka --create --topic hello --replication-factor 2 --partitions 3`
- 查看所有可以使用的Topic，`kafka-topics --zookeeper walnut195:2181,walnut211:2181,walnut215:2181/walnut-kafka --list`
- 查：查看Topic为hello的信息，`kafka-topics --zookeeper walnut195:2181,walnut211:2181,walnut215:2181/walnut-kafka --topic hello --describe`

```
Topic:hello	PartitionCount:3	ReplicationFactor:3	Configs:
Topic: hello	Partition: 0	Leader: 81	Replicas: 81,82,80	Isr: 81,82,80
Topic: hello	Partition: 1	Leader: 82	Replicas: 82,80,81	Isr: 82,80,81
Topic: hello	Partition: 2	Leader: 80	Replicas: 80,81,82	Isr: 80,81,82
 说明：Leader：partition的leader，主要用的是brokerid
 说明：Replicas：partition的总副本brokerid的集合
 说明：Isr：partition可用的副本brokerid的集合
```
- Producer（生产者）创建：`kafka-console-producer --topic hello --broker-list walnut195:9092,walnut211:9092,walnut215:9092/walnut-kafka`
- 生产者：topic、broker--list
- Consumer（消费者）创建：`kafka-console-consumer --topic hello --zookeeper walnut195:2181,walnut211:2181,walnut215:2181/walnut-kafka --from-beginning`

- `kafka-console-consumer --topic biz-log --zookeeper walnut195:2181,walnut211:2181,walnut215:2181/walnut-kafka --from-beginning`

- `kafka-topics --zookeeper 10.12.28.195:2181,10.12.28.211:2181,10.12.28.215:2181/walnut-kafka --create --topic visitor_info --replication-factor 3 --partitions 3`
- `kafka-topics --zookeeper 10.12.28.195:2181,10.12.28.211:2181,10.12.28.215:2181/walnut-kafka --create --topic session --replication-factor 3 --partitions 3`
- `kafka-topics --zookeeper 10.12.28.195:2181,10.12.28.211:2181,10.12.28.215:2181/walnut-kafka --create --topic im_msg --replication-factor 3 --partitions 3`
- `kafka-topics --zookeeper 10.12.28.195:2181,10.12.28.211:2181,10.12.28.215:2181/walnut-kafka --create --topic biz-log --replication-factor 3 --partitions 3`

- `kafka-topics --zookeeper 10.132.103.71:2181,10.132.103.72:2181,10.132.103.73:2181/walnut-kafka --create --topic session --replication-factor 3 --partitions 3`
- `kafka-topics --zookeeper 10.132.103.71:2181,10.132.103.72:2181,10.132.103.73:2181/walnut-kafka --create --topic im_msg --replication-factor 3 --partitions 3`
- `kafka-topics --zookeeper 10.132.103.71:2181,10.132.103.72:2181,10.132.103.73:2181/walnut-kafka --create --topic visitor_info --replication-factor 3 --partitions 3`
- `kafka-topics --zookeeper 10.132.103.71:2181,10.132.103.72:2181,10.132.103.73:2181/walnut-kafka --create --topic biz-log --replication-factor 3 --partitions 3`