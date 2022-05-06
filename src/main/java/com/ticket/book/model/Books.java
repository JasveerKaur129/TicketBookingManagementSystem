package com.ticket.book.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Books
{
//Defining book id as primary key
@Id
@Column
private int bookid;
@Column
private String pngname;

@Column
private int price;
@Column
private String departure;
@Column
private String destination;
@Column
private String date;


public Books() {
	super();
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}

public String getPngname() {
	return pngname;
}
public void setPngname(String pngname) {
	this.pngname = pngname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDeparture() {
	return departure;
}
public void setDeparture(String departure) {
	this.departure = departure;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}

public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "Books [bookid=" + bookid + ", Pngname=" + pngname + ", price=" + price + ", departure=" + departure
			+ ", destination=" + destination + ", date=" + date + "]";
}

}