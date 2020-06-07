package com.neyana.accounting.entity.operations;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeOperationsRepository extends JpaRepository<TypeOperations, Long> {
    List<TypeOperations> findByName(String name);
}
