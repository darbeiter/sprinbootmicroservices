package com.dustin.arbeiter.orderservice.repository;

import com.dustin.arbeiter.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
