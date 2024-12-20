import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;
public class Apprenant extends Personne {
    public long numerotelephone;
    public String Class;
    public ArrayList<Apprenant> apprenants = new ArrayList<Apprenant>();
    public Scanner scanner = new Scanner(System.in);

    public Apprenant(int Id,String nom,String prenom,String Email, long numerotelephone) {
        super(Id,nom,prenom,Email);
        //this.Class = Class;
        this.numerotelephone = numerotelephone;
    }

    public Apprenant() {
    }

    public ArrayList<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(ArrayList<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public long getNumerotelephone() {
        return numerotelephone;
    }
    public void setNumerotelephone(long numerotelephone) {
        this.numerotelephone = numerotelephone;
    }

    public void ajouterapprenant() {
        System.out.println("Id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nom:");
        String nom = scanner.nextLine();
        System.out.println("prenom:");
        String prenom = scanner.nextLine();
        System.out.println("email:");
        String email = scanner.nextLine();
        System.out.println("num tele: ");
        long numPhone=scanner.nextLong();
        Apprenant apprenant = new Apprenant(id ,nom, prenom, email, numPhone);
        apprenants.add(apprenant);

    }

    public void afficherapprenant(){
        for (Apprenant apprenant : apprenants){
            System.out.println("id: "+apprenant.getId()+
            "Nom : " + apprenant.getNom()+
            "Prénom : " + apprenant.getPrenom()+
            "Email : " + apprenant.getEmail()+
            "Numéro de téléphone : " + apprenant.getNumerotelephone());
        }
    }
    public void modifierapprenant() {
        System.out.println("entrer l'id de l'apprenant à suprimer:");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Apprenant apprenant : apprenants) {
            if (apprenant.getId() == id) {
                System.out.println("apprenant trouvé!");
                apprenant.afficherapprenant();
                System.out.println("nouveau nom");
                String nouveauNom = scanner.nextLine();
                System.out.println("nouveau prenom:");
                String nouveauPrenom = scanner.nextLine();
                System.out.println("nouveau Email:");
                String nouveauEmail = scanner.nextLine();
                System.out.println("nouveau num tele:");
                long nouveauTelephone = scanner.nextInt();
                scanner.nextLine();

                apprenant.setNom(nouveauNom);
                apprenant.setPrenom(nouveauPrenom);
                apprenant.setEmail(nouveauEmail);
                apprenant.setNumerotelephone(nouveauTelephone);

                System.out.println("apprenant modifié!");
            }
        }
        System.out.println("apprenant introuvable!");
    }

    public void supprimerapprenant() {
        System.out.println("entrer l'id à supprimer:");
        int id = scanner.nextInt();
        scanner.nextLine();
        Apprenant appsupprimer = null;
        for (Apprenant apprenant : apprenants) {
            if (apprenant.getId() == id) {
                appsupprimer = apprenant;
            }}
        if (appsupprimer!=null){
            apprenants.remove(appsupprimer);
            System.out.println("apprenant supprimer avec succés");}
      else {
           System.out.println("apprenant introuvable!!");
        }
        }

    public  void gestiondesapprenant() {
        int choix;
        System.out.println("  menu apprenant ");
        System.out.println("1. Ajout d’un apprenant");
        System.out.println("2. Affichage des apprenants:");
        System.out.println("3. Modification des informations d’un apprenant");
        System.out.println("4. Suppression d’un apprenant");
        System.out.println("entrez votre choix:");
        choix=scanner.nextInt();
        switch (choix){
            case 1:
                ajouterapprenant();
                break;
            case 2:
                afficherapprenant();
                break;
            case 3:
                modifierapprenant();
                break;
            case 4:
                supprimerapprenant();
                break;
        }
    }

}