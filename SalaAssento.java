public class SalaAssento {
    private int idSala;
    private int capacidadeSala;
    private String descricao;
    private String status;

    public SalaAssento(int idSala, int capacidadeSala,String descricao, String status){
        this.idSala = idSala;
        this.capacidadeSala = capacidadeSala;
        this.descricao = descricao;
        this.status = status;
    }

    public int returnIdSala(){
        return this.idSala;
    }
    public int getCapacidadeSala(){
        return this.capacidadeSala;
    }
    public String getDescricaoSala(){
        return this.descricao;
    }
    public String getStatusSala(){
        return this.status;
    }
    
}
