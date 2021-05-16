### Solution in intellij:
- Copy jar into empty java project. 
- Add jar as library to project.
- Look into the decompiled code and be slightly disappointed.
- Add debug point on first line in code.
- Right click jar and select debug, add input file to see what's actually going on.
- Use expression evaluator to see what things evaluate to.
- Pick out the encryption scheme, see that it's symmetric encryption.
- Grab encryption key.
- Write some code to decrypt or use some existing decryption tools:
  ```java
        final byte[] key = "Insanely secret!".getBytes();
        final byte[] message = Files.readAllBytes(Paths.get("encrypted.bin"));
        final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec aes = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.DECRYPT_MODE, aes, new IvParameterSpec(new byte[16]));
        try(FileOutputStream fos = new FileOutputStream("decrypted.txt")) {
            fos.write(cipher.doFinal(message));
        }
  ```
