package manytomany;
import javax.persistence.*;
import java.util.*;
@Entity
public class project {
	@Id
	private int pid;
	private String name;
	@ManyToMany
	private List<student>stud;
	
	
	
	public project(List<student> stud) {
		super();
		this.stud = stud;
	}
	public List<student> getStud() {
		return stud;
	}
	public void setStud(List<student> stud) {
		this.stud = stud;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public project(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
//	@Override
//	public String toString() {
//		return "project [pid=" + pid + ", name=" + name + ", stud=" + stud + "]";
//	}
	public project() {
		super();
		// TODO Auto-generated constructor stub
	        }
	@Override
	public String toString() {
		return "project [pid=" + pid + ", name=" + name + "]";
	

}
}
