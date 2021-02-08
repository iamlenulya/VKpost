package ru.netology.domain;

public class CommentsInfo {
    private int count;                     // количество комментариев
    private String canPost;                //информация о том, может ли текущий пользователь комментировать запись
    private String groupsCanPost;          // информация о том, могут ли сообщества комментировать запись
    private int commentId;                 // id пользователя оставившего комментарий
    private String commentPhotoId;         // фото комментатора
    private String commentText;            // текст комментария
    private String commentDate;            // дата размещения комментария
    private String commentTime;            // время размещения комментария
    private String inputFieldText;         // введенный юзером текст комментария
    private int commentatorLikesAmount;    // количество лайков комментария
}
