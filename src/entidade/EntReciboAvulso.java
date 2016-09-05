package entidade;

import java.io.Serializable;

public class EntReciboAvulso implements Serializable{

    String nomeAluno;
    String data;
    String valor;
    String desc;
    String telefone;

    public EntReciboAvulso(String nomeAluno, String data, String valor, String desc, String telefone) {
        this.nomeAluno = nomeAluno;
        this.data = data;
        this.valor = valor;
        this.desc = desc;
        this.telefone = telefone;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
                   
                            
}
