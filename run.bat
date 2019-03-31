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
call timeout 20
call start cmd /c producer.bat  
call start cmd /c consumer.bat  
call timeout 20
call start cmd /c execute.bat