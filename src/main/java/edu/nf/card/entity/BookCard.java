package edu.nf.card.entity;

import lombok.Data;
import org.nf.db.util.Column;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
@Data
public class BookCard {
    @Column("cid")
    private Integer cid;
    @Column("name")
    private String name;
    @Column("sex")
    private String sex;
    @Column("create_date")
    private LocalDateTime createDate;
    @Column("deposit")
    private BigDecimal deposit;
}
