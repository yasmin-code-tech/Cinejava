import java.io.*;
import java.util.*;
import java.time.*;
public class Funcionario extends Pessoa{
    private int matricula;
    private LocalTime horarioTrabalho;

    public Funcionario(String nome,String cpf,String email, int matricula, LocalTime horarioTrabalho){
        super(nome,cpf,email);
        this.matricula = matricula;
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getNome(){return this.nome;}
    public String getCpf(){return this.cpf;}
    public String getEmail(){return this.email;}
    public int getMatricula(){return this.matricula;}
    public LocalTime getHorarioTrabalho(){return this.horarioTrabalho;}

    


}