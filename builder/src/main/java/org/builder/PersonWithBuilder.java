package org.builder;

/**
 * @ClassName: PersonWithBuilder
 * @Description: 使用构建器生成Person类
 * @author chengwy
 * @date 2018年8月22日
 *
 */
public class PersonWithBuilder {
	private int id; // 必选
	private String name; // 必选
	private int age; // 必选
	private String location; // 可选
	private String school; // 可选
	private double salary; // 可选

	private PersonWithBuilder(Builder builder) {
		super();
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
		this.location = builder.location;
		this.school = builder.school;
		this.salary = builder.salary;
	}

	public static class Builder {
		private int id; // 必选
		private String name; // 必选
		private int age; // 必选
		private String location = "DEAFULT_VAL"; // 可选
		private String school = "DEAFULT_VAL"; // 可选
		private double salary = 0; // 可选

		public Builder(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public Builder location(String location) {
			this.location = location;
			return this;
		}

		public Builder school(String school) {
			this.school = school;
			return this;
		}

		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public PersonWithBuilder build() {
			return new PersonWithBuilder(this);
		}
	}

	@Override
	public String toString() {
		return "PersonWithBuilder [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location
				+ ", school=" + school + ", salary=" + salary + "]";
	}
}
