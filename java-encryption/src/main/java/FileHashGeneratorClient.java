import java.io.File;


public class FileHashGeneratorClient {

	public static void main(String[] args) {
		String filePath = args[0];
		System.out.println("File Path: " + filePath);
		File file = new File(filePath);
		
		String md5Hash = HashGeneratorUtils.generateMD5(file);
        System.out.println("MD5 Hash: " + md5Hash);
         
        String sha1Hash = HashGeneratorUtils.generateSHA1(file);
        System.out.println("SHA-1 Hash: " + sha1Hash);
		
		String sha256Hash  = HashGeneratorUtils.generateSHA256(file);
		System.out.println("SHA-256 Hash: " + sha256Hash);

	}

}
