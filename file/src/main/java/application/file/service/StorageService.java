package application.file.service;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.stream.Stream;

public interface StorageService {

    void init();

    void deleteAll();

    public Resource loadResource(Long id);

    public void save(MultipartFile file);

    public Stream<Path> loadAll();
}
