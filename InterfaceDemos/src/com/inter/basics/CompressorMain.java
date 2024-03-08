package com.inter.basics;

public class CompressorMain {

    public static void main(String[] args) {
        ICompressor compressor = new ZipCompressor();
        String[] zipFiles = compressor.compressFiles("Assassin's Creed.exe", "nfsmw.exe");
        System.out.print("Zip Files are: ");
        for (String zipFile : zipFiles) {
            System.out.print(zipFile + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print("Jar Files are: ");
        ICompressor jarCompressor = new JarCompressor();
        String[] jarFiles = jarCompressor.compressFiles("App.java", "Demo.java");
        for (String jarFile : jarFiles) {
            System.out.print(jarFile + " ");
        }
    }
}
