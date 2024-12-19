import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    private String nom;
    private ArrayList<Apprenant> apprenants;
    Formateur formateur;
    private Scanner scanner=new Scanner(System.in);

    public Class(String nom, Formateur formateur) {
        this.nom = nom;
        this.formateur = formateur;
        this.apprenants= new ArrayList<>();
    }

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

    @Override
    public String toString() {
        return "Class{" +
                "nom='" + nom + '\'' +
                ", apprenants=" + apprenants +
                ", formateur=" + formateur +
                ", scanner=" + scanner +
                '}';
    }

    public void creerclasses() {
        System.out.println("nom de classe");
        String nom=scanner.nextLine();
        scanner.nextLine();
        }
    public  void gestiondesclasses(){
        System.out.println("  menu classe ");
        System.out.println("1. Création d'une classe: ");
        System.out.println("2. Modification des informations d'une classe: ");
        System.out.println("3. Suppression d'une classe: ");
        System.out.println("4. Affichage des détails d'une classe:");
    }
}
