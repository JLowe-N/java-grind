import javax.swing.JFrame;

class Program {
    public static void main(String[] args) {
        hipster justin = new hipster();
        coffee myCarafe = new costarican();
        mocha mug = new mocha();

        mug.chill();
        justin.sip(mug);
        justin.sip(myCarafe);

        AnimalList ALO = new AnimalList();
        Dog d = new Dog();
        Fish f = new Fish();
        ALO.add(d);
        ALO.add(f);

        Animal[] thenewlist = new Animal[2];
        Dog luna = new Dog();
        Fish wanda = new Fish();
        thenewlist[0] = luna;
        thenewlist[1] = wanda;

        for (Animal x : thenewlist) {
            x.noise();
        }

        Gui go = new Gui();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(800, 800);
        go.setVisible(true);
    }
}