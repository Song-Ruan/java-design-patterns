package org.templatemethod;

/**
 * @ClassName: TripTemplate
 * @Description: 模板模式主要是将共性往上提取，特性留待子类自己去实现。减少模板代码量。较常用
 * @author chengwy
 * @date 2018年8月21日
 */
public abstract class TripTemplate {
	private String name;
	private String from;
	private String to;

	public TripTemplate(String name, String from, String to) {
		super();
		this.name = name;
		this.from = from;
		this.to = to;
	}

	protected abstract String vehicle();

	public String trip() {
		return String.format("name:%s from:%s -> to:%s by %s", name, from, to, vehicle());
	}

}
