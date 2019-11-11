
import java.util.*;

public class Home {
    public static void main(String[] args){
        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tWelcome to Ceaser Encryption  App");
        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        boolean mainBranch = true;
        while (mainBranch){
            System.out.println("Welcome to our App. What would you like to do?\n\tEnter 1 to Encrypt\n\tEnter 2 to Decrypt\n\tEnter 3 to exit");
            Scanner scanner = new Scanner(System.in);
            Integer inputChoice = scanner.nextInt();
            if (inputChoice.equals(1)){
                System.out.println("Enter a word to Encrypt");
                String encryptWord = scanner.next();
                System.out.println("Enter a key(Integer value) to Encrypt");
                Integer encryptKey = scanner.nextInt();
                CipherCeaser cipherCeaser = new CipherCeaser(encryptWord,encryptKey);
                Encrypt encrypt = new Encrypt();
                encrypt.setTheWord(cipherCeaser.getMName());
                encrypt.setKey(cipherCeaser.getMkey());
                System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    The Encrypted word is : " + " "+encrypt.encrypt_word() + " and the key is "+ encrypt.getMkey() );
                System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            else if (inputChoice.equals(2)){
                System.out.println("Enter encrypted word");
                String decryptedWord = scanner.next();
                System.out.println("Enter the key(integer) used for encryption");
                Integer decryptedKey = scanner.nextInt();
                CipherCeaser cipherCeaser = new CipherCeaser(decryptedWord,decryptedKey);
                Decrypt decrypt = new Decrypt();
                decrypt.setTheWord(cipherCeaser.getMName());
                decrypt.setKey(cipherCeaser.getMkey());
                System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    The decrypted word is: " +" "+ decrypt.decrypt_word() + " " + " and the key is " + decrypt.getMkey());
                System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            }else if (inputChoice.equals(3)){
                mainBranch = false;
            }
            else {
                System.out.println("You entered a string instead of an integer");
            }

        }
    }

}
