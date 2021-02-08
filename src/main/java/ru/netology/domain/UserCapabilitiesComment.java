package ru.netology.domain;

public class UserCapabilitiesComment {
    private int commentsAmount;     // количество комментариев
    private boolean canPost;        // информация о том, может ли текущий пользователь комментировать запись
    private boolean groupsCanPost;  // информация о том, могут ли сообщества комментировать запись
    private boolean canClose;       // может ли пользователь закрыть комментарии к записи
    private boolean canOpen;        // может ли пользователь открыть комментарии к записи
}
