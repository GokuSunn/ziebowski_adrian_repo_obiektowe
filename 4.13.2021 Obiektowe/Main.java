class Main{
    public static void main(String[] args){

        Osoba os = new Osoba(177,80);
        System.out.println(os);

        System.out.println();
        
        Osoba os2 = new Osoba("Adrian","Ziębowski");
        System.out.println(os2);

        System.out.println();

        Osoba os3 = new Osoba("Adrian","Ziębowski", 180, 60);
        System.out.println(os3);
    }
}