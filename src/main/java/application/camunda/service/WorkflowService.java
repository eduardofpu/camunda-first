package application.camunda.service;

import application.camunda.model.MessageName;
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

    public MessageCorrelationResult sendMessage(MessageName name) {
        String messageName = name.getMessageName();

        return runtimeService.createMessageCorrelation("message_" + messageName)
                .correlateWithResult();
    }

    public String corPredilectStart(){
        return runtimeService.startProcessInstanceByKey("cor_predilect").getId();
    }

}
