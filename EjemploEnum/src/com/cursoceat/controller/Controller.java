package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.model.DiasSemana;

public class Controller {

	public static void main(String[] args) {
	
		DiasSemana d=null;
		Scanner lector= new Scanner(System.in);
		System.out.println(" Indique el dia de la semana [1] Lunes..[7] Domingo->");
		int opcion=lector.nextInt();
		switch (opcion) {
		case 1-> d=DiasSemana.LUNES;		
		case 2-> d=DiasSemana.MARTES;
		case 3-> d=DiasSemana.MIERCOLES;
		case 4-> d=DiasSemana.JUEVES;
		case 5-> d=DiasSemana.VIERNES;
		case 6-> d=DiasSemana.SABADO;
		case 7-> d=DiasSemana.DOMINGO;		
		default->System.out.println("Entrada no válida ");
		}
		
		//***************MÉTODS QUE SE PUEDEN APLICAR************ENUM/
		System.out.println("Método .name()->" + d.name());
		System.out.println("Método .toString()->" + d.toString());
		System.out.println("Método .ordinal()->" + d.ordinal());
		System.out.println("Método .value()-> + foreach");
		for(DiasSemana dM:DiasSemana.values()) {
			System.out.print(dM + " ");
		}
		
		System.out.println();
		//vamos a declarar otro dia
		System.out.println(" Indique el dia de la semana [1]Lunes..[7]Domingo->");
		opcion=lector.nextInt();
		//si tenemos muchas opciones o nuesro enum es muy extenso...buscar posiciones y/o localizacion
		DiasSemana otroDia=DiasSemana.values()[opcion-1];
		System.out.println("El otro dia es : ->"+ otroDia.name());
		//lunes....Domingo .....comparteTo compara las posiciones
		System.out.println(" Método .compareTo "+ d.compareTo(otroDia));
		if (d.compareTo(otroDia)>0) {
			System.out.println("El " +  d.toString() + " es despùes de " + otroDia.toString());
			//dependiendo lo que compare dara positivo o negativo
		}else {
			System.out.println(" El " + otroDia.toString() + " es después que el " + d.toString());
		}
		if (d.equals(DiasSemana.VIERNES)) {
		System.out.println("Por fin es viernes ...llegó el fin de semana");
		
		}
		if (otroDia.equals(DiasSemana.LUNES)) {
			System.out.println(" Que fastidio ... a trabajar !!!");
			
		}
		
		
		lector.close();
	}

}
