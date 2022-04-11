/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tecnicas;

import javax.swing.JOptionPane;

/**
 *
 * @author roncr
 */
public class Alumno extends Personas {
    private int proyecto;
    private int examen;
    private int contidiano;
    private String nivel;
    
    public Alumno (){
    
    }

    public Alumno(int proyecto, int examen, int contidiano, String nivel, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.proyecto = proyecto;
        this.examen = examen;
        this.contidiano = contidiano;
        this.nivel = nivel;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }

    public int getContidiano() {
        return contidiano;
    }

    public void setContidiano(int contidiano) {
        this.contidiano = contidiano;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public void imprimirDatos(){
    
        JOptionPane.showMessageDialog(null, "El nombre del alumno es :"+getNombre()
        +"\n La edad es : "+getEdad()
        +"\n el genero es : "+getGenero()
        +"\n la nota del proyecto es : "+ proyecto
        +"\n La nota del examen es de : "+examen
        +"\n La nota del cotidiano es de : "+contidiano
        +"\n el nivel es : "+nivel);
        
    }

    public static void main(String[] args) {
        Alumno notas = new Alumno();
        double suma=0,promedio,promediototal=0;
        int limiete, i;
        limiete= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de alumnos que desea ingresar"));
        for(i=1;i<=limiete;i++){
        notas.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del alunmo"));
        notas.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
        notas.setGenero(JOptionPane.showInputDialog("Ingrese el genero").charAt(0));
        notas.setProyecto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del proyecto")));
        notas.setExamen(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del examen")));
        notas.setContidiano(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cotidiano")));
        notas.setNivel(JOptionPane.showInputDialog("Ingrese el grado del alunmo"));
        promedio=(notas.getProyecto()+notas.getExamen()+notas.getContidiano())/3;
       
        notas.imprimirDatos();
        JOptionPane.showMessageDialog(null,"El promedio del almuno es de ;"+promedio);
        suma+=promedio;
        
    }
        promediototal=suma/limiete;
        JOptionPane.showMessageDialog(null,"el promedio grupal ;"+promediototal);
    }
    }

 