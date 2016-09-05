package entidade;

import java.io.Serializable;

public class EntModulo implements Serializable{
    String modulo;

    public EntModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }


}
