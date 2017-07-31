package com.myspring.dao;

import com.myspring.model.StudentMarks;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Hessam on 7/30/17.
 */
public interface StudentDao {
    public void setDataSource(DataSource ds);
    public void create(String name ,Integer age,Integer marks,Integer year);
    public List<StudentMarks> listStudents();
}
