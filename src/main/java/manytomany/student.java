package manytomany;
import javax.persistence.*;
import java.util.List;
@Entity
public class student {
	@Id
	private int rollno ;
	private String name;
	@ManyToMany(mappedBy="name")
	
	private List<project> proj;
	
//	@Override
//	public String toString() {
//		return "student [proj=" + proj + "]";
//	}
	public List<project> getProj() {
		return proj;
	}
	public void setProj(List<project> proj) {
		this.proj = proj;
	}
	
	public student(List<project> proj) {
		super();
		this.proj = proj;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", proj=" + proj + "]";
	}
	

}
