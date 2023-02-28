package src.conceitosBasicos.noEncadeamento;

public class MainComNoRefatorado {
    public static void main(String[] args) {

        NoRefatorado<String> no1 = new NoRefatorado<String>("Conteudo 1");

        NoRefatorado<String> no2 = new NoRefatorado<String>("Conteudo 2");
        no1.setProximoNo(no2);

        NoRefatorado<String> no3 = new NoRefatorado<String>("Conteudo 3");
        no2.setProximoNo(no3);

        NoRefatorado<String> no4 = new NoRefatorado<String>("Conteudo 4");
        no3.setProximoNo(no4);

        System.out.println("---------------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
