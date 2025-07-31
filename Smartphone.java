public class Smartphone implements AparelhoTelefonico,ReprodutorMusical,NavegadorInternet{
    public String atender(){
        return "Atender ligação";
    }
    public String ligar(String numero){
        return "Ligando para "+ numero;
    }
    public String correioVoz(){
        return "Ouvindo correio de voz";
    }

    public String selecionarMusica(String musica){
        return "Selecionando música: "+ musica;
    }
    public String tocar(){
        return "Tocando música";
    }
    public String pausar(){
        return "Musica em pause";
    }
    public String novaAba(){
        return "Abrindo nova página";
    }
    public String exibirPagina(String url){
        return "Exibindo pagina "+ url;
    }
    public String atualizarPagina(){
        return "Pagina atualizada";
    }

}
