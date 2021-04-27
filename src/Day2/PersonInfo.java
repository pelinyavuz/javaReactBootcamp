package Day2;

public class PersonInfo {
	int id;
	String employeeCode;
	String employeeName;
	String employeeSurname;
	String idTcNo;
	String email;
	String phone;
	String titleName;

	public PersonInfo(int id, String employeeCode, String employeeName, String employeeSurname, String idTcNo,
			String email, String phone, String titleName) {
		this.id = id;
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.employeeSurname = employeeSurname;
		this.idTcNo = idTcNo;
		this.email = email;
		this.phone = phone;
		this.titleName = titleName;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSurname() {
		return employeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	public String getIdTcNo() {
		return idTcNo;
	}

	public void setIdTcNo(String idTcNo) {
		this.idTcNo = idTcNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}



}
