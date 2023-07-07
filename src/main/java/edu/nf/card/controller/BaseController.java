package edu.nf.card.controller;

import edu.nf.card.vo.ResultVO;

public class BaseController {
    public <T> ResultVO<T> success(T data) {
        ResultVO<T> vo = new ResultVO<>();
        vo.setCode(200);
        vo.setData(data);
        return vo;
    }
    public ResultVO success() {
        ResultVO vo = new ResultVO();
        vo.setCode(200);
        return vo;
    }
    public ResultVO error(int code, String message) {
        ResultVO vo = new ResultVO();
        vo.setCode(code);
        vo.setMessage(message);
        return vo;
    }
}
