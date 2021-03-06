
public class Student {

	private Integer studentId;
	private String studentName;
	private String mobileNumber;

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Student(Integer studentId, String studentName, String mobileNumber, Address address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + "]";
	}

}
