/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentos;

/**
 *
 * @author cjose
 */
public class Estoque {
    public String nome;
    public String qtde;
    public String preco;
    
    public Estoque(String nome, String qtde, String preco){
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQtde(String qtde){
        this.qtde = qtde;
    }
    public String getNome() {
        return nome;
    }
    public String getQtde() {
        return qtde;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
    @Override
    public String toString(){
        return nome + ":" + qtde + preco;
    }
    public void add(Estoque estoque){
        System.out.println("Adiciona um produto");
    }
    

    
    
}
