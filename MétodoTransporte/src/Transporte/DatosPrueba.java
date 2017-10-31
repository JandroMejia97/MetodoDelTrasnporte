/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

/**
 *
 * @author CARLOS ALEJANDRO
 */
public class DatosPrueba {
    private double[][] costos= {{2,1,5,3},{7,4,1,8},{3,2,8,5}};
    private Integer[] demanda={45,110,170,50};
    private Integer[] oferta={100,150,125};
    public String[] nombreDestinos={" ","La Libertad","Santa Ana","San Miguel","Ahuachapán","Oferta"};
    public String[] nombreOrigen={"Santa Tecla","San Salvador","San Vicente","Demanda"};

    public String[] getNombreDestinos() {
        return nombreDestinos;
    }
    
    public Integer getOferta(int index){
        return oferta[index];
    }
    
    public Integer getDemanda(int index){
        return demanda[index];
    }
    
    public Integer getDemandaTotal(){
        Integer total=0;
        for(int i=0;i<demanda.length;i++)
            total+=demanda[i];
        return total;
    }
    
    public Integer getOfertaTotal(){
        Integer total=0;
        for(int i=0;i<oferta.length;i++)
            total+=oferta[i];
        return total;
    }
    
    public void setNombreDestinos(String[] nombreDestinos) {
        this.nombreDestinos = nombreDestinos;
    }

    public String[] getNombreOrigen() {
        return nombreOrigen;
    }

    public void setNombreOrigen(String[] nombreOrigen) {
        this.nombreOrigen = nombreOrigen;
    }

    public double[][] getCostos() {
        return costos;
    }

    public void setCostos(double[][] costos) {
        this.costos = costos;
    }

    public Integer[] getDemanda() {
        return demanda;
    }

    public void setDemanda(Integer[] demanda) {
        this.demanda = demanda;
    }

    public Integer[] getOferta() {
        return oferta;
    }

    public void setOferta(Integer[] oferta) {
        this.oferta = oferta;
    }

    
}