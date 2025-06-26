/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author Desert
 */
public class AngenteDeVentas {
    public String nombreAgente;
    public String cedulaAgente;
    public int codigoAgente;
    public String sucursal;
    public String vehiculoPropio;
    
    public String mostrarAgente(){
        
        JOptionPane.showMessageDialog(null,""+ nombreAgente+cedulaAgente+codigoAgente+ sucursal+ vehiculoPropio);

        return "";
    }
}
