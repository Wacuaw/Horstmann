package podypl.Zajecia4;

public class Poli {
    public static void main(String[] args) {

        AA aa = new AA();
        aa.introduce();

        System.out.println();

        BB bb = new BB();
        bb.introduce();

        Letter letter1 = new AA();
        Letter letter2 = new BB();

        System.out.println();

        letter1.introduce();
        letter2.introduce();


    }
}



interface Letter{
    void introduce();   //w interfejsach nie piszemy jak, tylko co, czyli bez nawiasu {}
}

class AA implements Letter {
    @Override
    public void introduce() {
        System.out.println("jestem A");
    }
}

class BB extends AA implements Letter{
    @Override
    public void introduce() {
        System.out.println("jestem B");
    }
}
