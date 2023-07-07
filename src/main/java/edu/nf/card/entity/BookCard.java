package edu.nf.bookCard.entity;

import org.nf.db.util.Column;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
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

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }
}
