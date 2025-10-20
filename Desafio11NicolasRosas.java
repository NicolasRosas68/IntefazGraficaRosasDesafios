/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio11nicolasrosas;

/**
 *
 * @author Alumno
 */
public class Desafio11NicolasRosas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaConversor vista = new VistaConversor();
        Conversor modelo = new Conversor();
        new ControladorConversor(vista, modelo);
    }

}
