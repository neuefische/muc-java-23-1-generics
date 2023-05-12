public class Main {

    public static void main(String[] args) {
        String stift = "Stift";
        Integer zahl = 1;
        Integer antwortStift = doSomething(zahl);
    }

    /*
    public <T> T returnStuff(T stuff){
        return stuff;
    }*/

    // public = Wer kann die Methode nutzen`
    // static = Ich kann die Methode direkt aus Main nutzen (ohne Objekt)
    // <BeliebigerTyp> = Spitze Klammern und was drin steht = Das ist eine generische Methode
    // BeliebigerTyp = Rückgabetyp = Was gibt die Methode zurück?
    public static <BeliebigerTyp> BeliebigerTyp doSomething(BeliebigerTyp thing) {
        return thing;
    }
}
