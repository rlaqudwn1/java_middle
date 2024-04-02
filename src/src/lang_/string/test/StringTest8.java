package lang_.string.test;

public class StringTest8 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String part[] = email.split("@");
        String idPart = part[0];
        String domianPart = part[1];

        System.out.println("domianPart = " + domianPart);
        System.out.println("idPart = " + idPart);
    }
}
