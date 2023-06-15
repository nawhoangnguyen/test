/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import biz.ClassesBiz;
import biz.StudentBiz;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Classes;
import model.Student;

/**
 *
 * @author USER
 */
public class InsertStudentServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InsertStudentServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertStudentServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
//        lấy toàn bộ dữ liệu của classes trong database
//        List<Classes> list = new ClassesBiz().findAll();

//        request.setAttribute("listClasses", list);

        request.getRequestDispatcher("insertStudent.jsp").forward(request, response);
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
//        String name = request.getParameter("name");
//        String description = request.getParameter("description");
//        int classesId = Integer.parseInt(request.getParameter("classes"));
//        
//        Classes classes = Classes.builder().id(classesId).build();
//        
//        Student student = Student.builder()
//                .name(name)
//                .description(description)
//                .classes(classes)
//                .build();
//        
//        StudentBiz biz = new StudentBiz();
//        int id = biz.insertStudent(student);
//        
//        if (id == -1) {
//            request.setAttribute("error", "Insert 0 thành công");
//            request.getRequestDispatcher("insertStudent.jsp").forward(request, response);
//                    
//        }else{
////            request.getRequestDispatcher("NewServlet").forward(request, response);
//            response.sendRedirect("NewServlet");
//        }
                
        
               
        

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
