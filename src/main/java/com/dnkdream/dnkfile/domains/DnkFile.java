package com.dnkdream.dnkfile.domains;

import lombok.Builder;
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
    @Column
    private String key;
    @Column
    private Integer downloadCount;
    @Column
    private Integer maxDownloadCount;
    @Column
    @Builder.Default
    private boolean autoDelete = true;
}
