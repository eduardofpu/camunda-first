# camunda-first
```
camunda-first

## CAMUNDA
```
Link Java: https://github.com/mattferreiras/camunda-course-java
Link Kotlin: https://github.com/mattferreiras/camunda-course-kotlin
```
## RODAR O DOCKER
```
sudo docker-compose -f docker-compose.yml up
```
## logar no camunda
```
localhost:8080/app/cockpit/default/#/login

## localhost
```
localhost:8080/rest
```

## doc
```
docs.comunda.org/

## pode ser visto na doc do comunda
```
localhost:8080/rest/process-definition/key/do_something/start
```

{

   "variables":{
    "name":{
    
    "value":"João",
    "type":"String"

     },
   "id":{
      "type":"Integer",
      "value":1
     }
  }
}
```
/pode ser visto na doc do comunda
```
localhost:8080/rest/process-definition/key/wait_mesage/start
```
{

   "variables":{
    "name":{
    
    "value":"João",
    "type":"String"

     },
   "id":{
      "type":"Integer",
      "value":1
     }
  }
}
```
localhost:8080/rest/message/start
```
{

   "messageName":"message_Joao"
}
```








