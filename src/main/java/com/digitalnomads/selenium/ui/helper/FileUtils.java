package com.digitalnomads.selenium.ui.helper;

import java.io.File;

public class FileUtils {
    public static String getFilenameFromPath(String filePath) {
        File file = new File(filePath);
        return file.getName();
    }
}
