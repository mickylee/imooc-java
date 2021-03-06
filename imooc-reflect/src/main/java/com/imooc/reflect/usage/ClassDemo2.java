package com.imooc.reflect.usage;

/**
 * @author	Lian
 * @time	2016年2月28日 下午7:04:07
 * @desc	
 */
public class ClassDemo2 {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		Class c1 = int.class;	// int的类类型
		Class c2 = String.class;	// String类的类类型  String类字节码
		Class c3 = double.class;	// double数据类型
		Class c4 = Double.class;	// Double类
		Class c5 = void.class;
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());		// 不包含包名的类名称
		System.out.println(c5.getName());
	}
}
