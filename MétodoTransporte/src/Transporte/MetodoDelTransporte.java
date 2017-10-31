/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CARLOS ALEJANDRO
 */
public class MetodoDelTransporte {

    private Integer origen, destino, demandaTotal = 0, ofertaTotal = 0;
    private Double[][] costos;
    private Integer[][] oferta, demanda, unidades;
    private DatosPrueba datos = new DatosPrueba();

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
    public void crearTablaSolucion(){
        
    }

    public void crearTablaIngresar(JTable restricciones, DefaultTableModel costosModel) {
        Object[] cabecera = new String[destino + 2];
        cabecera[0] = " ";
        cabecera[destino + 1] = "Oferta";
        int opcion = JOptionPane.showOptionDialog(null, "¿Desea ingresar el nombre de los puntos de origen y los puntos de destino?\nSí selecciona \"NO\" se pondrán números en su lugar", "Método de Transporte", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SI", "NO"}, "SI");
        if (opcion == 0) {
            while (costosModel.getRowCount() > 0) {
                costosModel.removeRow(0);
            }
            for (int i = 1; i <= destino; i++) {
                cabecera[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del Destino " + (i), JOptionPane.INFORMATION_MESSAGE);
            }
            costosModel = new DefaultTableModel(cabecera, 0) {
                public boolean isCellEditable(int row, int column) {
                    if (column == 0 || (row == restricciones.getRowCount() - 1 && column == restricciones.getColumnCount() - 1)) {
                        return false;
                    }
                    return true;
                }
            };
            restricciones.setModel(costosModel);
            String fila[] = new String[destino + 2];
            for (int i = 0; i < origen; i++) {
                fila[0] = JOptionPane.showInputDialog(null, "Ingrese el nombre del origen " + (i + 1), JOptionPane.INFORMATION_MESSAGE);
                costosModel.addRow(fila);
            }
            fila[0] = "Demanda";
            costosModel.addRow(fila);
        } else {
            while (costosModel.getRowCount() > 0) {
                costosModel.removeRow(0);
            }
            for (int i = 1; i <= destino; i++) {
                cabecera[i] = new String("Destino " + (i));
            }
            costosModel = new DefaultTableModel(cabecera, 0) {
                public boolean isCellEditable(int row, int column) {
                    if (column == 0 || (row == restricciones.getRowCount() - 1 && column == restricciones.getColumnCount() - 1)) {
                        return false;
                    }
                    return true;
                }
            };
            restricciones.setModel(costosModel);
            String fila[] = new String[destino + 2];
            for (int i = 0; i < origen; i++) {
                fila[0] = new String("Origen " + (i + 1));
                costosModel.addRow(fila);
            }
            fila[0] = "Demanda";
            costosModel.addRow(fila);
        }
    }

    public void crearTablaPrueba(JTable restricciones, DefaultTableModel costosModel) {
        String[] dato = datos.getNombreDestinos();
        costosModel = new DefaultTableModel(dato, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        restricciones.setModel(costosModel);
        Object fila[] = new Object[datos.getNombreOrigen().length + 2];
        dato = datos.getNombreOrigen();
        double suma = 0;
        double[][] costos = datos.getCostos();
        for (int i = 0; i < datos.getOferta().length; i++) {
            fila[0] = dato[i];

            for (int j = 1; j < datos.getDemanda().length + 1; j++) {
                if (j <= datos.getDemanda().length) {
                    fila[j] = costos[i][j - 1];
                }
            }
            fila[datos.getOferta().length + 2] = datos.getOferta(i);
            costosModel.addRow(fila);
        }
        fila[0] = dato[datos.getOferta().length];
        for(int j=1;j<datos.getDemanda().length+1;j++){
            fila[j]=datos.getDemanda(j-1);
        }
        fila[datos.getOferta().length + 2] = datos.getOfertaTotal();
        costosModel.addRow(fila);
    }
}
