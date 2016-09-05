package entidade;

import java.io.Serializable;

public class EntCaixa implements Serializable {

    private double fundoDeCaixa;
    private String desc;
    private String data;
    private String isEntradaSaida;

    public EntCaixa(double fundoDeCaixa, String desc, String data, String isEntradaSaida) {
        this.fundoDeCaixa = fundoDeCaixa;
        this.desc = desc;
        this.data = data;
        this.isEntradaSaida = isEntradaSaida;
    }

    public String getIsEntradaSaida() {
        return isEntradaSaida;
    }

    public void setIsEntradaSaida(String isEntradaSaida) {
        this.isEntradaSaida = isEntradaSaida;
    }

    public double getFundoDeCaixa() {
        return fundoDeCaixa;
    }

    public void setFundoDeCaixa(double fundoDeCaixa) {
        this.fundoDeCaixa = fundoDeCaixa;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
