package HibernateWebApplication;

public class Employee {

	private int s_id;
	private String username;
	private String password;
	public Employee(int s_id, String username, String password) {
		super();
		this.s_id = s_id;
		this.username = username;
		this.password = password;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "student [s_id=" + s_id + ", username=" + username + ", password=" + password + "]";
	}
}
