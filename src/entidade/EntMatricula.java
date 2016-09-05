package entidade;

import java.io.Serializable;

public class EntMatricula implements Serializable {

    private String nome;
    private String cpf;
    private String data;
    private String chSemanal;
    private String observacoes;
    private String modulo;
    private String turma;
    private String idioma;
    
    public EntMatricula(String nome, String cpf, String data, String chSemanal, 
            String observacoes, String modulo, String turma, String idioma) {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.chSemanal = chSemanal;
        this.observacoes = observacoes;
        this.modulo = modulo;
        this.turma = turma;
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getChSemanal() {
        return chSemanal;
    }

    public void setChSemanal(String chSemanal) {
        this.chSemanal = chSemanal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
