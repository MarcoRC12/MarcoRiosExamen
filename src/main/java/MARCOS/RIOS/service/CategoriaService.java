/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MARCOS.RIOS.service;

import MARCOS.RIOS.entity.Categoria;
import java.util.List;

/**
 *
 * @author marco
 */
public interface CategoriaService {
    
    public List<Categoria> findAll();

    public Categoria findById(Long id);

    public Categoria save(Categoria categoria);

    public void delete(Categoria categoria);

    public void deleteById(Long id);
    
    
    
}
