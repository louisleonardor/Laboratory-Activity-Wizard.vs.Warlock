public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begin!");
        System.out.println("Wizards and Warlocks");
        System.out.println("Both Fighter Have 200 HP and 200 Mana");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Wizard Kadita = new Wizard("Kadita");
        Warlock Thamuz = new Warlock("Thamuz");
        Kadita.Thalassophobia(Thamuz);
        Kadita.RoughWaves(Thamuz);
        Thamuz.MoltenScythes(Kadita);
        Kadita.BlazingWater(Thamuz);
        Thamuz.ChasmTrample(Kadita);
        Thamuz.FireHeal(Thamuz);
        Kadita.WaterHeal(Kadita);
        Kadita.WaterSlash(Thamuz);
        Thamuz.CauterantInferno(Kadita);
        Kadita.OceanOddity(Thamuz);

    }
}

