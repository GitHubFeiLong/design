package design.proxy.protect;

/**
 * @ClassName PersonBean
 * @Description TODO 这个接口可以设置和取得人的名字，性别，兴趣，和评分
 * @Author msi
 * @Date 2019/6/16 9:35
 */
public interface PersonBean {
	String getName();   // 获取姓名
	String getGender();     // 获取性别
	String getInterests();  // 获取兴趣
	int getHotOrNotRating();    // 获取评分值

	void setName(String name);     //设置姓名
	void setGender(String gender);   // 设置性别
	void setInterests(String interests);    // 设置兴趣
	void setHotOrNotRating(int rating);   // 设置评分值
}