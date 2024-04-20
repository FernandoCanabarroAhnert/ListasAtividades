package LISTA7.Ex5;

public class ItemNotaFiscal {
    private String descricao;
    private Double valorUnid;
    private Integer quantidade;
    private Double aliquota;
    public ItemNotaFiscal(){}
    public ItemNotaFiscal(String descricao,Double valorUnid,Integer quantidade,Double aliquota){
        this.descricao = descricao;
        this.valorUnid = valorUnid;
        this.quantidade = quantidade;
        this.aliquota = aliquota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnid() {
        return valorUnid;
    }

    public void setValorUnid(Double valorUnid) {
        this.valorUnid = valorUnid;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }
    public double valorTotal(){
        return this.getValorUnid() * this.getQuantidade();
    }
    public double ICMS(){
        return this.valorTotal() * this.getAliquota() / 100;
    }

    @Override
    public String toString() {
        return "Descrição..: " + this.getDescricao() +"\n"
                + "Preço Unit.: R$" + String.format("%.2f",this.getValorUnid()) + "\n"
                + "Quantidade.: " + this.getQuantidade() + "\n"
                + "Valor total: R$" + String.format("%.2f",this.valorTotal()) + "\n"
                + "ICMS.......: R$" + String.format("%.2f",this.ICMS());
    }
}
