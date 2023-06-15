/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz;

import dal.impl.StudentDAO;
import java.util.List;
import model.Student;

/**
 *
 * @author USER
 */
public class StudentBiz {

    public List<Student> findAll() {
        StudentDAO dao = new StudentDAO();
        List<Student> list = dao.findAll();
        return list;

    }

//    public List<Student> findByName(String name) {
//        StudentDAO dao = new StudentDAO();
//        List<Student> list = dao.findByName(name); //nhảy xuống StudentDAO
////        sau lớp này list đã có đc dữ liệu từ StudentDAO
//        return list;
//    }
//
//    public int insertStudent(Student student) {
//        StudentDAO dao = new StudentDAO();
//        int result = dao.insertStudent(student);
//        return result;
//    }

}
