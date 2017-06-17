/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author fabio
 */
public class Index {
    private int id;
    private String textoPrincipal;
    private String cabecalho;
    
    public Index() {
        
    }

    public Index(String textoPrincipal, String cabecalho) {
        this.textoPrincipal = textoPrincipal;
        this.cabecalho = cabecalho;
    }
    
    
    
    public Index(int id, String textoPrincipal, String cabecalho) {
        this.cabecalho = cabecalho;
        this.textoPrincipal = textoPrincipal;
        this.id = id;
    }
    
    public String getTextoPrincipal() {
        return this.textoPrincipal;
    }
    
    public void setTextoPrincipal(String textoPrincipal) {
        this.textoPrincipal = textoPrincipal;
    }
    
    public String getCabecalho() {
        return this.cabecalho;
    }
    
    public void setCabecalho() {
        this.cabecalho = cabecalho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public String toString() {
        return "" + this.id + "\n"+ this.textoPrincipal +"\n"+ this.cabecalho;
    }
    
}
