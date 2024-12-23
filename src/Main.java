import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Simuler les données saisies (remplacer par une vraie lecture)
        String nom = "Dupont";
        String prenom = "Jean";
        int age = 20;

        // Ajouter un nouvel étudiant
        Etudiant etudiant = new Etudiant(nom, prenom, age);
        ListeEtudiants.ajouterEtudiant(etudiant);

        // Générer la page HTML de confirmation
        genererPageHTML();
    }

    public static void genererPageHTML() {
        try (FileWriter writer = new FileWriter("../output/confirmation.html")) {
            writer.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
            writer.write("<meta charset=\"UTF-8\">\n");
            writer.write("<title>Confirmation d'ajout</title>\n");
            writer.write("<link rel=\"stylesheet\" href=\"../web/style.css\">\n");
            writer.write("</head>\n<body>\n");
            writer.write("<h1>Ajout réussi !</h1>\n");

            List<Etudiant> liste = ListeEtudiants.getListe();
            writer.write("<h2>Liste des étudiants :</h2>\n<ul>\n");
            for (Etudiant e : liste) {
                writer.write("<li>" + e.toString() + "</li>\n");
            }
            writer.write("</ul>\n");
            writer.write("</body>\n</html>\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
