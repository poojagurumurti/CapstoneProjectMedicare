package com.medicare1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare1.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	
	List<Cart> findAllByUserId(Long id);

}
