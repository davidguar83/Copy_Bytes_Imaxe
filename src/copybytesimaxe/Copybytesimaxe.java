/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copybytesimaxe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author david
 */
public class Copybytesimaxe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        File orixen = new File("C:/Users/david/Desktop/prueba clase file/foto.jpg");
        File destino = new File("C:/Users/david/Desktop/prueba clase file/foto2.jpg");

        int contador = 0;

        try {
            int c = 0;
            FileInputStream ler = new FileInputStream(orixen);
            FileOutputStream escribir = new FileOutputStream(destino,true);                                       // esta misma aplicacion si le quitas el true, solo reescribe el texto2.txt
            while (c != -1) {

                c = ler.read();
                escribir.write(c);
                contador++;

                
            }

            ler.close();

            escribir.close();
        } catch (IOException e) {
            System.out.println("Error con un archivo");

        }
        
        
        System.out.println(contador+ " Bytes");

    }
}





//   1)   ocupan 2,48M, osea, la imagen 1 y la 2 tienen el mismo tamaño 2609247 bytes


//  2)  ahora ocupa el doble 4,97 M, pero solo se ve una imagen, se duplico el tamaño, pero no la imagen fisica.