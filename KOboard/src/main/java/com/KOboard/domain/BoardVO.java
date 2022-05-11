package com.KOboard.domain;

import java.util.Date;

public class BoardVO {
/*  MariaDB Table
 * CREATE TABLE ko_board (
	bno	INT	NOT NULL AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	content TEXT NOT NULL,
	writer VARCHAR(30) NOT NULL,
	regDate TIMESTAMP DEFAULT NOW(),
	viewCnt INT DEFAULT 0,
	PRIMARY KEY(bno)
);
 */
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	
	//BoardVO getter, setter
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getwriter() {
		return writer;
	}
	public void setwriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	private int viewCnt;
	
}
