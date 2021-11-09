package com.dnkdream.dnkfile.repositories;

import com.dnkdream.dnkfile.domains.DnkFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface FileRepository extends JpaRepository<DnkFile, BigDecimal> {

}
