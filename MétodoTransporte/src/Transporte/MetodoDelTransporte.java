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
public class MetodoDelTransporte {
    private Integer origen, destino, demandaTotal=0, ofertaTotal=0;
    private Double[][] costos;
    private Integer[][] oferta, demanda,unidades;

    public Integer getOrigen() {
        return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }

    public Integer getDestino() {
        return destino;
    }

    public void setDestino(Integer destino) {
        this.destino = destino;
    }

    public Integer getDemandaTotal() {
        return demandaTotal;
    }

    public void setDemandaTotal(Integer demandaTotal) {
        this.demandaTotal = demandaTotal;
    }

    public Integer getOfertaTotal() {
        return ofertaTotal;
    }

    public void setOfertaTotal(Integer ofertaTotal) {
        this.ofertaTotal = ofertaTotal;
    }

    public Double[][] getCostos() {
        return costos;
    }

    public void setCostos(Double[][] costos) {
        this.costos = costos;
    }

    public Integer[][] getOferta() {
        return oferta;
    }

    public void setOferta(Integer[][] oferta) {
        this.oferta = oferta;
    }

    public Integer[][] getDemanda() {
        return demanda;
    }

    public void setDemanda(Integer[][] demanda) {
        this.demanda = demanda;
    }

    public Integer[][] getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer[][] unidades) {
        this.unidades = unidades;
    }

}
