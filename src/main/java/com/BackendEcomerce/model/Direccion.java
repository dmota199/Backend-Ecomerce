/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BackendEcomerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author fabricio
 */
@PersistenceContext
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "direccion")
public class Direccion {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id_direccion;


   @Column(name = "ciudad", nullable = false)
   private String ciudad;

   @Column(name = "provincia", nullable = false)
   private String provincia;

   @Column(name = "calle", nullable = false)
   private String calle;



   @ManyToOne()
   private Cliente cliente;

   public Direccion(String direccion, String ciudad, String provincia, String calle, String codigo_postal, Date fecha, Cliente cliente) {
      this.ciudad = ciudad;
      this.provincia = provincia;
      this.calle = calle;
      this.fecha = fecha;
      this.cliente = cliente;
   }
}
