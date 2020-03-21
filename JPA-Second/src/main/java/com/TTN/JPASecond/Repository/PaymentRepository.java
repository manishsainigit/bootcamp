package com.TTN.JPASecond.Repository;

import com.TTN.JPASecond.Entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
