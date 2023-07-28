package com.test.backend.model;

public class Produto {
   
    //#region atributos
    private Integer id;
    
    private String nome;
    
    private Integer qunatidade;
    
    private Double valor;

    private String observacao;
    //#endregion

    //#region getters and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQunatidade() {
        return qunatidade;
    }

    public void setQunatidade(Integer qunatidade) {
        this.qunatidade = qunatidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    //#endregion

    //teste
}
