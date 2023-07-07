package edu.nf.card.controller;

import edu.nf.card.entity.BookCard;
import edu.nf.card.service.BookCardService;
import edu.nf.card.service.impl.BookCardServiceImpl;
import org.nf.web.annotation.RequestMapping;
import org.nf.web.annotation.RequestParam;
import org.nf.web.servlet.View;
import org.nf.web.servlet.view.JsonView;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BookCardController extends BaseController {
    @RequestMapping("/addBookCard")
    public View addBookCard(@RequestParam("name") String name, @RequestParam("sex") String sex, @RequestParam("createDate") String createDate, @RequestParam("deposit") String deposit) {
        System.out.println(11);
        BookCard card = new BookCard();
        card.setName(name);
        card.setSex(sex);
        card.setCreateDate(LocalDateTime.parse(createDate));
        card.setDeposit(BigDecimal.valueOf(Integer.valueOf(deposit)));
        System.out.println(card);
        BookCardService service = new BookCardServiceImpl();
        if (service.addBookCard(card)) {
            return new JsonView(success());
        } else {
            return new JsonView(error(500, "添加失败"));
        }
    }

    @RequestMapping("/getAllCards")
    public View getAllCards() {
        BookCardService service = new BookCardServiceImpl();
        return new JsonView(success(service.getAllCards()));
    }
}
