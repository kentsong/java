import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGeneratorUtils {

	private HashGeneratorUtils() {}
 
    public static String generateMD5(String message) {
        return hashString(message, "MD5");
    }
 
    public static String generateSHA1(String message) {
        return hashString(message, "SHA-1");
    }
 
    public static String generateSHA256(String message) {
        return hashString(message, "SHA-256");
    }
    
    public static String generateMD5(File file) {
        return hashFile(file, "MD5");
    }
     
    public static String generateSHA1(File file) {
        return hashFile(file, "SHA-1");
    }
     
    public static String generateSHA256(File file) {
        return hashFile(file, "SHA-256");
    }
 
    
    private static String hashString(String message, String algorithm) {
        MessageDigest digest;
        byte[] hashedBytes = null;
		try {
			digest = MessageDigest.getInstance(algorithm);
			hashedBytes = digest.digest(message.getBytes("UTF-8"));
		} 
		catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
			 throw new RuntimeException("Could not generate hash from String", ex);
		} 
		return convertByteArrayToHexString(hashedBytes);
    }
    
    
    private static String hashFile(File file, String algorithm) {
        try (FileInputStream inputStream = new FileInputStream(file)) {
            MessageDigest digest = MessageDigest.getInstance(algorithm);
     
            byte[] bytesBuffer = new byte[1024];
            int bytesRead = -1;
     
            while ((bytesRead = inputStream.read(bytesBuffer)) != -1) {
                digest.update(bytesBuffer, 0, bytesRead);
            }
     
            byte[] hashedBytes = digest.digest();
     
            return convertByteArrayToHexString(hashedBytes);
        } catch (NoSuchAlgorithmException | IOException ex) {
            throw new RuntimeException("Could not generate hash from file", ex);
        }
    }
    
 
    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return stringBuffer.toString();
    }
    
    

}
