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
public class Dados {
    ArrayList<Estoque> estoque = new ArrayList();
    
    public void cadastraAlimento(Estoque estoque){
        this.estoque.add(estoque);
    }
    public int qtde(){
        return this.estoque.size();
    }
    
}
