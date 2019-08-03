package application.camunda.service;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkflowService {

    private RuntimeService runtimeService;


    @Autowired
    public WorkflowService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    public String workflowStart(){
        return runtimeService.startProcessInstanceByKey("do_something").getProcessDefinitionId();
    }

    public MessageCorrelationResult sendMessage(String message) {
        return runtimeService.createMessageCorrelation("message" + message)
                .correlateWithResult();
    }

}
