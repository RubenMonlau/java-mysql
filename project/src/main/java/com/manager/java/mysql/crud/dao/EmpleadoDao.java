package com.manager.java.mysql.crud.dao;

import com.manager.java.mysql.crud.model.Empleado;

import java.sql.SQLException;
import java.util.List;

public interface EmpleadoDao {

    int add(Empleado emp) throws SQLException;

    Empleado getById(int id) throws SQLException;

    List<Empleado> getAll() throws SQLException;

    int update(Empleado emp) throws SQLException;

    void delete(int id) throws SQLException;

}
