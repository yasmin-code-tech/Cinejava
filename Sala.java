public class Sala {
    private int idSala;
    private int capacidadeSala;
    private String descricao;
    private String status;

    public Sala(int idSala, int capacidadeSala, String descricao,String status){
        this.idSala = 0;
        this.capacidadeSala = capacidadeSala;
        this.descricao = descricao;
        this.status = status;
    }

    public int getidSala(){
        return this.idSala;
    }
    public int getcapacidadeSala(){
        return this.capacidadeSala;
    }
    public String getDesc(){
        return this.descricao;
    }
    public String getStatus(){
        return this.status;
    }
    
}
