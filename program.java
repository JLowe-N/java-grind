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
    }
}