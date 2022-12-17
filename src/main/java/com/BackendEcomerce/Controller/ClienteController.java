/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BackendEcomerce.Controller;

import com.BackendEcomerce.model.Cliente;
import com.BackendEcomerce.service.ClienteService;
import com.BackendEcomerce.service.ProductoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mota1
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/")
@RequiredArgsConstructor
public class ClienteController {
        @Autowired
    public ClienteService clienteService;

 /*   @GetMapping("/cliente")
    public List<Cliente> getAll() {
        List<Cliente> cliente = this.clienteService.getAll();
        return cliente;
    }

    @GetMapping("/cliente/{id}")
    public Cliente getById(@PathVariable int id) {
        return clienteService.getById(id);
    }*/
        
                //Guardar
	@PostMapping("/cliente")
	public Cliente guardar (@RequestBody Cliente cliente){
		
		return clienteService.save(cliente);                       	
	}
	
	//listar
	@GetMapping("/cliente")
	public List<Cliente> listar(){
		return clienteService.findAll();
	}
	
	/*@DeleteMapping ("/producto/{id}")
	public void eliminar(@PathVariable Integer id){
		productoService.delete(id);
	}*/
	
        //get una cuenta
	@GetMapping ("/cliente/{id}")
	public Cliente getUnaAhorros(@PathVariable Integer id){
		return clienteService.findById(id);
	}
	
       /* @PutMapping ("/producto/{id}")
	public Producto modificar (@RequestBody Producto producto, @PathVariable Integer id){
		
                Producto productoActual = productoService.findById(id);
                productoActual.setCantidad(producto.getCantidad());
                productoActual.setDescripcion(producto.getDescripcion());
                productoActual.setDescuento(producto.getDescuento());
                productoActual.setPrecio(producto.getPrecio());
                productoActual.setNombre(producto.getNombre());
                productoActual.setPrecio_fabrica(producto.getPrecio_fabrica());
                productoActual.setFecha_registro(producto.getFecha_registro());
   
                return productoService.save(productoActual);
	}*/
}
