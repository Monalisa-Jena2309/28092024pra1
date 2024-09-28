package com.Elsaspring.springdemo;

public class lakes implements water{
	private String lake_name;
	public String getLake_name() {
		return lake_name;
	}
	public void setLake_name(String lake_name) {
		this.lake_name = lake_name;
	}
	public void display() {
		System.out.println("it's the largest lakes in the world"+lake_name);}
	@Override
	public String toString() {
		return "lake_name"+lake_name;
	}
	
}
