package org.example.blog.service;


import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private final String LOGIN = "romain";
    private final String PASSWORD = "lyon";

    @Autowired
    private HttpSession _httpSession;

    public boolean login(String login,String password){
        if(login.equals(LOGIN) && password.equals(PASSWORD)){
            _httpSession.setAttribute("login","OK");
            return true;
        }
        return false;
    }

    public boolean isLogged(){
        try {
            String attrIsLogged = _httpSession.getAttribute("login").toString();
            return attrIsLogged.equals("OK");
        }catch (Exception ex){
            return false;
        }
    }

}
