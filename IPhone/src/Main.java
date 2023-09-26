public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();

        System.out.println(celular.ligar());
        System.out.println(celular.atender());
        System.out.println(celular.iniciarCorreioVoz());

        System.out.println(celular.tocar());
        System.out.println(celular.selecionarMusica("https://www.youtube.com/watch?v=deVm70yarNw"));
        System.out.println(celular.pausar());

        System.out.println(celular.exibirPagina("www.google.com"));
        System.out.println(celular.adicionarNovaAba());
        System.out.println(celular.atualizarPagina());
    }
}
