package com.atguigu.javase;

public class Person {

	private String username;
	private Integer age;
	private String password;
	private String email;

	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", password=" + password + ", email=" + email + "]";
	}

	public Person() {
		super();
	}

	public Person(String username, Integer age, String password, String email) {
		super();
		this.username = username;
		this.age = age;
		this.password = password;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
