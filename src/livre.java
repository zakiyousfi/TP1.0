public class livre {


    private int id;
    private String titre;
    private String nomauteur;
    private String prenomauteur;
    private double prix;

    public livre(int id ,String titre, String nomauteur, String prenomauteur, double prix) {
        this.id = id++;
        this.titre = titre;

        this.nomauteur = nomauteur;
        this.prenomauteur = prenomauteur;
        this.prix = prix;
    }
    public int getid() {

        return id;
    }
    public void setid(int id){
        this.id=id;
    }
    public String gettitre() {
        return titre;
    }
    public void settitre(String titre){
        this.titre=titre;
    }

    public String getnomauteur() {
        return nomauteur;
    }
    public void setnomauteur(String nomauteur){
        this.nomauteur=nomauteur;
    }
    public String getprenonauteur() {
        return prenomauteur;
    }
    public void setPrenomauteur(String prenomauteur){
        this.prenomauteur=prenomauteur;
    }
    public double getdoubleprix() {

        return prix;
    }
    public void setprix(double prix){
        this.prix=prix;
    }
    public static void main(String[] Args){

        livre l1=new livre(5,"titre1","nomauteur1","prenomauteur1",100.0);
        livre l2=new livre(5,"titre2","nomauteur2","prenomauteur2",999.90);

        System.out.println(l1.id);
        System.out.println(l2.prix);
        l1.to0String();
        l2.to0String();
        System.out.println("le nom du premier auteur est "+l1.getnomauteur());
        l1.setnomauteur("zaki");
        System.out.println("le nom actuel  du premier auteur est "+l1.getnomauteur());




    }
    public void to0String(){
        System.out.println(id+"|"+titre+"|"+nomauteur+"|"+prenomauteur+"|"+prix);
    }

}