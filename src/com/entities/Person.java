/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author 16ado
 */
@Entity
@Table(name = "person")
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p"),
    @NamedQuery(name = "Person.findByCodigoPersona", query = "SELECT p FROM Person p WHERE p.codigoPersona = :codigoPersona"),
    @NamedQuery(name = "Person.findByNombre", query = "SELECT p FROM Person p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Person.findByApellidos", query = "SELECT p FROM Person p WHERE p.apellidos = :apellidos"),
    @NamedQuery(name = "Person.findBySexo", query = "SELECT p FROM Person p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Person.findByFechaNacimiento", query = "SELECT p FROM Person p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Person.findByCargo", query = "SELECT p FROM Person p WHERE p.cargo = :cargo")})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_persona")
    private Integer codigoPersona;
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
    @Column(name = "cargo")
    private String cargo;

    public Person() {
    }

    public Person(Integer codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public Person(Integer codigoPersona, String apellidos) {
        this.codigoPersona = codigoPersona;
        this.apellidos = apellidos;
    }

    public Integer getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(Integer codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPersona != null ? codigoPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.codigoPersona == null && other.codigoPersona != null) || (this.codigoPersona != null && !this.codigoPersona.equals(other.codigoPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Person[ codigoPersona=" + codigoPersona + " ]";
    }
    
}
