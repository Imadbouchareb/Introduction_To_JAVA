package vecteur2D;

public class Programme {
	public static void main(String[] args) {
		Vecteur2D vecteur2D1 = new Vecteur2D(1.5, 2);
        Vecteur2D vecteur2D2 = new Vecteur2D(3, 4);
        Vecteur3D vecteur3D1 = new Vecteur3D(1.5, 2, 3);
        Vecteur3D vecteur3D2 = new Vecteur3D(3, 4, 5);

        System.out.println("Informations des vecteurs 2D :");
        System.out.println(vecteur2D1.toString());
        System.out.println(vecteur2D2.toString());

        System.out.println("\nInformations des vecteurs 3D :");
        System.out.println(vecteur3D1.toString());
        System.out.println(vecteur3D2.toString());

        System.out.println("\nTest de la méthode equals :");
        System.out.println("Vecteur 2D1 égal à Vecteur 2D2 : " + vecteur2D1.equals()); //False
        System.out.println("Vecteur 3D1 égal à Vecteur 3D2 : " + vecteur3D1.equals()); //False

        System.out.println("\nTest de la méthode norme :");
        System.out.println("norme de Vecteur 2D1 : " + vecteur2D1.norme());
        System.out.println("norme de Vecteur 3D1 : " + vecteur3D1.norme());

        System.out.println("\nNombre d'objets créés : " + Vecteur2D.getNombreVecteurs());
        
        vecteur3D2.setVec3D(1, 1, 1);
        System.out.println("Vecteur 3D1 égal à Vecteur 3D2 : " + vecteur3D2.equals()); //True
    }


}
