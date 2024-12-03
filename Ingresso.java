public class Ingresso {
    private int idIngresso;
    private double valorPago;
    private SalaAssento salaAssento;
    private Sessao sessao;

    public Ingresso(int idIngresso, double valorPago, SalaAssento salaAssento, Sessao sessao){
        this.idIngresso = idIngresso;
        this.valorPago = valorPago;
        this.salaAssento = salaAssento;
        this.sessao = sessao;
    }

    public int getIdIngresso(){
        return this.idIngresso;
    }
    public double valorPago(){
        return this.valorPago;
    }
    public SalaAssento getsalaAssento(){
        return this.salaAssento;
    }
    public Sessao getSessao(){
        return this.sessao;
    }
    

}

