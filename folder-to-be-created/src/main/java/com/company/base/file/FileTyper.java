package com.company.base.file;

import lombok.SneakyThrows;

import javax.ws.rs.core.MediaType;
import java.io.File;
import java.util.function.Function;

import static org.springframework.http.MediaType.parseMediaType;

public class FileTyper implements Function<File, MediaType> {
    @SneakyThrows
    @Override
    public  MediaType apply(File file) {
        var tika = new Tika();
        String detectedMediaType = tika.detect(file);
        return parseMediaType(detectedMediaType);
    }
}
