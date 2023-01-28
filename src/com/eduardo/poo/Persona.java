package com.eduardo.poo;
//peso/altura*altura
public class Persona {
    String nombre, diagnostico;
    float peso;
    float altura;
    float imc;
    //metodo vacio
    public Persona(){}

    public Persona(String nombre, float peso, float altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void calcularImc(){
        this.imc = peso/(altura*altura);
    }
    public float getImc(){
        return this.imc;
    }

    public void diagnosticar(){
        if(imc < 18.5){
            diagnostico = "bajo peso";
        } else if (imc >= 18.5 && imc <= 24.9 ){
            diagnostico = "peso adecuado";
        } else if (imc >= 25.0 && imc <= 29.9){
            diagnostico = "Sobrepeso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            diagnostico = "Obesidad grado 1";
        }else {
            diagnostico = "se recomienda ver a su doctor";
        }
    }
    @Override
    public String toString() {
        calcularImc();
        diagnosticar();
        String salida;
        salida = "Hola " + nombre + " su peso es " + peso + " su altura es" + altura + " su imc es " + imc +
                " su diagnosticos es " + diagnostico;
        return salida;
    }
}
