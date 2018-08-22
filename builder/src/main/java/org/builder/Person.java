package org.builder;

/**
 * @ClassName: Person
 * @Description: 建造者模式很常用，一般用在某个对象的构造函数参数比较多，且有可选参数时 否则，需要定义多个重载构造函数;
 *               或者使用setter的方式，但是不线程安全 参考 <Effective Java 2nd> item 2
 * @author chengwy
 * @date 2018年8月22日
 *
 */
public class Person {
	private int id; // 必选
	private String name; // 必选
	private int age; // 必选
	private String location; // 可选
	private String school; // 可选
	private double salary; // 可选

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(int id, String name, int age, String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public Person(int id, String name, int age, String location, String school) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.location = location;
		this.school = school;
	}

	public Person(int id, String name, int age, String location, String school, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.location = location;
		this.school = school;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + ", school=" + school
				+ ", salary=" + salary + "]";
	}
}
