package dominio;

import java.util.Date;
import java.util.Random;
/*Esta entendidade representa uma Conta.
 *
 * Uma conta deve ser ligada apenas uma {@link Pessoa}. <p><br />
 * Quem regulamenta a conta é a {@link Instituicao}. <p><br />*/

public class Conta extends Instituicao{
    private String numero;
    private boolean ativa;
    private static Double saldo;
    private Pessoa pessoa;
    private Date dataAbertura;
    private CartaoCredito cartaoCredito;
    private boolean possuiCredito;

    public Conta () {
        Random random = new Random();

        this.numero = "" + random.nextInt(6) + " - " + random.nextInt(1);
        this.pessoa = new Pessoa();
        this.ativa = true;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public static Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public boolean isPossuiCredito() {
        return possuiCredito;
    }

    public void setPossuiCredito(boolean possuiCredito) {
        this.possuiCredito = possuiCredito;
    }
}
