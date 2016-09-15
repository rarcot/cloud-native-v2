package com.sapient.category;

import com.sapient.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rarcot on 8/9/2016.
 */
@Repository
public class CategoryDAOImpl implements CategoryDAO{

    @Autowired
    private MongoTemplate mongoTemplate;


    public List<Category> getAllCategories() {
       // List<Category> categories = mongoTemplate.findAll(Category.class,"category");
        Category cat1 = new Category();
        cat1.setCategoryName("Inks & Toners");
        cat1.setCategoryDescription("Inks & Toners");
        cat1.setCategoryDescription("Inks and toners for printers");

        Category cat2 = new Category();
        cat2.setCategoryName("Office Supplies");
        cat2.setCategoryDescription("Office Supplies");
        cat2.setCategoryDescription("Notepads, pens, paper and other supplies");

        List<Category> categories = new ArrayList<Category>();
        categories.add(cat1);
        categories.add(cat2);
        return categories;
    }
}
