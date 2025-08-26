package org.smartphones.tarea1.repository;

import org.smartphones.tarea1.model.SmartPhone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SmartphoneRepository extends JpaRepository<SmartPhone, Integer> {
    List<SmartPhone> findByPrecioLessThan(Double precio);
    List<SmartPhone> findByPrecioBetween(Double precioAfter, Double precioBefore);
    List<SmartPhone> findDistinctByModelo(String modelo);

}
