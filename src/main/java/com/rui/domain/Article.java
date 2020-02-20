package com.rui.domain;

public class Article {
	private Integer aid;
	private String title;
	private String createTime;
	private String author;
	private String number;
	private String t1;
	private String t2;
	private String type1;

	public Article(Integer aid, String title, String createTime, String author, String number, String t1, String t2,
			String type1) {
		super();
		this.aid = aid;
		this.title = title;
		this.createTime = createTime;
		this.author = author;
		this.number = number;
		this.t1 = t1;
		this.t2 = t2;
		this.type1 = type1;
	}

	public Article() {
		super();
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	@Override
	public String toString() {
		return "Article [aid=" + aid + ", title=" + title + ", createTime=" + createTime + ", author=" + author
				+ ", number=" + number + ", t1=" + t1 + ", t2=" + t2 + ", type1=" + type1 + "]";
	}

}
