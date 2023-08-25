/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.terpel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.Conexion;

/**
 *
 * @author Tiiin
 */
public class terpeDaoImpl implements estacionServicioDao {

    terpel terpel = new terpel();

    public terpeDaoImpl(terpel bean) {

        terpel = bean;
    }

    @Override
    public boolean registrarEstacion() {
        boolean ingresadas = false;
        Connection con = null;
        PreparedStatement pstmt = null;
        Conexion conn = new Conexion();
        con = conn.buscarConexion();

        String sql = "  ";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, terpel.getNombreEstacion());
            pstmt.setString(2, terpel.getDireccionEstacion());

            pstmt.setBoolean(3, terpel.isEstadoEstacion());

            ingresadas = pstmt.executeUpdate() > 0;

        } catch (SQLException ee) {
            ingresadas = false;

        }
        return ingresadas;
    }

    @Override
    public boolean cambiarEstacion() {
        boolean ingresadas = false;
        Connection con = null;
        PreparedStatement pstmt = null;
        Conexion conn = new Conexion();
        con = conn.buscarConexion();

        String sql = "  ";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, terpel.getNombreEstacion());
            pstmt.setString(2, terpel.getDireccionEstacion());

            pstmt.setBoolean(3, terpel.isEstadoEstacion());
            pstmt.setInt(4, terpel.getIdEstacion());

            ingresadas = pstmt.executeUpdate() > 0;

        } catch (SQLException ee) {
            ingresadas = false;

        }
        return ingresadas;
    }

    public boolean tanquear() {
        boolean ingresadas = false;
        Connection con = null;
        PreparedStatement pstmt = null;
        Conexion conn = new Conexion();
        con = conn.buscarConexion();

        String sql = "  ";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, terpel.getCantGalones());
            pstmt.setInt(2, terpel.getPrecioGalon());

            pstmt.setInt(3, terpel.getIdEstacion());

            ingresadas = pstmt.executeUpdate() > 0;

        } catch (SQLException ee) {
            ingresadas = false;

        }
        return ingresadas;
    }

    public boolean recargar() {
        boolean ingresadas = false;
        Connection con = null;
        PreparedStatement pstmt = null;
        Conexion conn = new Conexion();
        con = conn.buscarConexion();

        String sql = "  ";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, terpel.getCantGalones());
            pstmt.setInt(2, terpel.getPrecioGalon());

            pstmt.setInt(3, terpel.getIdEstacion());

            ingresadas = pstmt.executeUpdate() > 0;

        } catch (SQLException ee) {
            ingresadas = false;

        }
        return ingresadas;
    }
}
