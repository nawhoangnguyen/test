/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constant;

/**
 *
 * @author USER
 */
public class StudentConstant {

    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_DESCRIPTION = "desciption";
    public static final String FIELD_Class_ID = "classesid";

    public static final String QUERY_FIND_ALL = "	SELECT [id]\n"
            + "		  ,[name]\n"
            + "		  ,[desciption]\n"
            + "		  ,[classesid]\n"
            + "	  FROM [Table_1]";
    public static final String QUERY_FIND_BY_ID = "SELECT [id]\n"
            + "		  ,[name]\n"
            + "		  ,[desciption]\n"
            + "		  ,[classesid]\n"
            + "	  FROM [Table_1]\n"
            + "	  WHERE ID = ?";
    public static final String QUERY_FIND_BY_ID_AND_NAME = "SELECT [id]\n"
            + "		  ,[name]\n"
            + "		  ,[desciption]\n"
            + "		  ,[classesid]\n"
            + "	  FROM [Table_1]\n"
            + "	  WHERE ID = ? and name = ?";
}
