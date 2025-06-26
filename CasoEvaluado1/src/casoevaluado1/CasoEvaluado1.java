/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author Desert
 */
public class CasoEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AngenteDeVentas agente1 = new AngenteDeVentas();
        agente1.cedulaAgente = JOptionPane.showInputDialog(null, "Ingrese el numero de cedula del agente");
        //agente1.codigoAgente = JOptionPane.showInputDialog(null, "Ingrese el codigo del agente ");
        agente1.nombreAgente = JOptionPane.showInputDialog(null, "Ingrese el nombre del agente ");
        agente1.sucursal = JOptionPane.showInputDialog(null, "Ingrese la sucursal del agente ");
        agente1.vehiculoPropio = JOptionPane.showInputDialog(null, "Ingrese si el ajente tiene vehiculo propio ");

        
        
        Mostrar resultado = new Mostrar();
        
        int salir = 0;
        int montofac=1;
        while (true) {
            if (salir==2) {
                    continue;
                }
            
            Factura factura1 = new Factura();
            factura1.nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ");
            factura1.cedulaCliente = JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente: ");
            factura1.codigoFactura = JOptionPane.showInputDialog(null, "Ingrese el codigo de la factura");
            factura1.montoFactura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto de la factura: "));
            factura1.electro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos electricos: "));
            factura1.auto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos automotrices:"));
            factura1.constru = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos de contruccion : "));
            montofac = factura1.montoFactura + montofac;
            
            resultado.setNombreAgente(agente1.nombreAgente);
            resultado.setCodigoAgente(agente1.codigoAgente);
            //resultado.setObjetivoMensual(factura1.numeroMes);
            resultado.setTotalVendido(montofac);

            
            //JOptionPane.showMessageDialog(null, montofac);
            
            //resultado.SalidaFinal();
 
            
//            //if (factura1.constru==1) {
//                    JOptionPane.showMessageDialog(null, "jajajaja");
//                } else {
//                }
//            salir = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para agregar otra factura o digite 2 para salir ")));
        }
    }
    
}
