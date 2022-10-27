package no.hiof.sakariam.forlesning12;

public class Person {

    private final String fodselsnummer;

    public Person(String fodselsnummer) {
        this.fodselsnummer = fodselsnummer;
    }

    public Person(){
        fodselsnummer = "12345678910";
    }

    public String setFodselsnummer() {
        return fodselsnummer;
    }
}
