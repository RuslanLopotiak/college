package com.diplom.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.diplom.dao.GrouppDao;
import com.diplom.dao.StudentDao;
import com.diplom.model.Groupp;
import com.diplom.model.Student;
@Repository
public class StudentDaoImp extends BaseDaoImpl<Student, Integer> implements StudentDao{

	public StudentDaoImp() {
		super(Student.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
