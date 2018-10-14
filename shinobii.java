
public class Konohaa{
  public static void main(String[] args){
    shinobi[] m = new shinobi[3];

    m[0] = new shinobi();
    m[0].setNoregis("012606");
    m[0].setNama("Uchiha Sasuke");
    m[0].setPeringkat("Genin");

    m[1] = new shinobi();
    m[1].setNoregis("021607");
    m[1].setNama("Uzumaki Naruto");
    m[1].setPeringkat("Genin");

    m[2] = new shinobi();
    m[2].setNoregis("021601");
    m[2].setNama("Haruno Sakura");
    m[2].setPeringkat("Chunin");

    System.out.println(" Data Shinobi ");
    for(shinobi x:m){
      System.out.println("setNoregis : "+x.getNoregis());
      System.out.println("Nama : "+x.getNama());
      System.out.println("Peringkat : "+x.getPeringkat());
      System.out.println();
    }
  }
}

