# microservices


What are Microservices : 

Single application communicating with each other 
Small well chosen deployable units and cloud enabled 

Challenges of microservices
1.Bounded context : identifying the right context Establish the boundaries between microservices 
2.config management: multiple instances and multiple environments 
3.dynamic scaleup and scale down : loads of different microservices are different at different time
4.visibility : how to identify where the bug is which microservice caused error
5.pack of cards: once service calling other if the base goes down the other can collapse(fault torrence)


Spring Cloud

Provides tools to quickly build some of the patterns in distributed systems 
Has wide variety of projects under spring cloud

config management
multiple instances and multiple environments spring cloud config server provides solution to store all configurations in a centralized git repository 


dynamic scaleup and scale down
Load balancing resolved by naming server which is Eureka server
 naming server :features 1. Service registration 2. Service discovery can ask naming server give me the current instances provides the urls Ribbon load is 
Visibility & Monitoring 
Zipkin distributed tracing : to trace the request among multiple services
Netflix API Gateway : avoid in using same common  features  in each microservice
fault torrence
Hystrix configure a default response if a service is down



Advantages of Microservices 
1.can use different languages 
2.dynamic scaling same amount of load will be increased in holidays they can scale dynamically
3. Faster release cycles : can bring new features faster

Spring cloud config server provides the instance and acts as centralized maintaining all the instance details


Feign is used to remove lot of duplicate code which can be configured as proxy as an interface  


Naming server: Eureka naming server

Rather than adding the configuration ports whenever a new server is created to distribute the load among servers we will be using naming server 
All the instances of the microservice will be registered in the naming server whenever an instance comes up it will register with naming server it is called Service registration  
Whenever a service wants to talk to other service it would talk to naming server and get the instances of the other services are running this is called Service discovery  


Spring Cloud Netflix Ribbon is no longer supported and it's recommended to migrate to Spring Cloud LoadBalancer instead

Naming server: Eureka naming server
Service registration  & Service discovery  
Ribbon : provides client side load balancing to distribute the load between multiple services
Feign : the code will be very simple




