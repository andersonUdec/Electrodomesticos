/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos;

/**
 *
 * @author Anderson Suarez y Andres chilla
 */
public class Lavadora extends Electrodomesticos{
    //atributo propio de la clase
    public double carga;

    public Lavadora(double carga, double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = carga;
    }

    public Lavadora(double carga, double precioBase, String color, char consumo, int peso) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

  

    //metodo para comprobar si tiene consumo energetico y cual es su valor
    @Override
    public void comprobarConsumoEnergetico(){
        if(consumo=='A' || consumo=='a'){
            precioBase=precioBase+100;
            System.out.println("El consumo es de tipo A = $100");
        }else if(consumo=='B' || consumo=='b'){
            precioBase=precioBase+80;
           System.out.println("El consumo es de tipo B = $80");
        }else if(consumo=='C' || consumo=='c'){
            precioBase=precioBase+60;
           System.out.println("El consumo es de tipo C = $60");
        }else if(consumo=='D' || consumo=='d' ){
            precioBase=precioBase+50;
            System.out.println("El consumo es de tipo D = $50");
        }else if(consumo=='E' || consumo=='e'){
            precioBase=precioBase+30;
            System.out.println("El consumo es de tipo E = $30");
        }else if (consumo=='F' || consumo=='f'){
            precioBase=precioBase+10;
            System.out.println("El consumo es de tipo F = $10");
        }else 
            System.out.println("No existe ningun producto con esa descripcion");
    }
    //Metodo para imprimir el color del producto
    @Override
    public void comprobarColor(){
        if(color.equals("blanco") || color.equals("BLANCO")){
            System.out.println("El color de su producto es blanco");
        }else if(color.equals("negro")|| color.equals("NEGRO")){
            System.out.println("El color de su producto es negro");
        }else if(color.equals("rojo")|| color.equals("ROJO")){
            System.out.println("El color de su producto es rojo");
        }else if(color.equals("azul")|| color.equals("AZUL")){
            System.out.println("El color de su producto es azul");
        }else if(color.equals("gris")|| color.equals("GRIS")){
            System.out.println("El color de su producto es gris");
        }else 
            System.out.println("No hay productos con este color");
    }
    //Metodo donde hace comparaciones e imprime el precio final del producto
    @Override
    public double precioFinal(){
        //Compara el tamaño del producto para dar un valor por defecto es 5
        if(peso > 0 && peso <19){
            precioBase=precioBase+10;
            System.out.println("El rango de su peso esta entre 0 y 19");
        }else if(peso > 19 && peso <49){
            precioBase=precioBase+50;
            System.out.println("El rango de su peso esta entre 20 y 49");
        }else if(peso > 49 && peso <79){
            precioBase=precioBase+80;
            System.out.println("El rango de su peso esta entre 50 y 79");
        }else if(peso > 79){
            precioBase=precioBase+100;
            System.out.println("El rango de su peso es mayor a 80");
        }
        //Si la carga soportada por el producto es 
        if(carga>30){
            precioBase=precioBase+50;
        }
        System.out.println("El precio de su producto es: $"+precioBase);
        return precioBase;
    }

    public double getCarga() {
        return carga;
    }
}
