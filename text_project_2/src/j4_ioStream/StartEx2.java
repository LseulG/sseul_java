package j4_ioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StartEx2 {

   public static void main(String[] args) {
      String srcFilePath = "c:/start";
      String destFilePath = "c:/end";

      String fileName = "/start.txt";
      String srcFile = srcFilePath + fileName;
      String destFile = destFilePath + fileName;

      File srcdir = new File(srcFilePath);
      File sFile = new File(srcFile);
      File destdir = new File(destFilePath);

      if (srcdir.exists() == false) {
         srcdir.mkdir();
      } else {
         System.out.println(destdir + "폴더가 존재합니다.");
      }
      
      if (srcdir.exists() == true) {
         try {
            sFile.createNewFile();
            FileOutputStream fos = new FileOutputStream(srcFile);
            //작성
            fos.close();
            
         } catch (IOException e) {
            e.printStackTrace();
         }
      }

      if (destdir.exists() == false) {
         destdir.mkdir();
      } else {
         System.out.println(destdir + "폴더가 존재합니다.");
      }

      try {
         InputStream is = new FileInputStream(srcFile);
         OutputStream os = new FileOutputStream(destFile);

         byte[] buffer = new byte[8];
         int cnt = 0;

         while (cnt != -1) {
            cnt = is.read(buffer);
            System.out.println(cnt);
            os.write(buffer, 0, cnt);
         }

         is.close();
         os.close();
      } catch (Exception e) {
      }
   }

}