/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado1;

import java.util.HashSet;
import java.util.Set;
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
        
        // crea las instancias 
        AngenteDeVentas agente1 = new AngenteDeVentas();
        Mostrar resultado = new Mostrar();
        Factura factura1 = new Factura();
       
        // define las variables que se usan para determinar las salidas y contadores/acumuladores 
        int salir = 0;
        int montofac = 0;
        double bonoAgente = 0;
        boolean masBonos = true;
        int puntosVendedor = 0;
        int cantidadFacturas = 0;
        boolean bonoExtra = false;
        String msjBono = " no ";
        String MesEnTexto = "";
        
        
        //ingresa los datos del agente 
        agente1.nombreAgente = JOptionPane.showInputDialog(null, "Ingrese el nombre del agente ");
        agente1.cedulaAgente = JOptionPane.showInputDialog(null, "Ingrese el numero de cedula del agente");
        agente1.codigoAgente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo del agente "));
        agente1.sucursal = JOptionPane.showInputDialog(null, "Ingrese la sucursal del agente ");
        agente1.vehiculoPropio = JOptionPane.showInputDialog(null, "Ingrese si el agente tiene vehiculo propio ");
        factura1.setNumeroMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del mes de la/las facturas: ")));

        agente1.mostrarAgente();
        
        


        while (salir!=2) {
            //ingresa los datos necesarios de las facturas
            factura1.setNombreCliente(JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ")); 
            factura1.setCedulaCliente(JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente: ")); 
            factura1.setCodigoFactura(JOptionPane.showInputDialog(null, "Ingrese el codigo de la factura: ")); 
            factura1.setMontoFactura(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto de la factura: "))); 
            factura1.setElectro(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos electricos: "))); 
            factura1.setAuto(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos automotrices: ")));
            factura1.setConstru(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos de contruccion: ")));
            
                        
            
            
            montofac = factura1.getMontoFactura() + montofac; // acumula el total de montos en las facturas 
            cantidadFacturas+=1; // cuenta la cantidad de facturas que se van ingresando 
            
            
            if (factura1.getElectro()>1 && factura1.getAuto()>1 && factura1.getConstru()>1) { // verifica si se vendieron mas de tres articulos en cada categoria 
                bonoAgente = bonoAgente + (factura1.getMontoFactura()*0.10);
                puntosVendedor = puntosVendedor + 3;
                masBonos = false;
            }
            
            if (factura1.getMontoFactura()>50000){ // verifica si el monto de la facturas es mayor a 50000
                bonoAgente = bonoAgente + (factura1.getMontoFactura()*0.05);
                puntosVendedor = puntosVendedor + 1;
            }
            
            
            if (masBonos){
                if (factura1.getElectro()>=3){ // verifica si se vendieron mas de tres articulos en electro y que pueda acumular mas bonos
                    bonoAgente = bonoAgente + (factura1.getMontoFactura()*0.04);
                    puntosVendedor = puntosVendedor + 1;
                }else{
                    bonoAgente = bonoAgente + (factura1.getMontoFactura()*0.02);
                    puntosVendedor = puntosVendedor + 1;

                }

                if (factura1.getAuto()>=4){ // verifica si se vendieron mas de tres articulos en auto y que pueda acumular mas bonos
                    bonoAgente = bonoAgente + (factura1.getMontoFactura()*0.04);
                    puntosVendedor = puntosVendedor + 1;
                }else{
                    bonoAgente = bonoAgente + (factura1.getMontoFactura()*0.02);
                    puntosVendedor = puntosVendedor + 1;
                }            

                if (factura1.getConstru()>0){ // verifica si se vendieron mas de tres articulos en auto y que pueda acumular mas bonos
                    bonoAgente = bonoAgente + (factura1.getMontoFactura()*0.08);
                    puntosVendedor = puntosVendedor + 2;
                }
                
                if (cantidadFacturas >= 3 || montofac>300000){ // verifica si se ingresaron mas de 3 facturas o el monto total de las facturas es mayor de 300000
                    bonoExtra = true;
                    bonoAgente = bonoAgente + 20000;
                }
            }
            
            masBonos = true; // deja para la siguiente factura la posibilidad de mas bonos 

        
            if (bonoExtra){ // verifica si hay llego al bono extra y define la salida para el resultado
                msjBono = "si ";
            }else{
                msjBono = "no ";
            }
            


            
            
            //pregunta si desea ingresar mas facturas
            salir = (Integer.parseInt(JOptionPane.showInputDialog(null, "Si no desea ingresar mas facturas dijite 2 ")));
        }
        
        
            switch(factura1.getNumeroMes()){
                case 1:
                    MesEnTexto = "Enero";
                    break;
                case 2:
                    MesEnTexto = "Febrero";     
                    break;
                case 3:
                    MesEnTexto = "Marso";
                    break;
                case 4:
                    MesEnTexto = "Abril";
                    break;
                case 5:
                    MesEnTexto = "Mayo";
                    break;
                case 6:
                    MesEnTexto = "Junio";        
                    break;
                case 7:
                    MesEnTexto = "Julio";
                    break;
                case 8:
                    MesEnTexto = "Agosto";
                    break;
                case 9:
                    MesEnTexto = "Septiembre";
                    break;
                case 10:
                    MesEnTexto = "Octubre";        
                    break;
                case 11:
                    MesEnTexto = "Noviembre";
                    break;
                case 12:
                    MesEnTexto = "Diciembre";
                    break;
            }


        // mostrar la salida final
        
        resultado.setNombreAgente(agente1.nombreAgente);
        resultado.setCodigoAgente(agente1.codigoAgente);
        JOptionPane.showMessageDialog(null, ""+MesEnTexto);
        resultado.setMes(MesEnTexto);
        
        resultado.setTotalVendido(montofac);
        resultado.setTotalComiciones(bonoAgente);
        resultado.setObjetivoMensual(msjBono);
        resultado.setPuntosObtenidos(puntosVendedor);   
        resultado.setVehiculoPropio(agente1.vehiculoPropio);
        resultado.setSucursal(agente1.sucursal);
        
        resultado.SalidaFinal();

    }
    
}
