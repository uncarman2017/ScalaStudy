## 第一个Spark程序

### 启动Spark Master
./sbin/start-master.sh

### 启动Spark Worker
./bin/spark-class org.apache.spark.deploy.worker.Worker spark://shjhgt1prd100111.ciicsh.local:7077


### 提交作业
./bin/spark-submit --master spark://shjhgt1prd100111.ciicsh.local:7077  --class WordCount [Jar包路径]