package com.geo.repository;

import com.geo.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Георгий on 29.07.2017.
 */
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}
