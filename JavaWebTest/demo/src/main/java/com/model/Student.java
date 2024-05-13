package com.model;

import java.util.Date;

public class Student {
    private String stuCode; // 学号
	private String stuName; // 姓名
	private int age; // 年龄
	private int sex; // 性别 0：男，1：女
	private String telephone; // 电话
	private Date birthday;// 出生日期
	private int belongClass;// 所属班级
	private String belongClassName;// 所属班级
	private String address; // 住址

	public String getStuCode() {
		return stuCode;
	}

	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getBelongClass() {
		return belongClass;
	}

	public void setBelongClass(int belongClass) {
		this.belongClass = belongClass;
	}

	public String getBelongClassName() {
		return belongClassName;
	}

	public void setBelongClassName(String belongClassName) {
		this.belongClassName = belongClassName;
	}
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
}