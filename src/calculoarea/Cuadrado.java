/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoarea;

/**
 *
 * @author danil
 */
public class Cuadrado {
    float lado;
    float area;

    public Cuadrado(float lado) {
        this.lado = lado;     
        this.area=0;
    }
    public void calcularArea(){
        this.area=this.lado*this.lado;
    }
    public String resultado(){
        return this.area+" cm";
    }
}
