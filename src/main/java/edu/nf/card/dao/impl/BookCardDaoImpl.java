package edu.nf.bookCard.dao.impl;

import edu.nf.bookCard.dao.BookCardDao;
import edu.nf.bookCard.entity.BookCard;
import edu.nf.bookCard.utils.MySqlUtil;

import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class BookCardDaoImpl implements BookCardDao {
    @Override
    public Boolean addBookCard(BookCard card) {
        return MySqlUtil.update("insert into bookcard_info(name, sex, create_date, deposit) values (?,?,?,?)", card.getName(), card.getSex(), card.getCreateDate(), card.getDeposit()) != 0;
    }

    @Override
    public List<BookCard> getAllCards() {
        return MySqlUtil.queryList(BookCard.class, "select cid,name, sex, create_date, deposit from bookcard_info");
    }
}
