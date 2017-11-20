package abstractFactory;

/**
 * @author Administrator
 *1、抽象工厂模式(Abstract factory pattern): 提供一个接口, 用于创建相关或依赖对象的家族, 而不需要指定具体类.
2、生成器模式(Builder pattern): 使用生成器模式封装一个产品的构造过程, 并允许按步骤构造. 将一个复杂对象的构建与它的表示分离, 使得同样的构建过程可以创建不同的表示.
3、工厂模式(factory method pattern): 定义了一个创建对象的接口, 但由子类决定要实例化的类是哪一个. 工厂方法让类把实例化推迟到子类.
 */
public class Test {

	public static void main(String[] args) {
		Provider provider=new SendMailFactory();
		Sender sender=provider.produce();
		sender.send();
	}

}
