import java.util.ArrayList;
import java.util.List;

public class ListeEtudiants {
    private static List<Etudiant> liste = new ArrayList<>();

    public static void ajouterEtudiant(Etudiant etudiant) {
        liste.add(etudiant);
    }

    public static List<Etudiant> getListe() {
        return liste;
    }
}
