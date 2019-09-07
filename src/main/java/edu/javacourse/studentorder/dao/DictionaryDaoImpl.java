package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.Street;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DirectoryDao {

  private Connection getConnection() throws SQLException {
    Connection con = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5433/",
            "postgres",
            "postgres");
            return con;
  }

  public List<Street> findStreet(String pattern) throws Exception{
    List<Street> result = new LinkedList<>();
    Connection con = getConnection();
    Statement stat = con.createStatement();
    String sql = "SELECT street_code, street name FROM jc_street WHERE UPPER(street_name) LIKE UPPER('%" + pattern + "%')";
    ResultSet rs = stat.executeQuery(sql);
    while (rs.next()) {
      Street str = new Street(rs.getLong("street_code"),rs.getString("street_name"));
      result.add(str);
    }
    return result;
  }
}
