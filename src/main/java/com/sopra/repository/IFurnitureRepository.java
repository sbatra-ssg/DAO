package com.sopra.repository;

import java.util.List;

public interface IFurnitureRepository<T> {
	
	public void create(T t);
	
	public T read(int id);
	
	public List<T> readAll();
	
	public String delete(int id);

}
