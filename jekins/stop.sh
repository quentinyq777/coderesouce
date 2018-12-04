echo "stop sanysxt service begin"
pid=`ps -ef | grep sanysxt-eureka-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}'`
echo "old id--$pid"
if [ -n "$pid" ]
then
  kill -9 $pid
fi
echo "stop sanysxt service end"
