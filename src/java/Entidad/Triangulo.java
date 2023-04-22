/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author patoe
 */
public class Triangulo 
{
    int id;
    float base;
    float altura;
    float perimetro;
    float area;

    public Triangulo(int id, float base, float altura) {
        this.id = id;
        this.base = base;
        this.altura = altura;
        this.perimetro = base * 3;
        this.area = base * altura / 2;
    }
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
        this.perimetro = base * 3;
        this.area = base * altura / 2;
    }

    public Triangulo()
    {
        
    }
    
    public int getId() {
        return id;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setPerimetro() {
        this.perimetro = this.base * 3;
    }

    public void setArea() {
        this.area = this.base * this.altura / 2;
    }

    
    
}
