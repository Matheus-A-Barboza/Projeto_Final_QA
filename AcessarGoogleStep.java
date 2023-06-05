package stepdefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import util.Componentes;

public class AcessarGoogleStep {

    Componentes componentes = new Componentes();
    @Dado("que o usuário instanciou o chrome-driver")
    public void que_o_usuario_instanciou_o_chrome_driver() {
        componentes.inicializa();
    }

    @Dado("que o usuario digitou o endereco do google no navegador")
    public void que_o_usuario_digitou_o_endereco_do_google_no_navegador() {
        componentes.acessarGoogle();
    }


    @Dado("que o usuário digitou Rockstar Games")
    public void que_o_usuário_digitou_Rockstar_Games() {
        componentes.pesquisarEmpresa();
    }

    @Quando("clicar em Enter")
    public void clicar_em_Enter() {
        componentes.clicarEnter();
    }

    @Então("deve apresentar a lista de pesquisa com Rockstar Games")
    public void deve_apresentar_a_lista_de_pesquisa_Rockstar_Games() {
        componentes.resultadoPesquisa();
    }

    @Então("acessar o site")
    public void acessar_o_site() {
        componentes.acessarSite();
    }

    @Então("apos fechar navegador")
    public void apos_fechar_navegador(){
        componentes.fecharNavegador();
    }

}
