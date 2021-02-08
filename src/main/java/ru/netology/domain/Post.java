package ru.netology.domain;

public class Post {
    private int postId;             // id поста
    boolean anchoredPost;           // пост может быть закреплен в группе
    private int dropdownContent;    // содержимое выпадающего списка (пожаловаться и сохранить в закладках)
    private boolean markedAsAds;    // информация о том, содержит ли запись отметку "реклама"
    private int postponedId;        // идентификатор отложенной записи
    private int date;               // дата и время размещения поста
    private int dateFilterUrl;      // ссылка на отфильрованные по дате посты при клике на дату
    private String mainTextBlock;   // содержимое блока с текстом
    private String mainImageUrl;    // изображение в посте
    private String fullTextButton;  // для кнопки "Показать полностью"
}
