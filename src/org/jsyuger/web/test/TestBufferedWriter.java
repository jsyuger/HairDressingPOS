package org.jsyuger.web.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {
 public static void main(String[] args) {
  try {

   String content = "hhhhhh";

   File file = new File("WebRoot/doc/notice.txt");

   // if file doesnt exists, then create it
   if (!file.exists()) {
    file.createNewFile();
   }

   FileWriter fw = new FileWriter(file.getAbsoluteFile());
   BufferedWriter bw = new BufferedWriter(fw);
   bw.write(content);
   bw.close();

   System.out.println("Done");

  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}