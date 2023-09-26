public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public String tocar() {
        return "Reproduzindo música.";
    }

    @Override
    public String pausar() {
        return "Pausando música.";
    }

    @Override
    public String selecionarMusica(String musica) {
        return "Selecionando a música: " + musica;
    }

    @Override
    public String ligar() {
        return "Ligando o celular.";
    }

    @Override
    public String atender() {
        return "Atendendo uma chamada.";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Iniciando o correio de voz.";
    }

    @Override
    public String exibirPagina(String url) {
        return "Acessando a página: " + url;
    }

    @Override
    public String adicionarNovaAba() {
        return "Adicionando uma nova aba.";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando a página atual.";
    }
}
