/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MARCOS.RIOS.repository;

import MARCOS.RIOS.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marco
 */
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{
}
