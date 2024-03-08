package com.inter.basics;

public class JarCompressor implements ICompressor {
    @Override
    public String[] compressFiles(String file1, String file2) {
        String[] jarZippedFiles = {file1, file2};
        return jarZippedFiles;
    }
}
