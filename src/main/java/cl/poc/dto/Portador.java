package cl.poc.dto;

import java.time.LocalDateTime;

public class Portador {
    /**
     * Identificador Interno.
     */
    private String id;

    private long rut;

    private String digitoVerificador;

    private String nombres;

    private String apellidos;

    private String sexo;

    private LocalDateTime fechaNacimiento;

    private String direccion;

    private String comuna;

    private String telefono;

    private String email;

    private String estadoCivil;


    private String nacionalidad;

    private String residenciaDefinitiva;

    private String nivelEducacional;

    private String profesion;

    private String situacionLaboral;

    private long rutEmpleador;

    private String digitoVerificadorEmpleador;

    private String tipoContrato;

    private int antiguedadLaboral;

    private String actividadEconomica;

    private double rentaLiquida;

    private double rentaFija;

    private double rentaVariable;



    public Portador() {
    }


    public Portador(long rutEmpleador, String digitoVerificadorEmpleador, String tipoContrato, int antiguedadLaboral, String actividadEconomica, double rentaLiquida, double rentaFija, double rentaVariable) {
        this.rutEmpleador = rutEmpleador;
        this.digitoVerificadorEmpleador = digitoVerificadorEmpleador;
        this.tipoContrato = tipoContrato;
        this.antiguedadLaboral = antiguedadLaboral;
        this.actividadEconomica = actividadEconomica;
        this.rentaLiquida = rentaLiquida;
        this.rentaFija = rentaFija;
        this.rentaVariable = rentaVariable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getRut() {
        return rut;
    }

    public void setRut(long rut) {
        this.rut = rut;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getResidenciaDefinitiva() {
        return residenciaDefinitiva;
    }

    public void setResidenciaDefinitiva(String residenciaDefinitiva) {
        this.residenciaDefinitiva = residenciaDefinitiva;
    }

    public String getNivelEducacional() {
        return nivelEducacional;
    }

    public void setNivelEducacional(String nivelEducacional) {
        this.nivelEducacional = nivelEducacional;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setSituacionLaboral(String situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public long getRutEmpleador() {
        return rutEmpleador;
    }

    public void setRutEmpleador(long rutEmpleador) {
        this.rutEmpleador = rutEmpleador;
    }

    public String getDigitoVerificadorEmpleador() {
        return digitoVerificadorEmpleador;
    }

    public void setDigitoVerificadorEmpleador(String digitoVerificadorEmpleador) {
        this.digitoVerificadorEmpleador = digitoVerificadorEmpleador;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getAntiguedadLaboral() {
        return antiguedadLaboral;
    }

    public void setAntiguedadLaboral(int antiguedadLaboral) {
        this.antiguedadLaboral = antiguedadLaboral;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public double getRentaLiquida() {
        return rentaLiquida;
    }

    public void setRentaLiquida(double rentaLiquida) {
        this.rentaLiquida = rentaLiquida;
    }

    public double getRentaFija() {
        return rentaFija;
    }

    public void setRentaFija(double rentaFija) {
        this.rentaFija = rentaFija;
    }

    public double getRentaVariable() {
        return rentaVariable;
    }

    public void setRentaVariable(double rentaVariable) {
        this.rentaVariable = rentaVariable;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portador{");
        sb.append("id='").append(id).append('\'');
        sb.append(", rut=").append(rut);
        sb.append(", digitoVerificador='").append(digitoVerificador).append('\'');
        sb.append(", nombres='").append(nombres).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", comuna='").append(comuna).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", estadoCivil='").append(estadoCivil).append('\'');
        sb.append(", nacionalidad='").append(nacionalidad).append('\'');
        sb.append(", residenciaDefinitiva='").append(residenciaDefinitiva).append('\'');
        sb.append(", nivelEducacional='").append(nivelEducacional).append('\'');
        sb.append(", profesion='").append(profesion).append('\'');
        sb.append(", situacionLaboral='").append(situacionLaboral).append('\'');
        sb.append(", rutEmpleador=").append(rutEmpleador);
        sb.append(", digitoVerificadorEmpleador='").append(digitoVerificadorEmpleador).append('\'');
        sb.append(", tipoContrato='").append(tipoContrato).append('\'');
        sb.append(", antiguedadLaboral=").append(antiguedadLaboral);
        sb.append(", actividadEconomica='").append(actividadEconomica).append('\'');
        sb.append(", rentaLiquida=").append(rentaLiquida);
        sb.append(", rentaFija=").append(rentaFija);
        sb.append(", rentaVariable=").append(rentaVariable);
        sb.append('}');
        return sb.toString();
    }
}
