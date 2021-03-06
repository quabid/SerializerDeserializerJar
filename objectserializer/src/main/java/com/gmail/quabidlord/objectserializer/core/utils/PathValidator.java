package com.gmail.quabidlord.objectserializer.core.utils;

import java.nio.file.Paths;

public class PathValidator {
    public boolean pathExists(String path) {
        return Paths.get(path).toFile().exists();
    }
}
