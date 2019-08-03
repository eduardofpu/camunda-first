package application.camunda.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class DoSomethingTask implements JavaDelegate {

    public void execute(DelegateExecution delegateExecution) throws Exception {

        delegateExecution.setVariable("cpf","01234567890");

    }
}
