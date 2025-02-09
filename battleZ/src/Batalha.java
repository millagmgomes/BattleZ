public class Batalha{

    public static void batalha(GuerreiroZ guerreiro1, GuerreiroZ guerreiro2){
        if (guerreiro1.getPoderDeLuta() > guerreiro2.getPoderDeLuta()){
            System.out.println(guerreiro1.nome + " venceu!");
        } else if (guerreiro1.getPoderDeLuta() < guerreiro2.getPoderDeLuta()) {
            System.out.println(guerreiro2.nome + " venceu!");
        } else {
            if (guerreiro1.getIdade() > guerreiro2.getIdade()) {
                System.out.println(guerreiro1.nome + " venceu!");
            }else if (guerreiro1.getIdade() < guerreiro2.getIdade()) {
                System.out.println(guerreiro2.nome + " venceu!");
            } else {
                if (guerreiro1.isSaiyajin() && !guerreiro2.isSaiyajin()) {
                    System.out.println(guerreiro1.getNome() + " é o vencedor!");
                } else if (!guerreiro1.isSaiyajin() && guerreiro2.isSaiyajin()) {
                    System.out.println(guerreiro2.getNome() + " é o vencedor!");
                } else {
                    System.out.println("A batalha terminou em empate!");
                }
            }
        }
    }

}
