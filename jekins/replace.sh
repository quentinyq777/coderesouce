o "replace sanysx begin"
file="sanysxt-eureka-0.0.1-SNAPSHOT.jar"
if [ -f "$file" ]
then
   mv ./sanysxt-eureka-0.0.1-SNAPSHOT.jar ./bak/sanysxt-eureka-0.0.1-SNAPSHOT.jar.`date +%Y%m%d%H%M%S`
fi
cp /home/service/sanysx/workspace/sanysxt-eureka-build-test/sanysxt-eureka-0.0.1-SNAPSHOT.jar ./
echo "replace sanysx end"
