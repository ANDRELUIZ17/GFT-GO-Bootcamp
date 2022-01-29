package dominio;

import java.util.Date;

public class Instituicao {
    private String nome;
    private String cnpj;
    private Date dataFundacao;
    private String codigo;
    /* Esta entendidade representa uma Instituição Bancária.
     *
     * Uma instituição possui CNPJ único. <p><br />
     * Uma instituição ela é regulamentada pelo Governo Federal. <p><br />*/

    public  Instituicao () {
        this.nome = "BigBank";
        this.cnpj = "45487878970004";
        this.dataFundacao = new Date();
        this.codigo = "0002";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
