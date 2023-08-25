/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Tiiin
 */
public class estacionServicio {

    private int idEstacion;
    private String nombreEstacion;
    private String direccionEstacion;
    private boolean estadoEstacion;

    /**
     * @return the idEstacion
     */
    public int getIdEstacion() {
        return idEstacion;
    }

    /**
     * @param idEstacion the idEstacion to set
     */
    public void setIdEstacion(int idEstacion) {
        this.idEstacion = idEstacion;
    }

    /**
     * @return the nombreEstacion
     */
    public String getNombreEstacion() {
        return nombreEstacion;
    }

    /**
     * @param nombreEstacion the nombreEstacion to set
     */
    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    /**
     * @return the direccionEstacion
     */
    public String getDireccionEstacion() {
        return direccionEstacion;
    }

    /**
     * @param direccionEstacion the direccionEstacion to set
     */
    public void setDireccionEstacion(String direccionEstacion) {
        this.direccionEstacion = direccionEstacion;
    }

    /**
     * @return the estadoEstacion
     */
    public boolean isEstadoEstacion() {
        return estadoEstacion;
    }

    /**
     * @param estadoEstacion the estadoEstacion to set
     */
    public void setEstadoEstacion(boolean estadoEstacion) {
        this.estadoEstacion = estadoEstacion;
    }
}
