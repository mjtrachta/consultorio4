package com.consultorioturnos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pacientes")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Integer idPaciente;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "password", nullable = false, columnDefinition = "text")
    private String password;

    @Column(name = "rol", nullable = false,insertable=false, updatable=false)
    private Integer rol;

    @Column(name = "nro_documento", nullable = false, length = 50)
    private String nroDocumento;

    @Column(name = "tipo_documento", nullable = false,insertable=false, updatable=false)
    private Integer tipoDocumento;

    @Column(name = "numero_telefono", nullable = false, length = 50)
    private String numeroTelefono;

    @Column(name = "obra_social",insertable=false, updatable=false)
    private Integer obraSocial;

    @Column(name = "grupo_sanguineo", length = 50)
    private String grupoSanguineo;

    @Column(name = "fecha_alta", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Column(name = "estado", nullable = false,insertable=false, updatable=false)
    private Integer estado;

    @Column(name = "barrio")
    private String barrio;

    @Column(name = "ciudad",insertable=false, updatable=false)
    private Integer ciudad;

    @Column(name = "provincia",insertable=false, updatable=false)
    private Integer provincia;

    @Column(name = "pais",insertable=false, updatable=false)
    private Integer pais;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @ManyToOne
    @JoinColumn(name = "estado", referencedColumnName = "id_estado_usuarios")
    private EstadoUsuario estado2;

    @ManyToOne
    @JoinColumn(name = "rol", referencedColumnName = "id_rol")
    private Rol rol2;

    @ManyToOne
    @JoinColumn(name = "tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento tipoDocumento2;

    @ManyToOne
    @JoinColumn(name = "obra_social", referencedColumnName = "id_obra_social")
    private ObraSocial obraSocial2;

    @ManyToOne
    @JoinColumn(name = "ciudades", referencedColumnName = "id_ciudad")
    private Ciudad ciudad2;

    @ManyToOne
    @JoinColumn(name = "provincias", referencedColumnName = "id_provincia")
    private Provincia provincia2;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id_pais")
    private Pais pais2;

    @OneToMany(mappedBy = "idPaciente2", cascade = CascadeType.ALL)
    private List<Turno> turnos;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public Integer getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(Integer obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Integer getCiudad() {
        return ciudad;
    }

    public void setCiudad(Integer ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getProvincia() {
        return provincia;
    }

    public void setProvincia(Integer provincia) {
        this.provincia = provincia;
    }

    public Integer getPais() {
        return pais;
    }

    public void setPais(Integer pais) {
        this.pais = pais;
    }
}
