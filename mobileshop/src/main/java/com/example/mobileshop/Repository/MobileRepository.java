package com.example.mobileshop.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.mobileshop.Models.MobileModel;
import java.util.List;

public interface MobileRepository extends CrudRepository<MobileModel,Integer> {
	 @Query("SELECT m.name, m.price FROM MobileModel m")
	    List<Object[]> findNamesAndPrices();
	    
	    @Query("SELECT m FROM MobileModel m WHERE m.price <20000")
	    List<MobileModel> findByMaxPrice();
	    
	    @Query("SELECT m.type, COUNT(m) FROM MobileModel m GROUP BY m.type")
	    List<Object[]> findProductCountByType();
}
