package edu.nf.card.controller;

import org.nf.web.annotation.ExceptionHandler;
import org.nf.web.servlet.view.JsonView;

/**
 * 异常处理
 */
public class ExceptionHandlerS extends BaseController{
    // 全局异常处理
    @ExceptionHandler(Exception.class)
    public JsonView exception(Exception e) {
        System.out.println(e);
        System.out.println(e.getMessage());
        System.out.println(e.getLocalizedMessage());
//        return new JsonView(error(500, e.toString()));
        return new JsonView(error(500, e.getLocalizedMessage()));
    }
}
