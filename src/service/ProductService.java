package service;

import java.util.List;

import model.Product;

public interface ProductService {
	public List<Product> queryAllProducts();//查询所有产品信息
	public void deleteProductById(Integer toid);//通过toid，即主键，删除产品
	public void saveProduct(Product product);//新增产品
}
