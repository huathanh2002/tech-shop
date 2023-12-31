package edu.poly.hello.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int productId;
	private String name;
	private double unitPrice;
	private String image;
	private String description;
	private double discount;
	private Date enteredDate;
	private short status;
	private int categoryId;
}
