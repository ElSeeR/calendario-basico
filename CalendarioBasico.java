
public class CalendarioBasico{
    private int dia;
    private int mes;
    private int ano;

    public CalendarioBasico(){
        dia = 1;
        mes = 1;
        ano = 1;
    }
    
    public String obtenerFecha(){
        String guardarFecha;
        guardarFecha = "";
        if(dia < 10){
            guardarFecha = guardarFecha + "0" + dia + "-";
        }
        else{
            guardarFecha = guardarFecha + dia + "-";
        }
        
        if(mes < 10){
            guardarFecha = guardarFecha + "0" + mes + "-";
        }
        else{
            guardarFecha = guardarFecha + mes + "-";
        }
        
        if(ano < 10){
            guardarFecha = guardarFecha + "0" + ano;
        }
        else{
            guardarFecha = guardarFecha + ano;
        }
        return guardarFecha;
    }
    
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
    
    public void avanzarFecha(){
    dia = dia + 1;
    if(dia > 30){
        mes = mes + 1;
        dia = 1;
        if(mes > 12){
            mes = 1;
            ano = ano + 1;
            if(ano > 99){
                ano = 1;
            }
        }
    }
    }
}