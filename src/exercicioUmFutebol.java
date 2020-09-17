/*
 Aprendendo vetores.
 */
class exercicioUmFutebol {
    public static void main(String[] args) {
        /*
        É muito importante lembrar de usar o [] depois do tipo.
         */
        String[] timesFutebol = new String[5];
        timesFutebol[0] = "Palmeiras";
        timesFutebol[1] = "Corinthians";
        timesFutebol[2] = "Santos";
        timesFutebol[3] = "São Paulo";
        timesFutebol[4] = "Ituano";

        System.out.printf("O time de futebol escolhido é %s \n", timesFutebol[0]);

        int i = 0;
        while (i < 5) {
            System.out.printf("O time de futebol %s escolhido é %s \n", i, timesFutebol[i]);
            i++;
        }

        i = 0;
        String[] timesFutebolEuropeu = {"PSG", "Real Madrid", "Barcelona", "Manchester City", "Manchester United"};
        while (i < 5) {
            System.out.printf("O time %d é %s \n", i, timesFutebolEuropeu[i]);
            i++;
        }

        for (i = 0; i < 5; i++) {
            System.out.printf("%s \n",timesFutebolEuropeu[i]);
        }
    }
}
