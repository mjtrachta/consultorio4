package com.consultorioturnos.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "profesionales")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Profesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "id_profesional")
    private Integer idProfesional;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "rol", nullable = false,insertable=false, updatable=false)
    private Integer rol;

    @Column(name = "nro_documento", length = 50, nullable = false)
    private String nroDocumento;

    @Column(name = "tipo_documento", nullable = false,insertable=false, updatable=false)
    private Integer tipoDocumento;

    @Column(name = "numero_telefono", length = 50, nullable = false)
    private String numeroTelefono;

    @Column(name = "especialidad", nullable = false,insertable=false, updatable=false)
    private Integer especialidad;

    @Column(name = "matricula", length = 50, nullable = false)
    private String matricula;


    @Column(name = "estado", nullable = false,insertable=false, updatable=false)
    private Integer estado;

    @Column(name = "fecha_alta", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;

/////////////////////////////////////RELACIONES/////////////////////////////////////////////////////////////////////////

    @ManyToOne
    @JoinColumn(name = "rol", referencedColumnName = "id_rol")
    private Rol rol3;

    @ManyToOne
    @JoinColumn(name = "tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento tipoDocumento3;

    @ManyToOne
    @JoinColumn(name = "especialidad", referencedColumnName = "id_especialidad")
    private Especialidad especialidad2;

    @ManyToOne
    @JoinColumn(name = "estado", referencedColumnName = "id_estado_usuarios")
    private EstadoUsuario estado3;

    @OneToMany(mappedBy = "idProfesionalTurno2", cascade = CascadeType.ALL)
    private List<Turno> turnos;

//////////////////////////////////////GETTER&SETTER/////////////////////////////////////////////////////////////////////

    public Integer getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(Integer idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Integer getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Integer especialidad) {
        this.especialidad = especialidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
