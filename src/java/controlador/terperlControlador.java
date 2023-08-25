/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bean.estacionServicio;
import bean.terpel;
import dao.estacionServicioDao;
import dao.terpeDaoImpl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tiiin
 */
@WebServlet(name = "terperlControlador", urlPatterns = {"/terperl"})
public class terperlControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operacion = request.getParameter("operacion");

        switch (operacion) {
            case "guardar": {
                terpel terpel = new terpel();

                terpel.setNombreEstacion(request.getParameter("NombreEstacion"));
                terpel.setDireccionEstacion(request.getParameter("DireccionEstacion"));
                terpel.setEstadoEstacion(true);

                estacionServicioDao dao = new terpeDaoImpl(terpel);

                dao.registrarEstacion();

                break;
            }
            case "cambiarestacion": {
                terpel terpel = new terpel();

                terpel.setNombreEstacion(request.getParameter("NombreEstacion"));
                terpel.setDireccionEstacion(request.getParameter("DireccionEstacion"));
                terpel.setEstadoEstacion(true);

                estacionServicioDao dao = new terpeDaoImpl(terpel);

                dao.cambiarEstacion();

                break;
            }
            case "tanquear": {
                terpel terpel = new terpel();

                terpel.setIdEstacion(Integer.parseInt(request.getParameter("id")));
                terpel.setCantGalones(Integer.parseInt(request.getParameter("CantGalones")));
                terpel.setPrecioGalon(Integer.parseInt(request.getParameter("PrecioGalon")));
                terpeDaoImpl dao = new terpeDaoImpl(terpel);

                dao.tanquear();

                break;
            }
            case "recargar": {
                  terpel terpel = new terpel();

                terpel.setIdEstacion(Integer.parseInt(request.getParameter("id")));
                terpel.setCantGalones(Integer.parseInt(request.getParameter("CantGalones")));
                terpel.setPrecioGalon(Integer.parseInt(request.getParameter("PrecioGalon")));
                terpeDaoImpl dao = new terpeDaoImpl(terpel);

                dao.recargar();

                break;
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
