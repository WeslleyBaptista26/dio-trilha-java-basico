public class IPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    // Atributos privados para armazenar o estado atual
    private String musicaAtual;
    private String numeroAtual;
    private String urlAtual;

    // Implementação dos métodos da interface IReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos da interface IAparelhoTelefonico
    @Override
    public void ligar(String numero) {
        this.numeroAtual = numero;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada de: " + numeroAtual);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação dos métodos da interface INavegadorInternet
    @Override
    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada: " + urlAtual);
    }

    // Método main para testar a implementação
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();
        meuIPhone.selecionarMusica("Musica Exemplo");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
