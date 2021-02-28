package application.camunda.task.dosomething;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

import application.camunda.config.TaskDelegate;

@Component
public class DoSomethingTask extends TaskDelegate {

    public void execute(DelegateExecution delegateExecution) throws Exception {

        delegateExecution.setVariable("cpf","01234567890");

    }
}
