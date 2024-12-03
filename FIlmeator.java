public class Filmeator{
    private int idFilmeAtor;
    private Ator ator;
    private Filme filme;
    private String personagem;
    private boolean principal;

    public Filmeator(int idFilmeAtor,Ator ator, Filme filme, String personagem, boolean principal){
        this.idFilmeAtor = 0;
        this.ator = ator;
        this.filme = filme;
        this.personagem = personagem;
        this.principal = principal;
    }

    public int getIdFilmeAtor(){
        return this.idFilmeAtor;
    }
    public Ator getAtor(){
        return this.ator;
    }
    public Filme getFilme(){
        return this.filme;
    }
    public String getPersonagem(){
        return this.personagem;
    }
    public boolean principal(){
        return this.principal;
    }

    //cadastrar FilmeAtor
    //editar
    //consultar
    //listar
}
