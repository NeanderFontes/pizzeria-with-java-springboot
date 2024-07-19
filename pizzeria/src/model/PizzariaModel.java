package model;

public class PizzariaModel {

    private Long id;
    private String sabor;
    private Double preco;
    private char tamanho;


    public PizzariaModel(){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getSabor(){
        return sabor;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
}
