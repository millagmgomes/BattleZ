public class GuerreiroZ {

    public String nome;
    public int poderDeLuta;
    public int idade;
    public boolean saiyajin ;

    public GuerreiroZ(String nome, int poderDeLuta, int idade, boolean saiyajin) {
        this.nome = nome;
        this.poderDeLuta = poderDeLuta;
        this.idade = idade;
        this.saiyajin = saiyajin;
    }

    public int getPoderDeLuta() {
        return poderDeLuta;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isSaiyajin() {
        return saiyajin;
    }

    public String getNome() {
        return nome;
    }

    public static void apresentar(GuerreiroZ guerreiro1, GuerreiroZ guerreiro2) {
        System.out.println("Bem-vindos ao TorneioZ!!");
        System.out.println("Hoje a batalha é entre: ");
        System.out.println(guerreiro1.nome);
        System.out.println("Com poder de luta de: " + guerreiro1.poderDeLuta);
        System.out.println("E " + guerreiro1.idade + " anos de idade");
        System.out.println("Versus: " + guerreiro2.nome);
        System.out.println( guerreiro2.nome + " tem um poder de luta de " + guerreiro2.poderDeLuta);
        System.out.println("E " + guerreiro2.idade + " anos de idade");



    }

}
