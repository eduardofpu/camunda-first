package application.camunda.controller;

import application.camunda.model.MessageName;
import application.camunda.service.WorkflowService;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/workflow")
public class WorkflowController {

    protected WorkflowService workflowService;

    public WorkflowController(WorkflowService workflowService) {
        this.workflowService = workflowService;
    }

    @PostMapping("/start")
    @ResponseStatus(HttpStatus.OK)
    public String startWorkflow(){
        return workflowService.workflowStart();
    }

    @PostMapping(value = "/message", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public MessageName sendMessage(@RequestBody MessageName name){

        MessageCorrelationResult messageCorrelationResult = workflowService.sendMessage(name);

        if(messageCorrelationResult.getExecution()!=null){
            return name;

        }
        return null;
    }

//    @PostMapping(value = "/message", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public ResponseEntity<?> sendMessage(@RequestBody MessageName name){
//
//        MessageCorrelationResult messageCorrelationResult = workflowService.sendMessage(name);
//
//        if(messageCorrelationResult.getExecution()!=null){
//            return new ResponseEntity<MessageName>(name, HttpStatus.OK) ;
//
//        }
//
//        return null;
//    }

}
