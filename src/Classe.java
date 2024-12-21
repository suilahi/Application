import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
    private String nom;
    private ArrayList<Apprenant> apprenants;
    private ArrayList<Formateur> formateurs;

    private Formateur formateur;
    private Scanner scanner = new Scanner(System.in);

    public Classe() {
        this.apprenants = new ArrayList<>();
        this.formateurs = new ArrayList<>(); // Initialisation correcte
    }
    public Classe(String nom, Formateur formateur) {
        this.nom = nom;
        this.formateur = formateur;
        this.apprenants = new ArrayList<>();
        this.formateurs=new ArrayList<>();
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

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }
    public void creerclasses() {
        System.out.println("nom de classe");
        String nom = scanner.nextLine();

        System.out.println("Nom du formateur :");
        String formateurNom = scanner.nextLine();

        System.out.println("Prénom du formateur :");
        String formateurPrenom = scanner.nextLine();

        System.out.println("Email du formateur :");
        String formateurEmail = scanner.nextLine();

        System.out.println("Spécialité du formateur :");
        String formateurSpecialite = scanner.nextLine();

        System.out.println("Salaire du formateur :");
        double formateurSalaire = scanner.nextDouble();
        scanner.nextLine();

        Formateur formateur = new Formateur(0, formateurNom, formateurPrenom, formateurEmail, formateurSpecialite, formateurSalaire);
        this.nom = nom;
        this.formateur = formateur;

        formateurs.add(formateur);
        System.out.println("Classe créée avec succès !");
    }

    public void modiffierclasse() {
        System.out.println("Modifier les informations de la classe.");
        System.out.println("Nouveau nom de la classe :");
        String newNom = scanner.nextLine();
        this.nom = newNom;
        System.out.println("Nom de la classe mis à jour avec succès.");
    }

    public void afficherclasse() {
        System.out.println("Nom de la classe : " + nom);
        if (formateur != null) {
            System.out.println("Formateur : " + formateur.getNom() + " " + formateur.getPrenom());
        } else {
            System.out.println("Aucun formateur associé.");
        }

    }

    public void supprimerclasse() {
        System.out.println("classe à supremmer");
        String confirmation = scanner.nextLine();
            this.nom = null;
            this.formateur = null;
            apprenants.clear();
            formateurs.clear();
            System.out.println("Classe supprimée avec succès.");
        }


    public void gestiondesclasses() {
        int choix ;
        do {
            System.out.println("  menu classe ");
            System.out.println("1. Création d'une classe: ");
            System.out.println("2. Modification des informations d'une classe: ");
            System.out.println("3. Affichage des détails d'une classe:");
            System.out.println("4. Suppression d'une classe: ");
            System.out.println("choisir votre option:");
            choix= scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                    creerclasses();
                    break;
                case 2:
                    modiffierclasse();
                    break;
                case 3:
                    afficherclasse();
                    break;
                case 4:
                    supprimerclasse();
                    break;
                case 5:
                    System.out.println("au revoir:!!");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");

            }
        }while (choix!=4);
    }
}


