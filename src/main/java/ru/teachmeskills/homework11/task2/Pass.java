package ru.teachmeskills.homework11.task2;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;

public class Pass {

    public static boolean getAuthorization (String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException {
        if (login.length() >= 20)
        throw new WrongLoginException("Длина логина должна быть меньше 20 символов.");

        else if (login.contains(" "))
        throw new WrongLoginException("Логин не должен содержать пробелы.");

        else if (!(password.equals(confirmPassword)))
          throw new WrongPasswordException("Пароль и подтверждение пароля должны быть равны.");

        else if (StringUtils.getDigits(password).equals(""))
        throw new WrongPasswordException("В пароле должна быть хотя бы одна цифра.");




        if (login.length() >= 20|login.contains(" ")|!(password.equals(confirmPassword))|StringUtils.getDigits(password).equals(""))
        return false;
     else    return true;


    }







    }








