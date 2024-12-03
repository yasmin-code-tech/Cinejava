import java.time.*;
public class Sessao {
    private int idSessao;
    private LocalDateTime dataHoraSessao;
    public Filme filme;
    private Sala sala;
    private Funcionario funcionario;
    private String status;

    public Sessao(int idSessao, LocalDateTime dataHoraSessao,Filme filme,Sala sala, Funcionario funcionario, String status){
        this.idSessao = idSessao;
        this.dataHoraSessao = dataHoraSessao;
        this.filme = filme;
        this.sala = sala;
        this.funcionario = funcionario;
        this.status = status;
    }

    public int getIdSessao(){
        return this.idSessao;
    }
    public LocalDateTime getDataHoraSessao(){
        return this.dataHoraSessao;
    }
    public Filme getFilme(){
        return this.filme;
    }
    public Sala getSala(){
        return this.sala;
    }
    public  Funcionario getFuncionario(){
        return this.funcionario;
    }
    public String getStatus(){
        return this.status;
    }

    //cadastrar
    //editar
    //consultar
    //listar

    

}
