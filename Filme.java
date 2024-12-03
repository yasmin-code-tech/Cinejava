import java.io.*;

public class Filme{
    protected int idFilme;
    protected String titulo;
    protected int classificacao;
    protected Genero genero;
    protected String status;

    public Filme(int idFilme,String titulo, int classificacao,String status, Genero genero ){
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.status = status;
        this.genero = genero;
    }

    public int getIdFilme(){
        return this.idFilme;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public int getClassificacao(){
        return this.classificacao;
    }
    public String  getStatus(){
        return this.status;
    }

    public Genero getGenero(){
        return this.genero;
    }

    @Override
    public String toString() {
        return "Filme {" +
                "ID: " + this.idFilme +
                ", Título: '" + this.titulo + '\'' +
                ", Classificação: " + this.classificacao +
                ", Gênero: " + this.genero +
             ", Status: '" + this.status + '\'' +
                '}';
    }
    
    public boolean cadastrar(Filme filme){
        boolean retorno = false;
        try(
            FileWriter fw = new FileWriter("filme.txt",true);
            BufferedWriter writer = new BufferedWriter(fw);){
            writer.write(this.getIdFilme()+";"+this.getTitulo()+";"+this.getClassificacao()+";"+this.getGenero()+";"+this.getStatus());
            writer.newLine();
            System.out.println("Dados do filme "+ this.getTitulo()+ " cadastrados com sucesso!");
            retorno = true;
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Nao foi possivel cadastrar o filme");
        }

        return retorno;
    }

}