/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.Conexion;

/**
 *
 * @author Tiiin
 */
public class usuarioDao {

    Usuario usuario = new Usuario();

    public usuarioDao(Usuario bean) {
        usuario = bean;
    }

    public boolean registrarUsuario() {
        boolean ingresadas = false;
        Connection con = null;
        PreparedStatement pstmt = null;
        Conexion conn = new Conexion();
        con = conn.buscarConexion();

        String sql = "  ";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, usuario.getCorreoUsuario());
            pstmt.setString(2, usuario.getNombreUsuario());
            pstmt.setString(3, usuario.getPassword());
            pstmt.setString(4, usuario.getUsuario());
            pstmt.setInt(5, usuario.getTelefono());
            pstmt.setBoolean(6, usuario.isEstado());

            ingresadas = pstmt.executeUpdate() > 0;

        } catch (SQLException ee) {
            ingresadas = false;

        }
        return ingresadas;
    }

    public boolean iniciarSession() {
        boolean existe = false;
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet resultado = null;
        Conexion conn = new Conexion();
        String sentencia = null;

        sentencia = "";

        try {
            con = conn.buscarConexion();
            pstmt = con.prepareStatement(sentencia);
            pstmt.setString(1, usuario.getPassword());
            pstmt.setString(2, usuario.getUsuario());
            resultado = pstmt.executeQuery();
            if (resultado.next()) {
                existe = true;
            }
        } catch (Exception ee) {

            existe = false;

        }
        return existe;
    }
}
