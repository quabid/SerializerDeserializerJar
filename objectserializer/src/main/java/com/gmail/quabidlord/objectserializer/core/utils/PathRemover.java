package com.gmail.quabidlord.objectserializer.core.utils;

import java.nio.file.Paths;

public class PathRemover {
    PathValidator pathValidator = new PathValidator();
    
    public PathRemover() {
        super();
    }

    public final boolean removePath(String path) {
        if (pathValidator.pathExists(path)) {
            return Paths.get(path).toFile().delete();
        }
        return false;
    }
}