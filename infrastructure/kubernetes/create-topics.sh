#local-confluent-kafka-cp-zookeeper-headless
kafka-topics --zookeeper $1:2181 --topic warehouse-reporting-request --delete --if-exists
kafka-topics --zookeeper $1:2181 --topic warehouse-reporting-response --delete --if-exists
kafka-topics --zookeeper $1:2181 --topic restaurant-approval-request --delete --if-exists
kafka-topics --zookeeper $1:2181 --topic restaurant-approval-response --delete --if-exists
kafka-topics --zookeeper $1:2181 --topic customer --delete --if-existskube

kafka-topics --zookeeper $1:2181 --topic warehouse-reporting-request --create --partitions 3 --replication-factor 3 --if-not-exists
kafka-topics --zookeeper $1:2181 --topic warehouse-reporting-response --create --partitions 3 --replication-factor 3 --if-not-exists
kafka-topics --zookeeper $1:2181 --topic restaurant-approval-request --create --partitions 3 --replication-factor 3 --if-not-exists
kafka-topics --zookeeper $1:2181 --topic restaurant-approval-response --create --partitions 3 --replication-factor 3 --if-not-exists
kafka-topics --zookeeper $1:2181 --topic customer --create --partitions 3 --replication-factor 3 --if-not-exists
