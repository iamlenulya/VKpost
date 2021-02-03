package ru.netology.domain;

public class UserCapabilities {

    // Действия с постом:
    private boolean canLike;        // информация о том, может ли пользователь поставить отметку «Нравится»
    private boolean canShare;       // информация о том, может ли пользователь сделать репост записи

    // Действия с комментариями:
    private int commentsAmount;     // количество комментариев
    private boolean canPost;        // информация о том, может ли текущий пользователь комментировать запись
}
