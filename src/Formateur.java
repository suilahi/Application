import java.util.Scanner;
public class Formateur extends Personne {
    private double salaire;
    private String specialite;
    private String Class;
    private Scanner scanner=new Scanner(System.in);
    public Formateur(int id,String nom,String prenom,String email) {
        super(id, nom, prenom, email);
        this.salaire = salaire;
        this.Class = Class;
        this.specialite = specialite;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public void setClass(String Class) {
        Class = Class;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ajouterunformateur(){
        System.out.println("nom de formateur:");
        String nom=scanner.nextLine();
        scanner.nextLine();
        System.out.println("spécialté de formateur:");
        String specialite=scanner.nextLine();
        scanner.nextLine();
        System.out.println("salaire mensuel de formatuer:");
        double salaire= scanner.nextDouble();
        scanner.nextLine();
        this.setNom(nom);
        this.setSpecialite(specialite);
        this.setSalaire(salaire);
        System.out.println("formateur ajouter avec succés");
    }
    public void afficherInfos() {
        System.out.println("Id:"+getId());
        System.out.println("Nom:"+getNom());
        System.out.println("Prenom"+getPrenom());
        System.out.println("Email"+getEmail());
        System.out.println("Salaire"+getSalaire());
        System.out.println("Spécialité"+getSpecialite());
    }
    public  void gestiondesformateurs() {
        System.out.println("1. Ajout d’un formateur");
        System.out.println("2. Association d’un formateur à une classe");
        System.out.println("3. Modification des informations d’un formateur");
        System.out.println("4. Suppression d’un formateur");
        System.out.println("5. Affichage des formateurs");
    }
}



