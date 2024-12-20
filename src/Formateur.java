import java.util.ArrayList;
import java.util.Scanner;
public class Formateur extends Personne {
    private double salaire;
    private String specialite;
    private Scanner scanner=new Scanner(System.in);
    public ArrayList<Formateur> formateurs = new ArrayList<Formateur>();

    public Formateur(int id,String nom,String prenom,String email,String specialite,double salaire) {
        super(id, nom, prenom, email);
        this.salaire = salaire;
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
    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public Formateur(){}
    public void ajouterunformateur(){
        System.out.println("id:");
        int id= scanner.nextInt();
        scanner.nextLine();
        System.out.println("nom de formateur:");
        String nom=scanner.nextLine();
        scanner.nextLine();
        System.out.println("prenom de formateur:");
        String prenom=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Email de formateur:");
        String Email=scanner.nextLine();
        scanner.nextLine();
        System.out.println("spécialté de formateur:");
        String specialite=scanner.nextLine();
        scanner.nextLine();
        System.out.println("salaire mensuel de formatuer:");
        double salaire= scanner.nextDouble();
        scanner.nextLine();
        System.out.println("formateur ajouter avec succés");
        Formateur formateur=new Formateur(id,nom,prenom,Email,specialite,salaire);
    }
    public void afficherformateurs() {
        System.out.println("Id:"+getId());
        System.out.println("Nom:"+getNom());
        System.out.println("Prenom"+getPrenom());
        System.out.println("Email"+getEmail());
        System.out.println("Salaire"+getSalaire());
        System.out.println("Spécialité"+getSpecialite());
    }
    public void modifierformateur(){
        System.out.println("entrer id a modifier:");
        int id=scanner.nextInt();
        scanner.nextLine();
            for (Formateur formateur:formateurs){
                if(formateur.getId()==id){
                    System.out.println("formateur trouver!!");
                    formateur.afficherformateurs();
                    System.out.println("nouveau nom:");
                    String nouveauNom=scanner.nextLine();
                    System.out.println("nouveau prenom:");
                    String nouveauPrenom = scanner.nextLine();
                    System.out.println("nouveau Email:");
                    String nouveauEmail = scanner.nextLine();

                    formateur.setNom(nouveauNom);
                    formateur.setPrenom(nouveauPrenom);
                    formateur.setEmail(nouveauEmail);


                    System.out.println("formateur modifié!");
                }
            }
        System.out.println("formateur introuvable!");
    }

    public void supprimerformateur(){

    }
    public  void gestiondesformateurs() {
        int ch ;
        System.out.println("1. Ajout d’un formateur");
        System.out.println("2. Affichage des formateurs");
        System.out.println("3. Modification des informations d’un formateur");
        System.out.println("4. Suppression d’un formateur");
        System.out.println("choisi votre choix:");
        ch=scanner.nextInt();
        switch (ch){
            case 1:
                ajouterunformateur();
                break;
            case 2:
                afficherformateurs();
                break;
            case 3:
                modifierformateur();
                break;
            case 4:
                supprimerformateur();
                break;
        }
    }
}



