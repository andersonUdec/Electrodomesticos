/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos;

import java.util.Scanner;

/**
 *
 * @author Anderson Suarez , Andres Chila
 */
public class Main {
    public static void main(String[] args) {     
        Scanner leer = new Scanner(System.in);
        //se le envian valores para llenar la Lavadora
        System.out.println("Lavadora");
        Electrodomesticos maquina;
        maquina = new Lavadora((double)150,(double)100,"blanco",'F', 5);
        ((Lavadora)maquina).comprobarConsumoEnergetico();
        ((Lavadora)maquina).comprobarColor();
        ((Lavadora)maquina).precioFinal();    
        
        System.out.println();
        //se le envian valores para llenar el Televisor
        System.out.println("Television");
        maquina = new Television(25,false,(double)150,"blanco",'F',5);
        ((Television)maquina).comprobarConsumoEnergetico();
        ((Television)maquina).comprobarColor();
        ((Television)maquina).precioFinal();
        
        System.out.println();
        System.out.println("     ARREGLO DE 10 ELECTRODOMESTICOS     ");
        //creacion del array de 10 electrodomesticos
        Electrodomesticos[] electro = new Electrodomesticos[10];
        System.out.println("Lavadora");
        electro[0] = new Lavadora((double)40, (double)120, "gris",'A', 20);
        electro[0].comprobarConsumoEnergetico();
        electro[0].comprobarColor();
        electro[0].precioFinal();
        System.out.println();
        System.out.println("Television");
        electro[1] = new Television(40,true,(double)120, "gris",'D', 30);
        electro[1].comprobarConsumoEnergetico();
        electro[1].comprobarColor();
        electro[1].precioFinal();
        System.out.println();
        System.out.println("Lavadora");
        electro[2] = new Lavadora((double)32, (double)127, "rojo",'E', 50);
        electro[2].comprobarConsumoEnergetico();
        electro[2].comprobarColor();
        electro[2].precioFinal();
        System.out.println();
        System.out.println("Television");
        electro[3] = new Television(20,true,(double)150, "negro",'B', 25);
        electro[3].comprobarConsumoEnergetico();
        electro[3].comprobarColor();
        electro[3].precioFinal();
        System.out.println();
        System.out.println("Lavadora");
        electro[4] = new Lavadora((double)40, (double)171, "blanco",'C', 120);
        electro[4].comprobarConsumoEnergetico();
        electro[4].comprobarColor();
        electro[4].precioFinal();
        System.out.println();
        System.out.println("Television");
        electro[5] = new Television(42,false,(double)180, "azul",'F', 40);
        electro[5].comprobarConsumoEnergetico();
        electro[5].comprobarColor();
        electro[5].precioFinal();
        System.out.println();
        System.out.println("Lavadora");
        electro[6] = new Lavadora((double)28, (double)90, "gris",'F', 92);
        electro[6].comprobarConsumoEnergetico();
        electro[6].comprobarColor();
        electro[6].precioFinal();
        System.out.println();
        System.out.println("Television");
        electro[7] = new Television(50,true,(double)200, "azul",'A', 50);
        electro[7].comprobarConsumoEnergetico();
        electro[7].comprobarColor();
        electro[7].precioFinal();
        System.out.println();
        System.out.println("Lavadora");
        electro[8] = new Lavadora((double)31, (double)108, "rojo",'C', 101);
        electro[8].comprobarConsumoEnergetico();
        electro[8].comprobarColor();
        electro[8].precioFinal();
        System.out.println();
        System.out.println("Television");
        electro[9] = new Television(32,false,(double)130, "negro",'D', 32);
        electro[9].comprobarConsumoEnergetico();
        electro[9].comprobarColor();
        electro[9].precioFinal();
        double totalPrecios =0;
        for(int i=0; i<10; i++){
            totalPrecios += electro[i].precioFinal();
        }
       System.out.println();
        //impresion de la suma total del array
        System.out.println("El precio total del array es: "+totalPrecios);
    }
}
