package ru.netology.domain;

public class Donuts {
    private boolean isDonut;        // запись доступна только платным подписчикам VK Donut
    private int paidDuration;       // время, в течение которого запись будет доступна подписчикам VK Donut
    private String placeholder;     // заглушка для пользователей (отображается вместо содержимого записи)
    private boolean canPublishFree; // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String editMode;        // информация о том, какие значения VK Donut можно изменить в записи (возможные значения all и duration)
}
