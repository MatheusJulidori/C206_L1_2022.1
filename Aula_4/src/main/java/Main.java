public class Main {

    public static void main(String[] args) {

        Conta[] contas = new Conta[3];

        Conta c1 = new Conta();
        contas[0] = c1; //Duas referencias diferentes para conta: c1 e cotnas[0]
        c1.saldo = 200;
        contas[0].nome = "Matheus";
        //c1.mostraInfo();

        contas[2] = new Conta();
        contas[2].saldo = 20000;
        contas[2].nome = "Mateus";
        //contas[2].mostraInfo();

        for (int i=0; i< contas.length;i++){//For para acessar posição de vetores
            if (contas[i]!=null) {
                System.out.println(contas[i]);
            }
        }

        for (Conta item : contas) {//FOr para varrer valores
            if (item != null)
                item.mostraInfo();
        }


    }
}
