package application.camunda.task.corpredilect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

import application.camunda.config.TaskDelegate;
import application.camunda.enums.CorInput;


@Component
public class ConsultCor extends TaskDelegate {

    protected final Logger LOGGER = LogManager.getLogger(this.getClass());

    public void execute(DelegateExecution delegateExecution) throws Exception {

        String COR_PREDILECT = "vermelha";

        if(COR_PREDILECT.equals("verde")){
            LOGGER.info("Cor verde selecionada ...");
           //  TODO: SETA A CONDIÇOES ${COR_GREEN == "GREEN"}
            delegateExecution.setVariable("COR_GREEN", CorInput.GREEN);
        }else {
            LOGGER.info("Cor vermelha selecionada ...");
            //  TODO: SETA A CONDIÇOES ${COR_GREEN != "GREEN"}
            delegateExecution.setVariable("COR_GREEN",CorInput.RED);
        }

    }
}
