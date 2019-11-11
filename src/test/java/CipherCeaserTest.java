import org.junit.Test;
import static org.junit.Assert.*;

public class CipherCeaserTest {
    @Test
    public void cipherCeaser_initiatesCorrectly_true(){
        CipherCeaser testCipher = new CipherCeaser("nam",2);
        assertEquals(true,testCipher instanceof CipherCeaser);
    }

    @Test
    public void cipherCeaser_getmName_name(){
        CipherCeaser testString = new CipherCeaser("nam",2);
        Encrypt newEcrypt = new Encrypt();
        newEcrypt.setTheWord(testString.getMName());
        assertEquals("nam",newEcrypt.getMName());
    }

    @Test
    public void cipherCeaser_getmKey_2(){
        CipherCeaser testKey = new CipherCeaser("nam",2);
        Encrypt newEcrypt = new Encrypt();
        newEcrypt.setKey(testKey.getMkey());
        assertEquals(2,newEcrypt.getMkey());
    }

    @Test
    public void cipherCeaser_setTheWord_String(){
        Encrypt newEncrypt = new Encrypt();
        newEncrypt.setTheWord("me");
        assertEquals("me",newEncrypt.getMName());
    }

    @Test
    public void cipherCeaser_setTheKey_int(){
        Encrypt newEncrypt = new Encrypt();
        newEncrypt.setKey(2);
        assertEquals(2,newEncrypt.getMkey());
    }

    @Test
    public void cipherCeaser_encryptWord_encyptedText(){
        CipherCeaser testEncryptedText = new CipherCeaser("nam",2);
        Encrypt encrypt= new Encrypt();
        encrypt.setTheWord(testEncryptedText.getMName());
        encrypt.setKey(testEncryptedText.getMkey());
        assertEquals("pco",encrypt.encrypt_word());
    }

    @Test
    public void cipherCeaser_dencryptWord_decyptedText(){
        CipherCeaser testEncryptedText = new CipherCeaser("pco",2);
        Decrypt decrypt = new Decrypt();
        decrypt.setKey(testEncryptedText.getMkey());
        decrypt.setTheWord(testEncryptedText.getMName());
        assertEquals("nam",decrypt.decrypt_word());
    }

}
