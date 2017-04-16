package dao;

import java.util.List;

import model.Product;


public interface ProductDao {
	
	public List<Product> findAllProducts();//查询所有产品信息

	public void delProductById(Integer toid);//通过toid，即主键，删除产品

	public void insertProduct(Product product);

}
