package edu.nf.card.service.impl;

import edu.nf.card.dao.BookCardDao;
import edu.nf.card.dao.impl.BookCardDaoImpl;
import edu.nf.card.entity.BookCard;
import edu.nf.card.service.BookCardService;

import java.util.List;

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
