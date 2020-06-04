package java_20200604;
//Emp 테이블의 데이터를 관리하기 위한 클래스
//Emp 테이블의 컬럼(empno, ename, job, mgr,
//hiredate,sal,comm,deptno)을 멤버변수로 정하면 됨.
//DTO : Date Transfer Object
public class EmpDto {
	//네이밍은 규칙안지키면 에러, 관례는 에러는 안나도 그렇게 쓰지말것.변수명의 첫글짜 소문자.
	//네이밍을 할때 데이터 베이스와 자바의 메인 위치는 다르다
	//뭐가 다르냐 데이타베이스는 칼럼며을 정할 때 될 수 있으면 테이블을 포함한 칼럼명 
	//이엠피가 테이블명 최소한 이엠피는 안써도 eno engr짧게 씀, 쪼인때문에 그럼
	//ename , dname 이 차이가 위에 내용임. 중복될 때
	private int no;
	private String name;
	private String job;
	private int mgr;
	private String hireDate;
	private int sal;
	private int comm;
	private int deptNo;
	//EmpDto empDto = new EmpDto();
	public EmpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpDto(int no, String name, String job, int mgr, String hireDate, int sal, int comm, int deptNo) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	

}
