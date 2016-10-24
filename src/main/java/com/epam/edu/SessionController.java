package com.epam.edu;

import com.epam.edu.util.Constants;

import org.apache.commons.lang3.StringUtils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes(Constants.VALUE)
public class SessionController {


    @RequestMapping(value = Constants.Paths.SLASH + Constants.Paths.READ_SESSION, method = RequestMethod.GET)
    public ModelAndView readSession() {
        return new ModelAndView(Constants.Pages.READ_PAGE);
    }

    @RequestMapping(value = Constants.Paths.SLASH + Constants.Paths.WRITE_SESSION, method = RequestMethod.GET)
    public String writeSession() {

        return Constants.Pages.WRITE_PAGE;
    }
    @ModelAttribute(Constants.VALUE)
    public String createValue() {
        return Constants.DEFAULT_VALUE;
    }
}
