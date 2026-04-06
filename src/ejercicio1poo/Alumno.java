package ejercicio1poo;

public class Alumno {
    private String codigo;
    private String Nombre;
    private String Apellido;
    private int aEstudio;
        private double exaParcial;
    private double exaFinal;
    private double promPracticas;
    public Alumno(){
        Nombre="Jose";
        Apellido="Condor";
        
    }

    public Alumno(String codigo, String Nombre, String Apellido, int aEstudio, double exaParcial, double exaFinal, double promPracticas) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.aEstudio = aEstudio;
        this.exaParcial = exaParcial;
        this.exaFinal = exaFinal;
        this.promPracticas = promPracticas;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getaEstudio() {
        return aEstudio;
    }

    public void setaEstudio(int aEstudio) {
        this.aEstudio = aEstudio;
    }

    public double getExaParcial() {
        return exaParcial;
    }

    public void setExaParcial(double exaParcial) {
        this.exaParcial = exaParcial;
    }

    public double getExaFinal() {
        return exaFinal;
    }

    public void setExaFinal(double exaFinal) {
        this.exaFinal = exaFinal;
    }

    public double getPromPracticas() {
        return promPracticas;
    }

    public void setPromPracticas(double promPracticas) {
        this.promPracticas = promPracticas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", aEstudio=" + aEstudio + ", exaParcial=" + exaParcial + ", exaFinal=" + exaFinal + ", promPracticas=" + promPracticas + '}';
    }
   
    
    }
    
    
    
    
//    public Alumno(String codigo, String Nombre, String Apellido, int aEstudio, double exaParcial, double exaFinal, double promPracticas){
//        this.codigo=codigo;
//        this.Nombre=Nombre;
//        this.Apellido=Apellido;
//        this.aEstudio=aEstudio;
//        this.exaParcial=exaParcial;
//        this.exaFinal=exaFinal;
//        this.promPracticas=promPracticas;
//    }
//    public String getcodigo(){
//        return codigo;
//    }
//    public void setcodigo(String codigo){
//        this.codigo=codigo;
//    }
//    public String getNombre(){
//        return Nombre;
//    }
//    public void setNombre(String Nombre){
//        this.Nombre=Nombre;
//    }
//    public String getApellido(){
//        return Apellido;
//    }
//    public void setApellido(String Apellido){
//        this.Apellido=Apellido;
//    }
//    public int getaEstudio(){
//        return aEstudio;
//    }
//    public void setaEstudio(int aEstudio){
//        this.aEstudio=aEstudio;
//    }
//    public double getexaParcial(){
//        return exaParcial;
//    }
//    public void setexaParcial(double exaParcial){
//        this.exaParcial=exaParcial;
//    }
//    public double getexaFinal(){
//        return exaParcial;
//    }
//    public void setexaFinal(double exaFinal){
//        this.exaFinal=exaFinal;
//    }
//    public double getpromPracticas(){
//        return promPracticas;
//    }
//    public void setpromPracticas(double promPracticas){
//        this.promPracticas=promPracticas;
//    }
//    public double getpromFinal(){
//        return (exaParcial+exaFinal+promPracticas)/3;
//    }
//    public void setpromFinal(double promFinal){
//        promFinal=(exaParcial+exaFinal)/2;
//        this.promFinal=promFinal;

//    @Override
//    public String toString() {
//        return "Alumno{" + "codigo=" + codigo + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", aEstudio=" + aEstudio + ", exaParcial=" + exaParcial + ", exaFinal=" + exaFinal + ", promFinal=" + promFinal + ", promPracticas=" + promPracticas + '}';

    /**
     * @return the codigo
     */
    
    
    

