call cd ActiveMQGeneric  
call mvn clean install  
call cd ..  
call cd ActiveMQConsumer  
call mvn clean install  
call cd ..  
call cd ActiveMQProducer  
call mvn clean install  
call cd ..  
call cd ActiveMQConsumerApplication  
call mvn clean install  
call cd ..  
call cd ActiveMQProducerApplication  
call mvn clean install  
call cd ..  
call cd scripts
call start cmd /c producer.bat  
call timeout 10
call start cmd /c execute.bat
call timeout 300
call start cmd /c consumer.bat  
