package com.dgit.domain;

public class StudentInfo {
	private String name;
	private int classGrade;
	private int math;
	private int eng;
	private int kor;
	private Report report;

	public StudentInfo() {

	}

	public StudentInfo(Report report) {
		this.report = report;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getClassGrade() {
		return classGrade;
	}

	public void setClassGrade(int classGrade) {
		this.classGrade = classGrade;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public String getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + classGrade);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("국어 : " + kor);
		return report.getReportGrade(math, eng, kor);

		
	}
}
