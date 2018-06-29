package com.fakhrullina.shopdatabase.interfaces;

import com.fakhrullina.shopdatabase.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
