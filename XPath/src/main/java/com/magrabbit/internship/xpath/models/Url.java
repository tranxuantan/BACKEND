package com.magrabbit.internship.xpath.models;


import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Url {
	private int id;
	private String url;
	private Timestamp date;
	private String html;
	
	public Url() {
	}

	public Url(String url) {
		super();
		this.url = url;
		this.date = new Timestamp(System.currentTimeMillis());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

	public String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	public void setDate(String date) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			this.date = (Timestamp) sf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}
	
	
	
}