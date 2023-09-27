package com.itheima.d2_buffered_stream;

import java.io.*;

public class TimeTest4 {

    private static final String SRC_FILE = "";
    private static final String DEST_FILE = "";
    public static void main(String[] args) {

    }
    private static void copy01(){
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE);
                ){
            int b;
            while ((b = is.read()) != -1){
                os.write(b);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void copy02(){
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE);
                ){
            int len;
            byte[] buffer = new byte[1024];
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
    }

    private static void copy04(){
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                BufferedInputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE);
                BufferedOutputStream bos = new BufferedOutputStream(os);
                ){
            int len;
            byte[] buffer = new byte[1024];
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
    }
}
