package model;

public class Orders {
		private Integer toid;  			//主键，自动增长
		private String custname;		//客户姓名
		private String custaddress;		//客户地址
		private String custphone;		//客户电话
		private String custemail;		//客户邮箱
		private String odertime;		//订购时间
		private Integer productid;  	//订购的产品，来自产品表
		private Integer productcount;  	//订购数目
		private Float   money;			//所付金额
		private String createtime;		//订单新增时间
		private Integer userid;  		//所属销售员工，来自员工表
		public Integer getToid() {
			return toid;
		}
		public void setToid(Integer toid) {
			this.toid = toid;
		}
		public String getCustname() {
			return custname;
		}
		public void setCustname(String custname) {
			this.custname = custname;
		}
		public String getCustaddress() {
			return custaddress;
		}
		public void setCustaddress(String custaddress) {
			this.custaddress = custaddress;
		}
		public String getCustphone() {
			return custphone;
		}
		public void setCustphone(String custphone) {
			this.custphone = custphone;
		}
		public String getCustemail() {
			return custemail;
		}
		public void setCustemail(String custemail) {
			this.custemail = custemail;
		}
		public String getOdertime() {
			return odertime;
		}
		public void setOdertime(String odertime) {
			this.odertime = odertime;
		}
		public Integer getProductid() {
			return productid;
		}
		public void setProductid(Integer productid) {
			this.productid = productid;
		}
		public Integer getProductcount() {
			return productcount;
		}
		public void setProductcount(Integer productcount) {
			this.productcount = productcount;
		}
		public Float getMoney() {
			return money;
		}
		public void setMoney(Float money) {
			this.money = money;
		}
		public String getCreatetime() {
			return createtime;
		}
		public void setCreatetime(String createtime) {
			this.createtime = createtime;
		}
		public Integer getUserid() {
			return userid;
		}
		public void setUserid(Integer userid) {
			this.userid = userid;
		}
	
}
