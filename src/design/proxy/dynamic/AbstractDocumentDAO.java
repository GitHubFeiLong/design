package design.proxy.dynamic;

/**
 * @ClassName AbstractDocumentDAO
 * @Description TODO 抽象文档 DAO 类，抽象主题角色
 * @Author msi
 * @Date 2019/6/15 11:13
 */
public interface AbstractDocumentDAO {
	Boolean deleteDocumentById(String documentId);
}
