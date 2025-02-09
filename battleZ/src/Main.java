public class Main {

    public static void main(String[] args) {
        GuerreiroZ guerreiro1 = new GuerreiroZ("Trunks", 300,13,true);
        GuerreiroZ guerreiro2 = new GuerreiroZ("Goten", 300,13,true);

        GuerreiroZ.apresentar(guerreiro1, guerreiro2);

        Batalha.batalha(guerreiro1, guerreiro2);
    }


}