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
public class Rectangulo {
    float base;
    float altura;
    float area;
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
        this.area=0;
    }
    public void calcularArea(){
        this.area=this.base*this.altura;
    }
    public String resultado(){
        return this.area+" cm";
    }   
}
