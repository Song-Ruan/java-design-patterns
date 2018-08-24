package org.prototype;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
    * @ClassName: Person
    * @Description: 原型(Prototype)模式比较简单。通过拷贝这些原型创建新的对象
    * Java提供名为Cloneable的标示接口表示这个对象是可拷贝的
    * 标示接口起标示作用，在JVM中具有这个标记的对象才“有可能”被拷贝，覆盖clone()方法才确定对象可被拷贝
    * Java Object类中有方法：protected native Object clone() throws CloneNotSupportedException;
    * @author chengwy
    * @date 2018年8月24日
    *
 */
public class Person implements Cloneable{
	private static final Logger logger = LoggerFactory.getLogger(Person.class);
	
	private int id;
	private String name;
	private ArrayList<String> cardOfBank;

	public Person(int id, String name, ArrayList<String> cardOfBank) {
		super();
		this.id = id;
		this.name = name;
		this.cardOfBank = cardOfBank;
		logger.info("call constructor");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Person clone()  {
		Person person = null;
		try {
			person = (Person)super.clone();
			person.cardOfBank = (ArrayList<String>)this.cardOfBank.clone();
		} catch (CloneNotSupportedException e) {
			logger.error(String.format("clone person get an exception:%s", e.getMessage()));
		}
		return person;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", cardOfBank=" + cardOfBank + "]";
	}
}
