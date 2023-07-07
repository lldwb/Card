package edu.nf.card.dao;

import edu.nf.card.entity.BookCard;

import java.util.List;

public interface BookCardDao {
    /**
     * 添加借书卡
     */
    Boolean addBookCard(BookCard card);
    /**
     * 查询所有借书卡
     *
     * @return 借书卡集合
     */
    List<BookCard> getAllCards();
}
