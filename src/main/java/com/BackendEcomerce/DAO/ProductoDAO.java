/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BackendEcomerce.DAO;

import com.BackendEcomerce.model.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mota1
 */
public interface ProductoDAO  extends CrudRepository<Producto, Integer>{
    
}
