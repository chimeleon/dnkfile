package com.dnkdream.dnkfile.domains;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class DnkFile {
    @Id
    private BigDecimal id;
    @Column
    private String filename;
    @Column
    private Long filesize;
    @Column
    private String mime;
}
