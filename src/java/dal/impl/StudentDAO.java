/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.impl;

import com.debitbook.model.Parameter;
import constant.StudentConstant;
import dal.IGenericDAO;
import java.beans.Statement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mapper.impl.StudentMapper;
import model.Classes;
import model.Student;

/**
 *
 * @author USER
 */
public class StudentDAO extends dal.DBContext<Student> implements IGenericDAO<Student> {

    @Override
    public List<Student> findAll() {
        String sql = StudentConstant.QUERY_FIND_ALL;
        List<Student> list = query(sql, new StudentMapper());
        return list;
    }

    @Override
    public int insertToDB(Student t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student findOneById(int id) {
        String sql = StudentConstant.QUERY_FIND_BY_ID;
        List<Student> list = query(sql, new StudentMapper(),
                new Parameter(id, Types.INTEGER));

        return list.isEmpty() ? null : list.get(0);
    }

    public Student findOneByIdAndName(int id, String name) {
        String sql = StudentConstant.QUERY_FIND_BY_ID_AND_NAME;
        List<Student> list = query(sql, new StudentMapper(), new Parameter(id, Types.INTEGER),
                 new Parameter(name, Types.NVARCHAR));

        return list.isEmpty() ? null : list.get(0);
    }

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student student = dao.findOneByIdAndName(1,"Le Huu Cuong");
        System.out.println(student);

    }

}
