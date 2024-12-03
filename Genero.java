public class Genero {
    private int id;
    private String descricao;
    private String status;

    public Genero(String descricao){
        this.descricao = descricao;
    };
    
    public Genero(int id, String descricao, String status){
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }
    public int getId(){
        return this.id;
    }
    public String getDesc(){
        return this.descricao;
    }
    public String getStatus(){
        return this.status;
    }
    
    @Override
    public String toString() {
        return "Genero {" +
                "ID: " + id +
                ", Descrição: '" + descricao + '\'' +
                ", Status: '" + status + '\'' +
                '}';
    }
    
    

}
