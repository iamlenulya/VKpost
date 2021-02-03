package ru.netology.domain;

public class UserCapabilities {

    // Действия с постом:
    private boolean canPin;         // может ли юзер закрепить пост
    private boolean canDelete;      // может ли юзер удалить пост
    private boolean canEdit;        // может ли юзер редактировать пост
    private boolean canLike;        // информация о том, может ли пользователь поставить отметку «Нравится»
    private boolean canShare;       // информация о том, может ли пользователь сделать репост записи

    // Действия с комментариями:
    private int commentsAmount;     // количество комментариев
    private boolean canPost;        // информация о том, может ли текущий пользователь комментировать запись
    private boolean groupsCanPost;  // информация о том, могут ли сообщества комментировать запись
    private boolean canClose;       // может ли пользователь закрыть комментарии к записи
    private boolean canOpen;        // может ли пользователь открыть комментарии к записи

}
