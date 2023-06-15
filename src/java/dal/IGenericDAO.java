package dal;

/*				
 * Copyright (C) FPT University , Ltd. 2023	
 * 07/02/2023 FPT VinhPK2 DEBIT_BOOK_ITER1
 */	

import java.util.List;

public interface IGenericDAO<T> {
    
    /**
     * find all record in table
     * @return List
     */
    List<T> findAll();
    
    /**
     * insert an record to database
     * @param t 
     */
    int insertToDB(T t);
    
    /**
     * find an record by id
     * @param id
     * @return 
     */
    T findOneById(int id);
}
