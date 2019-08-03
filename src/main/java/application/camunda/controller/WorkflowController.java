package application.camunda.controller;

import application.camunda.service.WorkflowService;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workflow")
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

    @PostMapping("/message")
    @ResponseStatus(HttpStatus.OK)
    public MessageCorrelationResult sendMessage(@RequestBody String message){
        return workflowService.sendMessage(message);
    }

}
