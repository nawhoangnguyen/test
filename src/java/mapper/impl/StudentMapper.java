/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper.impl;

import constant.StudentConstant;
import java.sql.ResultSet;
import java.sql.SQLException;
import mapper.IGenericMapper;
import model.Student;

/**
 *
 * @author USER
 */
public class StudentMapper implements IGenericMapper<Student>{

    @Override
    public Student mapRow(ResultSet resultSet) {
        try {
            int id = resultSet.getInt(StudentConstant.FIELD_ID);
            String name = resultSet.getString(StudentConstant.FIELD_NAME);
            String description = resultSet.getString(StudentConstant.FIELD_DESCRIPTION);
            int classId = resultSet.getInt(StudentConstant.FIELD_ID);
            
            Student student = new Student(id, name, description, classId);
            return student;
        } catch (SQLException e) {
            System.out.println("Wrong at student mapper"+ e.getMessage());
        e.printStackTrace();
        return null;
        }
    }
    
}
