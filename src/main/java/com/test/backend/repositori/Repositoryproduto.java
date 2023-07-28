package com.test.backend.repositori;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.test.backend.model.Produto;
import org.springframework.stereotype.Repository;

@Repository
public class Repositoryproduto {
    private List <Produto> produtos = new  ArrayList <Produto>();
    private Integer ultimoid = 0;
    
    /**
     * metodo para retonar uma lista de produtos
     * @return lista da produtos
     */
    public List <Produto> obtertodos(){
        return produtos;}
    
    /**
     * metodo que retorna o produto encontrado pelo seu id
     * @param Id do produto  que sera localizado
     * @return retorna um produto caso seja encontrado
     */    
    public Optional <Produto> obterporId(Integer id){
        return produtos.stream()
        .filter(produto -> produto.getId() == id)
        .findFirst();    
    } 
    public Produto adicionar (Produto produtos){
        
        ultimoid++;
        
       
        produto.setId(ultimoid);
        produtos.add(produto);
        
        return produtos;
    }

}
