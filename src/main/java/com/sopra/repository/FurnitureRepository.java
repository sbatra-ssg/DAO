package com.sopra.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.sopra.DAOAssignment.App;
import com.sopra.DAOAssignment.FurnitureInventory;



@Repository
public class FurnitureRepository implements IFurnitureRepository<FurnitureInventory> {
	
	

	@Override
	public void create(FurnitureInventory t) {
		
		int id = t.getId();
		String brandName = t.getBrandName();
		String productName = t.getProductName();
		double productPrice = t.getProductPrice();
		int productQuantity = t.getProductQuantity();
		
		t.setId(id);
		t.setBrandName(brandName);
		t.setProductName(productName);
		t.setProductPrice(productPrice);
		t.setProductQuantity(productQuantity);
		
		
	}

	@Override
	public FurnitureInventory read(int id) {
		
		FurnitureInventory f = App.s.get(FurnitureInventory.class, id);
		
		return f;
		
	}

	@Override
	public List<FurnitureInventory> readAll() {
		
		Query<FurnitureInventory> q = App.s.createQuery("FROM FurnitureInventory");
		
		List<FurnitureInventory> lst = q.list();
		
		return lst;
		
	}

	@Override
	public String delete(int id) {
		
		Query<FurnitureInventory> q = App.s.createQuery("Delete from FurnitureInventory where id =: x");
		
		q.setParameter("x", id);
		
		int rows = q.executeUpdate();
		
		if (rows > 0) {
			return "Successfully deleted";
		}
		return "Something went wrong";
	}

}
