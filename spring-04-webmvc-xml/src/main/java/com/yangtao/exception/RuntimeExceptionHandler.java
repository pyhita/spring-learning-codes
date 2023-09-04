package com.yangtao.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class RuntimeExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public String handlerRuntimeException(HttpServletRequest request, HttpServletResponse response, RuntimeException e) {
        e.printStackTrace();

        return "error";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException(HttpServletRequest request,
                                                 HttpServletResponse response,
                                                 IllegalArgumentException e) {
        e.printStackTrace();
        request.setAttribute("message", "部门名称为空！");

        return "error";
    }
}
