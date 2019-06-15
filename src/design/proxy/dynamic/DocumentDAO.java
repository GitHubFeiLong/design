package design.proxy.dynamic;

/**
 * @ClassName DocumentDAO
 * @Description TODO 文档DAO类，具体主题角色类
 * @Author msi
 * @Date 2019/6/15 11:17
 */
public class DocumentDAO implements AbstractDocumentDAO{
	@Override
	public Boolean deleteDocumentById(String documentId) {
		if (documentId.equalsIgnoreCase("D001")){
			System.out.println("删除ID为‘" + documentId + "'的文档信息成功！");
			return true;
		}
		System.out.println("删除ID为‘" + documentId + "'的文档信息成功！");
		return false;
	}
}
