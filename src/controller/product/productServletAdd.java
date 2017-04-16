package controller.product;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import service.ProductService;
import service.impl.ProductServiceImpl;

/**
 * Servlet implementation class productServletAdd
 */
@WebServlet("/productServletAdd")
public class productServletAdd extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	private ProductService productService = new ProductServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productServletAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("views/product/productAdd.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productName = request.getParameter("productName");
		String price = request.getParameter("price");
		Product product = new Product();
		product.setProductName(productName);
		product.setPrice(Float.parseFloat(price));
		productService.saveProduct(product);//新增
		response.sendRedirect("productServlet");//新增成功后跳转到员工列表页
	}

}
