package com.company;

/**
 * Created by joaovitor on 4/24/15.
 */
public class Fatura implements Pagamento {
    private String numeroParte;
    private String descricaoParte;
    private int quantidade;
    private Double precoItem;

    // Construtor
    public Fatura(String parte, String descricao, int qte, double preco){
        this.numeroParte = parte;
        this.descricaoParte = descricao;
        this.quantidade = qte;
        this.precoItem = preco;
    }

    public String getNumeroParte() {
        return numeroParte;
    }

    public void setNumeroParte(String numeroParte) {
        this.numeroParte = numeroParte;
    }

    public String getDescricaoParte() {
        return descricaoParte;
    }

    public void setDescricaoParte(String descricaoParte) {
        this.descricaoParte = descricaoParte;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(Double precoItem) {
        this.precoItem = (precoItem < 0.0) ? 0.0 : precoItem; // Valida preço
    }

    public String toString(){
        return ("\nFatura" + "\nNumero Parte : " +
        this.getNumeroParte() + "\nDescrição: " +
        this.getDescricaoParte() + "\nQuantidade: " +
        this.getQuantidade() + "\nPreço por Item: " +
        this.getPrecoItem());
    }

    // Método requerido para executar o método da interface Pagamento
    public double getTotalPagamento(){
        return (this.getQuantidade() * this.getPrecoItem()); // Calcula o preço total
    }
}
