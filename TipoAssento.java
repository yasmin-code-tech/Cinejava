public class TipoAssento {
    private int idTipoAssento;
    private String descricao;
    public String status;

    public TipoAssento(int idTipoAssento, String descricao,String status ){
        this.idTipoAssento = idTipoAssento;
        this.descricao = descricao;
        this.status = status;
    }

    public int getidTipoAssento(){
        return this.idTipoAssento;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public String status(){
        return this.status;
    }
    

    public boolean cadastrar(TipoAssento tipoAssento){

    }
    public boolean editar(TipoAssento tipoAssento){

    }
    public TipoAssento consultar(TipoAssento tipoAssento){

    }
    public <tipoassento> listar(TipoAssento tipoAssento){

    }
}
