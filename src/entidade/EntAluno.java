package entidade;

import java.io.Serializable;

public class EntAluno implements Serializable {

    private String nome;
    private String sexo;
    private String dataN;
    private String naturalidade;
    private String responsavel;
    private String nomeMae;
    private String dataNMae;
    private String cpf;
    private String rg;
    private String orgaoEmissor;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    private String celular;
    private String email;
    private String emailAluno;
    private String documentoAluno;

    public EntAluno(String nome, String sexo, String dataN,
            String naturalidade, String responsavel, String nomeMae, String dataNMae,
            String cpf, String rg, String orgaoEmissor, String endereco,
            String complemento, String bairro, String cidade, String uf, String cep,
            String telefone, String celular, String email, String emailAluno, String documentoAluno) {
        
        this.nome = nome;
        this.sexo = sexo;
        this.dataN = dataN;
        this.naturalidade = naturalidade;
        this.responsavel = responsavel;
        this.nomeMae = nomeMae;
        this.dataNMae = dataNMae;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoEmissor = orgaoEmissor;
        this.endereco = endereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.emailAluno = emailAluno;
        this.documentoAluno = documentoAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getDocumentoAluno() {
        return documentoAluno;
    }

    public void setDocumentoAluno(String documentoAluno) {
        this.documentoAluno = documentoAluno;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataN() {
        return dataN;
    }

    public void setDataN(String dataN) {
        this.dataN = dataN;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getDataNMae() {
        return dataNMae;
    }

    public void setDataNMae(String dataNMae) {
        this.dataNMae = dataNMae;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
