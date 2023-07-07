package edu.nf.bookCard.controller;

import edu.nf.bookCard.entity.BookCard;
import edu.nf.bookCard.service.BookCardService;
import edu.nf.bookCard.service.impl.BookCardServiceImpl;
import org.nf.web.annotation.Model;
import org.nf.web.annotation.RequestMapping;
import org.nf.web.annotation.RequestParam;
import org.nf.web.servlet.View;
import org.nf.web.servlet.view.JsonView;


/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class BookCardController extends BaseController {
    @RequestMapping("/addBookCard")
    public View addBookCard(@Model BookCard card) {
        BookCardService service = new BookCardServiceImpl();
        if (service.addBookCard(card)){
            return new JsonView(success());
        }else {
            return new JsonView(error(500,"添加失败"));
        }
    }

    @RequestMapping("/getAllCards")
    public View getAllCards(@RequestParam("where") String sex) {
        BookCardService service = new BookCardServiceImpl();
        return new JsonView(success(service.getAllCards()));
    }
}
