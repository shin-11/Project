package com.example.demo.trySpring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;


@Repository
public class HelloRepsitory {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Map<String,Object> findOne(int id){
		String query = "SELECT"
				+ "employee_id"
				+ "employee_name"
				+ "age"
				+ "from employee"
				+ "where employee_id=?";
		Map<String,Object> employee	= jdbcTemplate.queryForMap(query,id);
		
		return employee;
	}
}
