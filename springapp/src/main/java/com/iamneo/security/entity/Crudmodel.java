package com.iamneo.security.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="customers")
public class Crudmodel 
{
      @Id
      @GeneratedValue
      @Column(name="Vehicle_Id")
      private int vehicle_id;
      @Column(name="Name")
      private String name;
      @Column(name="Email")
      private String email;
      @Column(name="Vehicle_no")
      private String vehicle_no;
      @Column(name="Mobile")
      private long mobile;
      @Column(name="Password")
      private String password;
          
}