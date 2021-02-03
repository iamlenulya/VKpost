package ru.netology.domain;

public class Post {

    // Автор поста:
    private int groupId;            // id группы, в которой пост размещен
    private int creatorId;          // айди автора записи
    private String creatorImageUrl; // иконка группы/юзера, который разместил пост
    private String groupName;       // имя группы, в которой размещен пост
    private String creatorLink;     // ссылка на группу/юзера, который разместил пост

    // Конкретный пост:
    private int postId;             // id поста
    boolean anchoredPost;           // пост может быть закреплен в группе
    private int dropdownContent;    // содержимое выпадающего списка (пожаловаться и сохранить в закладках)
    private boolean markedAsAds;    // информация о том, содержит ли запись отметку "реклама"
    private int postponedId;        // идентификатор отложенной записи

    private int date;               // дата и время размещения поста
    private int dateFilterUrl;      // ссылка на отфильрованные по дате посты при клике на дату

    private String geoType;          // тип места
    private String geoCoordinates;   // координаты места
    private int geoPlaceDescription; // описание места

    private String mainTextBlock;   // содержимое блока с текстом
    private String mainImageUrl;    // изображение в посте
    private String fullTextButton;  // для кнопки "Показать полностью"

    private int postLikesAmount;    // количество лайков поста
    private int commentsAmount;     // количество комментариев
    private int repostsAmount;      // количество репостов
    private int viewsAmount;        // количество просмотров

    // Приватность и реплаи
    private int replyOwnerId;       // id владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;        // id записи, в ответ на которую была оставлена текущая
    boolean friendsOnly;            // запись была создана с опцией «Только для друзей»
    private String copyright;       // источник материала

    // URL изображений иконок:
    private String likeButtonImageUrl;   // иконка кнопки "Нравится"
    private String pushedLikeButtonUrl;  // иконка кнопки "Нравится", когда она нажата
    private String shareButtonIconUrl;   // иконка кнопки "Поделиться"
    private String viewsIconUrl;         // иконка для количества просмотров

    // Донаты
    private boolean isDonut;        // запись доступна только платным подписчикам VK Donut
    private int paidDuration;       // время, в течение которого запись будет доступна подписчикам VK Donut
    private String placeholder;     // заглушка для пользователей (отображается вместо содержимого записи)
    private boolean canPublishFree; // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String editMode;        // информация о том, какие значения VK Donut можно изменить в записи (возможные значения all и duration)
}
