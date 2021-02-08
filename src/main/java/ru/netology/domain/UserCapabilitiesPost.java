package ru.netology.domain;

public class UserCapabilitiesPost {
    private boolean canPin;         // может ли юзер закрепить пост
    private boolean canDelete;      // может ли юзер удалить пост
    private boolean canEdit;        // может ли юзер редактировать пост
    private boolean canLike;        // информация о том, может ли пользователь поставить отметку «Нравится»
    private boolean canShare;       // информация о том, может ли пользователь сделать репост записи
}
