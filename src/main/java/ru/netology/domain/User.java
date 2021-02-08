package ru.netology.domain;

public class User {
    private int groupId;            // id группы, в которой пост размещен
    private int creatorId;          // айди автора записи
    private String creatorImageUrl; // иконка группы/юзера, который разместил пост
    private String groupName;       // имя группы, в которой размещен пост
    private String creatorLink;     // ссылка на группу/юзера, который разместил пост
}
