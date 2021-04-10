package day40_Exceptions;

public class RunnerCheckedException {

    public static void main(String[] args) throws InvalidEmailIdCheckedException {
        String email = "rasit@gomail.com";
        mailDogrula(email);
    }

    private static void mailDogrula(String email) throws InvalidEmailIdCheckedException {
        if (email.contains("@gmail.com") || email.contains("@hotmail.com")) {
            System.out.println("Mailiniz basariyla kaydedildi");
        } else {
            throw new InvalidEmailIdCheckedException("Email uygun degil");
        }


    }
}
