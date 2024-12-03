public class Assento {
    private int idAssento;
    private TipoAssento tipoAssento;

    public Assento(int idAssento, TipoAssento tipoAssento){
        this.idAssento = idAssento;
        this.tipoAssento = tipoAssento;
    }

    public int getIdAssento(){
        return this.idAssento;
    }
    public TipoAssento getTipoAssento(){
        return this.tipoAssento;
    }



}
