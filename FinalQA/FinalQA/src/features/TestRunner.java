package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/Componentes.feature", glue = "",
        tags = "@informar_cadastro")
//        tags = "@validar_cadastro")
//        tags = "@validar_botao_confirm")

public class TestRunner {
}
