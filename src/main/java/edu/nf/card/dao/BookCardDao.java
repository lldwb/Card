package edu.nf.bookCard.dao;

import edu.nf.bookCard.entity.BookCard;

import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
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
