package dominio;

import java.util.Date;

public class Pessoa {
    private String nome;

    private Date dataNascimento;
    private String cpf;
    private Genero genero;
    /* Esta entendidade representa uma Pessoa.
     *
     * Uma pessoa possui CPF único. <p><br />
     * Uma pessoa também faz um relacionamento com {@link Genero}. <p><br />*/

    /*public Pessoa () {}*/
    public String getNome () {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
