package com.sapient.category;

import com.sapient.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by rarcot on 8/10/2016.
 */
@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Product getProductById(String productId) throws Exception {
        //Criteria queryCrit = Criteria.where("products.productId");
        //List<ProductCollection> products = mongoTemplate.find(new Query(queryCrit.is(productId)),ProductCollection.class);
        Product product = new Product();
        product.setProductDescription("Ink B234567 for brand HP");
        product.setProductId("B234567");
        product.setProductShortName("HP Ink Toner");
       /* if(products!=null && !products.isEmpty()){
           return products.get(0).getProducts().get(0);
        }else{
            return null;
        }*/
        return product;
    }
}
