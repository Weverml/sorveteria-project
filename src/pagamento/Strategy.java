package pagamento;

public class Strategy {
    public Pagamento pagamento;

    public Strategy(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void executePagamento(double valor) {
        this.pagamento.pagar(valor);
    }
}
