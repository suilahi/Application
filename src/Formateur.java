import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne {
    private double salaire;
    private String specialite;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Formateur> formateurs = new ArrayList<>();

    public Formateur(int id, String nom, String prenom, String email, String specialite, double salaire) {
        super(id, nom, prenom, email);
        this.salaire = salaire;
        this.specialite = specialite;
    }
    public Formateur() {}
    // Getters et Setters
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

    // Méthodes
    public void ajouterunformateur() {
        System.out.println("ID :");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nom du formateur :");
        String nom = scanner.nextLine();
        System.out.println("Prénom du formateur :");
        String prenom = scanner.nextLine();
        System.out.println("Email du formateur :");
        String email = scanner.nextLine();
        System.out.println("Spécialité du formateur :");
        String specialite = scanner.nextLine();
        System.out.println("Salaire mensuel du formateur :");
        double salaire = scanner.nextDouble();
        scanner.nextLine();

        Formateur formateur = new Formateur(id, nom, prenom, email, specialite, salaire);
        formateurs.add(formateur);
        System.out.println("Formateur ajouté avec succès !");
    }

    public void afficherformateurs() {
        if (formateurs.isEmpty()) {
            System.out.println("Aucun formateur trouvé !");
            return;
        }

        for (Formateur formateur : formateurs) {
            System.out.println("ID : " + formateur.getId());
            System.out.println("Nom : " + formateur.getNom());
            System.out.println("Prénom : " + formateur.getPrenom());
            System.out.println("Email : " + formateur.getEmail());
            System.out.println("Salaire : " + formateur.getSalaire());
            System.out.println("Spécialité : " + formateur.getSpecialite());
            System.out.println("----------------------------");
        }
    }

    public void modifierformateur() {
        System.out.println("Entrez l'ID du formateur à modifier :");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Formateur formateur : formateurs) {
            if (formateur.getId() == id) {
                System.out.println("Formateur trouvé !");
                System.out.println("Nom actuel : " + formateur.getNom());
                System.out.println("Nouveau nom :");
                formateur.setNom(scanner.nextLine());
                System.out.println("Prénom actuel : " + formateur.getPrenom());
                System.out.println("Nouveau prénom :");
                formateur.setPrenom(scanner.nextLine());
                System.out.println("Email actuel : " + formateur.getEmail());
                System.out.println("Nouvel email :");
                formateur.setEmail(scanner.nextLine());
                System.out.println("Modification réussie !");
                return;
            }
        }
        System.out.println("Formateur introuvable !");
    }

    public void supprimerformateur() {
        System.out.println("Entrez l'ID du formateur à supprimer :");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Formateur formateur : formateurs) {
            if (formateur.getId() == id) {
                formateurs.remove(formateur);
                System.out.println("Formateur supprimé avec succès !");
                return;
            }
        }
        System.out.println("Formateur introuvable !");
    }

    public void gestiondesformateurs() {
        int choix;
        do {
            System.out.println("1. Ajout d’un formateur");
            System.out.println("2. Affichage des formateurs");
            System.out.println("3. Modification des informations d’un formateur");
            System.out.println("4. Suppression d’un formateur");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
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
                case 5:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choix != 5);
    }
}
