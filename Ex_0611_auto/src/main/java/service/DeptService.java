package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DeptDAO;
import vo.DeptVO;

@Service
public class DeptService {
	
	DeptDAO dept_dao;
	
	@Autowired
	public DeptService(DeptDAO dept_dao) {
		this.dept_dao = dept_dao;
		System.out.println("---DeptService()생성자---");
	}

	public List<DeptVO> deptList(){
		List<DeptVO> list = dept_dao.selectList();
		return list;
		
	}

}
