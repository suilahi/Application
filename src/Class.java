import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    private String nom;
    private ArrayList<Apprenant> apprenants;
    private   Formateur formateur;
    private Scanner scanner = new Scanner(System.in);
    public Class(String nom, Formateur formateur) {
        this.nom = nom;
        this.formateur = formateur;
        this.apprenants = new ArrayList<>();
    }
    public Class(){}

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(ArrayList<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }
        Apprenant e =new Apprenant();

    public void creerclasses() {
        System.out.println("nom de classe");
        String nom = scanner.nextLine();
        System.out.println("nom formateur:");
        String format=scanner.nextLine();
        apprenants.add(e);
    }
    public void afficherclasse() {
            System.out.println("Nom:" + getNom());

    }


    public void gestiondesclasses() {
        System.out.println("  menu classe ");
        System.out.println("1. Création d'une classe: ");
        System.out.println("2. Affichage des détails d'une classe:");
        System.out.println("3. Modification des informations d'une classe: ");
        System.out.println("4. Suppression d'une classe: ");
    }
}


