package entidade;

import java.io.Serializable;


public class EntTurma implements Serializable{
  
    private String nomeTurma;

    public EntTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

}
