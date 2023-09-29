package com.consultorioturnos.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "turnos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_turno")
    private Integer idTurno;

    @Column(name = "id_paciente",insertable=false, updatable=false)
    private Integer idPaciente;

    @Column(name = "id_profesional_turno",insertable=false, updatable=false)
    private Integer idProfesionalTurno;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_fin")
    private Date fechaFin;

    @Column(name = "id_consultorio",insertable=false, updatable=false)
    private Integer idConsultorio;

    @Column(name = "estado_turno",insertable=false, updatable=false)
    private Integer estadoTurno;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
    private Paciente idPaciente2;

    @ManyToOne
    @JoinColumn(name = "id_profesional_turno", referencedColumnName = "id_profesional")
    private Profesional idProfesionalTurno2;

    @ManyToOne
    @JoinColumn(name = "id_consultorio", referencedColumnName = "id_consultorio")
    private Consultorio idConsultorio2;

    @ManyToOne
    @JoinColumn(name = "estado_turno", referencedColumnName = "id_estado_turno")
    private EstadoTurno estadoTurno2;

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdProfesionalTurno() {
        return idProfesionalTurno;
    }

    public void setIdProfesionalTurno(Integer idProfesionalTurno) {
        this.idProfesionalTurno = idProfesionalTurno;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Integer idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public Integer getEstadoTurno() {
        return estadoTurno;
    }

    public void setEstadoTurno(Integer estadoTurno) {
        this.estadoTurno = estadoTurno;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
