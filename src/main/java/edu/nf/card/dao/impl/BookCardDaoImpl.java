package edu.nf.card.dao.impl;

import edu.nf.card.dao.BookCardDao;
import edu.nf.card.entity.BookCard;
import edu.nf.card.utils.MySqlUtil;

import java.util.List;

public class BookCardDaoImpl implements BookCardDao {
    @Override
    public Boolean addBookCard(BookCard card) {
        return MySqlUtil.update("insert into BookCard(name, sex, create_date, deposit) values (?,?,?,?)", card.getName(), card.getSex(), card.getCreateDate(), card.getDeposit()) != 0;
    }

    @Override
    public List<BookCard> getAllCards() {
        return MySqlUtil.queryList(BookCard.class, "select cid,name, sex, create_date, deposit from BookCard    ");
    }
}
