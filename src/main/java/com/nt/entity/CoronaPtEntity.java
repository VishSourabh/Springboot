package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRNA_PT_REG")
public class CoronaPtEntity {
	@Id
	@GeneratedValue 
	@Column(name = "CID")
	private Integer cid;

	@Column(name = "PTNAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "COUNTRY")
	private  String country;

	@Column(name = "COUNTRY_CODE")
	private Integer cCode;

	@Column(name = "MOBNO")
	private  Long mbno;

	public Long getMbno() {
		return mbno;
	}

	public void setMbno(Long mbno) {
		this.mbno = mbno;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getcCode() {
		return cCode;
	}

	public void setcCode(Integer cCode) {
		this.cCode = cCode;
	}

	@Override
	public String toString() {
		return "CoronaPtEntity [cid=" + cid + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ ", country=" + country + ", cCode=" + cCode + ", mbno=" + mbno + "]";
	}


}
