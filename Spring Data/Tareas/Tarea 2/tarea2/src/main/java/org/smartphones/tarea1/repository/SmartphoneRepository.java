package org.smartphones.tarea1.repository;

import org.smartphones.tarea1.model.SmartPhone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SmartphoneRepository extends JpaRepository<SmartPhone, Integer> {
    List<SmartPhone> findByPrecioLessThan(Double precio);
    List<SmartPhone> findByPrecioBetween(Double precioAfter, Double precioBefore);
    List<SmartPhone> findDistinctByModelo(String modelo);

    @Query(value = "SELECT * FROM smartphone", nativeQuery = true)
    List<SmartPhone> findEveryPhone();

    @Query(value = "SELECT  modelo FROM smartphone", nativeQuery = true)
    List<String> findEveryModelo();

    @Query(value = "SELECT * FROM smartphone WHERE smartphone.precio = :precio" , nativeQuery = true)
    SmartPhone findByPrecio(@Param("precio") Double precio);
}
