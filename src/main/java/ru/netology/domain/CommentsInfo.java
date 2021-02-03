package ru.netology.domain;

public class CommentsInfo {

    // Комментатор:
    private String getCommentatorImageUrl; // изображение юзера, оставившего комментарий
    private int commentatorId;             // id юзера, оставившего комментарий
    private String commentatorLink;        // ссылка на юзера, оставившего комментарий

    // Комментарий:
    private int commentId;                 // id комментария
    private String commentText;            // текст комментария
    private String commentDate;            // дата размещения комментария
    private String commentTime;            // время размещения комментария
    private String inputFieldText;         // введенный юзером текст комментария
    private int commentatorLikesAmount;    // количество лайков комментария
    private String reportIconUrl;          // иконка для кнопки "Пожаловаться"
    private String responseButton;         // для кнопки "Ответить"

    //URL изображений иконок:
    private String commentButtonIconUrl; // иконка конопки "Комментарий"
    private String addItemIconUrl;       // иконка кнопки добавления материалов в комментарий
    private String addPhotoIconUrl;      // иконка кнопки "Фотография"
    private String addEmojiIconUrl;      // иконка для кнопки выбора эмоджи
    private String sendButtonIconUrl;    // иконка для кнопки размещения комментария

}
