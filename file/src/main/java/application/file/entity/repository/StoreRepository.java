package application.file.entity.repository;

import application.file.entity.FileStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Long, FileStore> {
    FileStore findById(Long id);
    void save(FileStore fileStore);
}
