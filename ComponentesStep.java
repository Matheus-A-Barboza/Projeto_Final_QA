package stepdefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componentes.inicializa();
    }

    @Quando("o usuário informar nome, sobrenome, sexo, comida, escolaridade e esporte")
    public void o_usuário_informar_nome_sobrenome_sexo_comida_escolaridade_e_esporte() {
        componentes.informarCadastro();
    }

    @Entao("o cadastro deve ser ralizado")
    public void o_cadastro_deve_ser_ralizado() {
        componentes.botaoCadastrar();
    }

    @Quando("o usuario preencher os campos")
    public void o_usuario_preencher_os_campos() {
        componentes.validRegra1();
//        componentes.validRegra2();
//        componentes.validRegra3();
    }

    @Entao("valida os campos")
    public void valida_os_campos() {
        componentes.alertaRegra1();
//        componentes.alertaRegra2();
//        componentes.alertaRegra3();
    }

    @Quando("o usuario clicar no botao confirm")
    public void o_usuario_clicar_no_botao_confirm() {
        componentes.alertaConfirma();
    }

    @Entao("validar o botao confirm")
    public void validar_o_botao_confirm() {
        componentes.alertaConfirma();
    }

}
