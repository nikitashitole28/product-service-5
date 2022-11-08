package demo.testexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import demo.testexample.model.ProductModel;

@Repository
public interface ProductRepo extends CrudRepository<ProductModel, Integer> {

	@Query(value = "select * from product_model t where t.pname=?1", nativeQuery = true)
	ProductModel getProductbyName(String pname);

	@Query(value = "select * from product_model t where t.price<=?1", nativeQuery = true)
	List<ProductModel> getproductbypricelessthan1000(Integer price);
	
	@Query(value = "select * from product_model t where t.price<=?1", nativeQuery = true)
    List<ProductModel> getproductbypricegreaterthan1200(Integer price);

}
