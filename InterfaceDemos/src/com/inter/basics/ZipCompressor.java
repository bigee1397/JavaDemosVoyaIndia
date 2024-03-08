package com.inter.basics;

public class ZipCompressor implements ICompressor {
    @Override
    public String[] compressFiles(String file1, String file2) {
        String[] zippedFiles = {file1,file2};
        return zippedFiles;
    }
}
