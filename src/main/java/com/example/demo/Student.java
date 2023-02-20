package com.example.demo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Student {
	@Id
	private Integer id;
	private String name;
	private String clg;
	private int sem;
	private int nosub1;
	private String sub1;
	private String sub2;
	private String sub3;
	
	private double msub1;
	private double msub2;
	private double msub3;
	private double toalavg;
	
	private double avgsub1;
	private double avgsub2;
	private double avgsub3;
	
	public Student(Integer id, String name, String clg, int sem, int nosub1, String sub1, String sub2, String sub3,
			double msub1, double msub2, double msub3, double toalavg, double avgsub1, double avgsub2, double avgsub3) {
		super();
		this.id = id;
		this.name = name;
		this.clg = clg;
		this.sem = sem;
		this.nosub1 = nosub1;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.msub1 = msub1;
		this.msub2 = msub2;
		this.msub3 = msub3;
		this.toalavg = toalavg;
		this.avgsub1 = avgsub1;
		this.avgsub2 = avgsub2;
		this.avgsub3 = avgsub3;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public int getNosub1() {
		return nosub1;
	}

	public void setNosub1(int nosub1) {
		this.nosub1 = nosub1;
	}

	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}

	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}

	public String getSub3() {
		return sub3;
	}

	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}

	public double getMsub1() {
		return msub1;
	}

	public void setMsub1(double msub1) {
		this.msub1 = msub1;
	}

	public double getMsub2() {
		return msub2;
	}

	public void setMsub2(double msub2) {
		this.msub2 = msub2;
	}

	public double getMsub3() {
		return msub3;
	}

	public void setMsub3(double msub3) {
		this.msub3 = msub3;
	}

	public double getToalavg() {
		return msub1+msub2+msub3/3;
	}

	public void setToalavg(double toalavg) {
		this.toalavg = toalavg;
	}

	public double getAvgsub1() {
		return avgsub1;
	}

	public void setAvgsub1(double avgsub1) {
		this.avgsub1 = avgsub1;
	}

	public double getAvgsub2() {
		return avgsub2;
	}

	public void setAvgsub2(double avgsub2) {
		this.avgsub2 = avgsub2;
	}

	public double getAvgsub3() {
		return avgsub3;
	}

	public void setAvgsub3(double avgsub3) {
		this.avgsub3 = avgsub3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[id="+id+",name"+name+",clg"+clg+" sem"+sem+"no of subject"+nosub1+"name of sub1"+sub1+"name of sub2"+sub2+"name of sub3"+sub3+"total avg"+toalavg+"avg of sub1"+avgsub1+"avg of sub2"+avgsub2+"aavg of sub3"+avgsub3+"]";
	}
	

}
