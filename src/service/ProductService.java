package service;

import java.util.List;
import model.Product;
/**
 * 产品Service
 * @author cc
 *
 */
public interface ProductService {
	public List<Product> queryAllProducts();//查询所有产品信息
	public void deleteProductById(Integer toid);//通过toid，即主键，删除产品
	public void saveProduct(Product product);//新增产品
	public void updateProduct(Product product);//修改产品
	public Product queryProductById(Integer toid);//通过toid查找产品
}
