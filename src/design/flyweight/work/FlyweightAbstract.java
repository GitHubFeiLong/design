package design.flyweight.work;

import javax.print.attribute.TextSyntax;

/**
 * @ClassName FlyweightAbstract
 * @Description TODO
 * @Author msi
 * @Date 2019/6/14 20:07
 */
public abstract class FlyweightAbstract {
	public abstract String getText();
	public void display(TextStyle ts){
		System.out.println("字符串：" + this.getText() + "字体大小：" + ts.getSize() + ",字体颜色：" + ts.getColor());
	}
}
