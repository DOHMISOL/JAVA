package com.kopo.myapp;

public class User {
	int idx;
	String id;
	String pwd;
	String name;
	String phone;
	String gender;
	String address;
	String joined;
	String type;
	
	User(){
		
	}
	
	User(String id, String pwd, String name, String phone, String gender, String address, String joined, String type){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.joined = joined;
		this.type = type;
	}
	
	User(int idx, String id, String pwd, String name, String phone, String gender, String address, String joined, String type){
		this.idx= idx;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.joined = joined;
		this.type = type;
	}
}
