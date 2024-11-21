package atelier06;
/** Création et gestion de félins */
public class Felin extends Animal {
    // ajout d'attributs propres à la sous-classe
    protected boolean domestique = false;
    /** 
     * Le constructeur de Félins fait appel au constructeur de la sur-classe Animal 
     * @param type Nom de l'espèce
     */
    public Felin(String type) {
        super(type, 4); // Les félins ont 4 pattes par défaut
    }

    /** 
     * Présentation des caractéristiques du félin 
     */
    public void présente() {
        // appel de la méthode de la sur-classe
        super.présente();
        String etat = (domestique) ? "domestique" : "sauvage";
        System.out.println("je suis vraiment un animal " + etat);
    }

    /** 
     * Cri du félin 
     */
    public void crie() {
        System.out.println("Le félin rugit ou miaule !");
    }
}
