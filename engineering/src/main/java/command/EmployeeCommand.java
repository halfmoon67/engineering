package command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeeCommand {
	Long empNo;
	String empId;
	String empPw;
	String empPwCon;
	String empName;
	String empDeptNum;
	String empEmail;
	String empPhoneNum;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date hireDate;
	Long salary;
	
	public Long getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Long empNo) {
		this.empNo = empNo;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpPw() {
		return empPw;
	}
	public void setEmpPw(String empPw) {
		this.empPw = empPw;
	}
	public String getEmpPwCon() {
		return empPwCon;
	}
	public void setEmpPwCon(String empPwCon) {
		this.empPwCon = empPwCon;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDeptNum() {
		return empDeptNum;
	}
	public void setEmpDeptNum(String empDeptNum) {
		this.empDeptNum = empDeptNum;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPhoneNum() {
		return empPhoneNum;
	}
	public void setEmpPhoneNum(String empPhoneNum) {
		this.empPhoneNum = empPhoneNum;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	public boolean isEmpPwEqualsEmpPwCon() {
		if(empPw.equals(empPwCon)) {
			return true;
		}else {
			return false;
		}
	}
	

}
