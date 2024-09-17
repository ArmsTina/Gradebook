package JAVA2018E7120;

import java.util.*;

public class JAVA2018E7120_Info1 implements Comparable<JAVA2018E7120_Info1> { // 2학기 성적 정보를 저장한다

	public static ArrayList<JAVA2018E7120_Info1> AL2 = new ArrayList<JAVA2018E7120_Info1>();

	public class Subject {
		private int score;

		Subject() {

		}

		Subject(int sc) {
			this.score = sc;
		}

		public int getscore() {
			return this.score;
		}

		public void setscore(int score) {
			this.score = score;
		}
	}

	private Subject major;
	private Subject lib;
	private Subject curevt;
	private int total;
	private float avg;
	private int sem;
	private String rank;
	private String name;
	private String stdnum;

	public JAVA2018E7120_Info1() {
		name = new String();
		stdnum = new String();
		sem = 0;
		major = new Subject(); // 전공
		lib = new Subject(); // 교양
		curevt = new Subject(); // 시사
		total = 0;
		avg = 0;
		rank = "?"; // 절대평가 기준 학점
	}

	public int getmajor() {
		return this.major.getscore();
	}

	public void setmajor(int major) {
		this.major.setscore(major);
	}

	public int getlib() {
		return this.lib.getscore();
	}

	public void setlib(int lib) {
		this.lib.setscore(lib);
	}

	public int getcurevt() {
		return this.curevt.getscore();
	}

	public void setcurevt(int curevt) {
		this.curevt.setscore(curevt);
	}

	public int getsem() {
		return this.sem;
	}

	public void setsem(int sem) {
		this.sem = sem;
	}

	public int gettotal() {
		total = getlib() + getmajor() + getcurevt();
		return total;
	}

	public float getavg() {
		return this.avg = Math.round((total / 3.f * 100) / 100.0);
	}

	public String getrank() {
		if (avg >= 95) {
			rank = "A+";
		} else if (avg >= 90) {
			rank = "A";
		} else if (avg >= 85) {
			rank = "B+";
		} else if (avg >= 80) {
			rank = "B";
		} else if (avg >= 75) {
			rank = "C+";
		} else if (avg >= 70) {
			rank = "C";
		} else if (avg >= 60) {
			rank = "D";
		} else {
			rank = "F";
		}
		return rank;
	}

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getstdnum() {
		return this.stdnum;
	}

	public void setstdnum(String stdnum) {
		this.stdnum = stdnum;
	}

	@Override
	public String toString() {
		return ("이름 : " + " " + getname() + " " + "학번 : " + " " + getstdnum() + " " + "학기 : " + " " + getsem() + " "
				+ "전공 : " + " " + getmajor() + " " + "교양 : " + " " + getlib() + " " + "시사 : " + " " + getcurevt() + " "
				+ "총점 : " + " " + gettotal() + " " + "평균 : " + " " + getavg() + " " + "학점 : " + " " + getrank());
	}

	@Override
	public int compareTo(JAVA2018E7120_Info1 o1) {
		if (this.getavg() > o1.getavg()) {
			return 1;
		} else if (getavg() == o1.getavg()) {
			return 0;
		} else {
			return -1;
		}
	}

}

