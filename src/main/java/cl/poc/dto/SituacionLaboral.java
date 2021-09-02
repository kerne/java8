package cl.poc.dto;


public class SituacionLaboral extends Portador {

    public enum TipoLaborales {
        JUB,
        CES,
        EST,
        DCAS,
        DEP,
        IND;
    }


    /**
     * Constructor para Dependiente
     *
     * @param rutEmpleador
     * @param digitoVerificadorEmpleador
     * @param tipoContrato
     * @param antiguedadLaboral
     * @param actividadEconomica
     * @param rentaLiquida
     * @param rentaFija
     * @param rentaVariable
     */
    public SituacionLaboral(long rutEmpleador, String digitoVerificadorEmpleador, String tipoContrato,
                            int antiguedadLaboral, String actividadEconomica, double rentaLiquida, double rentaFija
            , double rentaVariable) {

        super(rutEmpleador, digitoVerificadorEmpleador, tipoContrato, antiguedadLaboral, actividadEconomica, rentaLiquida, rentaFija, rentaVariable);

    }

    /**
     * Constructor para Dependiente
     *
     * @param antiguedadLaboral
     * @param actividadEconomica
     * @param rentaLiquida
     * @param rentaFija
     * @param rentaVariable
     */
    public SituacionLaboral(int antiguedadLaboral, String actividadEconomica, double rentaLiquida, double rentaFija
            , double rentaVariable) {
        super();
        setAntiguedadLaboral(antiguedadLaboral);
        setActividadEconomica(actividadEconomica);
        setRentaLiquida(rentaLiquida);
        setRentaFija(rentaFija);
        setRentaVariable(rentaVariable);
    }

    /**
     * @param antiguedadLaboral
     * @param rentaLiquida
     * @param rentaFija
     * @param rentaVariable
     */
    public SituacionLaboral(int antiguedadLaboral, double rentaLiquida, double rentaFija, double rentaVariable) {
        super();
        setAntiguedadLaboral(antiguedadLaboral);
        setRentaLiquida(rentaLiquida);
        setRentaFija(rentaFija);
        setRentaVariable(rentaVariable);
    }

    public static SituacionLaboral getTipoSituacion(TipoLaborales type, long rutEmpleador, String digitoVerificadorEmpleador, String tipoContrato,
                                                    int antiguedadLaboral, String actividadEconomica, double rentaLiquida,
                                                    double rentaFija, double rentaVariable) {

        switch (type) {
            case JUB:
            case CES:
            case EST:
            case DCAS:
                return new SituacionLaboral(antiguedadLaboral, rentaLiquida, rentaFija, rentaVariable);
            case DEP:
                return new SituacionLaboral(rutEmpleador, digitoVerificadorEmpleador, tipoContrato,
                        antiguedadLaboral, actividadEconomica, rentaLiquida, rentaFija
                        , rentaVariable);
            case IND:
                return new SituacionLaboral(antiguedadLaboral, actividadEconomica, rentaLiquida, rentaFija
                        , rentaVariable);
            default:
                throw new IllegalArgumentException("Tipo de Situacion laboral no existe");

        }
    }


}