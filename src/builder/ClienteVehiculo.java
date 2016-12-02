/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Scanner;

/**
 *
 * @author Sir Ignacio
 */
public class ClienteVehiculo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ConstructorDocumentacionVehiculo constructor;
        System.out.println("Desea generar: documentacion HTML(1) o PDF(2)");
        int seleccion= reader.nextInt();
        
        if (seleccion==1) {
            constructor= new ConstructorDocumentacionVehiculoHtml();
        }else{
           constructor= new ConstructorDocumentacionVehiculoPdf(); 
        } 
        
        Vendedor vendedor= new Vendedor(constructor);
        
        Documentacion documentacion= vendedor.construye("Ignacio");
        
        documentacion.imprime();
    }
}
