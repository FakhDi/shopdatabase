package com.fakhrullina.shopdatabase.interfaces;

import com.fakhrullina.shopdatabase.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
