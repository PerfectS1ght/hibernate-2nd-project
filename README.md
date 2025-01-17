# Анализ структуры базы данных

## Описание
Этот проект направлен на анализ структуры базы данных и выявление возможных проблем в её дизайне. Выявленные проблемы описаны ниже, а также предоставлены рекомендации по их устранению.

## Проблемы в структуре базы данных

1. **Отсутствие внешнего ключа на поле `film_id` в таблице `film_text`**:
    - В таблице `film_text` отсутствует внешний ключ на поле `film_id`, которое должно ссылаться на поле `id` таблицы `film`.
    - **Решение**: добавить внешний ключ для поддержания целостности данных.

2. **Неиспользуемая колонка `original_language_id` в таблице `film`**
    - Колонка никак не используется и заполнена `null`.
    - **Решение**: удалить колонку.

3. **Неудачное решение с полем `special_features` в таблице `film`**
    - Лучше не хранить в одной колонке в виде одной строки несколько записей.
    - **Решение**: разграничить записи и создать между ними связь `ManyToMany`.
4. **Неудобный формат записи в колонке `rating` таблицы `film`**
    - Данный формат записи создает проблемы при маппинге, заставляя использовать конвертер.
    - Удалить дефис у записей.
5. **Непонятная логика заполнения поля `rental_rate` в таблице `film`**
    - Непонятно, как пользователь выставляет оценки фильму.
    - Разобраться с логикой заполнения поля `rental_rate` и, если необходимо, написать новую.
