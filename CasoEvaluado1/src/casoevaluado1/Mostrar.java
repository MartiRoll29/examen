/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

import com.sun.source.tree.SwitchTree;
import javax.swing.JOptionPane;

/**
 *
 * @author Desert
 */
public class Mostrar {

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public int getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(int codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    public double getTotalComiciones() {
        return totalComiciones;
    }

    public void setTotalComiciones(double totalComiciones) {
        this.totalComiciones = totalComiciones;
    }

    public String getObjetivoMensual() {
        return objetivoMensual;
    }

    public void setObjetivoMensual(String objetivoMensual) {
        this.objetivoMensual = objetivoMensual;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public String getVehiculoPropio() {
        return vehiculoPropio;
    }

    public void setVehiculoPropio(String vehiculoPropio) {
        this.vehiculoPropio = vehiculoPropio;   
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    
    
    
    private String nombreAgente;
    private int codigoAgente;
    private String mes; 
    
    
    private double totalVendido;
    private double totalComiciones ;
    private String objetivoMensual;
    private int puntosObtenidos ;
    private String vehiculoPropio ;
    private String sucursal ;
    
    String mesEnTexto = "";

    
    
    public String SalidaFinal(){
        
        //muestra la salida final
        JOptionPane.showMessageDialog(null, "El agente vendedor: "+nombreAgente+" codigo de agente: "+codigoAgente+" en el mes de "+mes+"\nEl agente vendio un total de: "+totalVendido+" en facturas "+"\nEl agente vendedor obtuvo un total en comiciones de: "+totalComiciones+"\nEl agente vendedor "+objetivoMensual+" logro el objetivo de llegar al BONO EXTRA"+"\nPuntos obtenidos por el agente vendedor  "+puntosObtenidos+""+"\nEl agente vendedor "+vehiculoPropio+" cuenta con vehiculo propio"+"\nSucursal "+sucursal);
        
        
        return "";
    }
}
