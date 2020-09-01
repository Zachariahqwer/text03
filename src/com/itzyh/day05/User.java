package com.itzyh.day05;

/**
 * 第10章 课后作业 创建HashMap对象，存储银行储户信息
 * @author 38198
 *
 */
public class User implements Comparable<User>{

	private Integer id;
	private String name;
	private Double money;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public User(Integer id, String name, Double money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result+((id == null)?0:id.hashCode());
		result = prime*result+((money == null)?0:money.hashCode());
		result = prime*result+((name == null)?0:name.hashCode());
		return result;
	}
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", money=" + money + "]";
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
