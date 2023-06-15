package mapper;

/*				
 * Copyright (C) FPT University , Ltd. 2023	
 * 07/02/2023 FPT VinhPK2 DEBIT_BOOK_ITER1
 */	

import java.sql.ResultSet;

public interface IGenericMapper<T> {
    /**
     * Mapping data from database to result set
     * @param resultSet
     * @return Element or null
     */
    T mapRow(ResultSet resultSet);
}
