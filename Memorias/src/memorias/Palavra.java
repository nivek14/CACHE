/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorias;

/**
 *
 * @author MOTTA-PC
 */
public class Palavra {
    private boolean bitValidade = false;
    private int index;

    public boolean isBitValidade() {
        return bitValidade;
    }

    public Palavra() {
    }

    public void setBitValidade(boolean bitValidade) {
        this.bitValidade = bitValidade;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
