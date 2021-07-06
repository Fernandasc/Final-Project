/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentos;
import java.util.ArrayList;
/**
 *
 * @author cjose
 */
public class ListaDeEstoque {
    public static void main(String[] args){
        ArrayList<Estoque> estoque = new ArrayList<>();
        
        Estoque estoque1 = new Estoque("Arroz "," 30 pacotes "," R$5.00");
        Estoque estoque2 = new Estoque("Feijão "," 40 pacotes "," R$4.00");
        Estoque estoque3 = new Estoque("Macarrão "," 45 pacotes "," R$7.00");
        Estoque estoque4 = new Estoque("Biscoitos "," 50 pacotes "," R$6.00");
        
        estoque.add(estoque1);
        estoque.add(estoque2);
        estoque.add(estoque3);
        estoque.add(estoque4);
        
        for(int i = 0;i<estoque.size();i++){
            System.out.println(estoque.get(i));
        }
        System.out.println("Total de itens da lista: " + estoque.size());
        
        System.out.println(estoque.contains(estoque4));
        
    }
    
}
