package edu.nf.bookCard.service.impl;

import edu.nf.bookCard.dao.BookCardDao;
import edu.nf.bookCard.dao.impl.BookCardDaoImpl;
import edu.nf.bookCard.entity.BookCard;
import edu.nf.bookCard.service.BookCardService;

import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class BookCardServiceImpl implements BookCardService {
    @Override
    public Boolean addBookCard(BookCard card) {
        BookCardDao dao = new BookCardDaoImpl();
        return dao.addBookCard(card);
    }

    @Override
    public List<BookCard> getAllCards() {
        BookCardDao dao = new BookCardDaoImpl();
        return dao.getAllCards();
    }
}
