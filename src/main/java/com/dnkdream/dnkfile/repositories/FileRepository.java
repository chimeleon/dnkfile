package com.dnkdream.dnkfile.repositories;

import com.dnkdream.dnkfile.domains.DnkFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface FileRepository extends JpaRepository<DnkFile, BigDecimal> {
    Optional<DnkFile> findByKey(String key);
}
