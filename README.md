# **Менеджер продаж**

## Правила работы

Программа проводит анализ статистики продаж за определенный период.

Для того, чтобы воспользоваться программой Вам необходимо:

1. Создать переменную типа `SalesManager`:
```java
SalesManager period = new SalesManager(new int[]{68, 55, 98, 35, 87, 100});
```
Где имя переменной `period` можно заменить на интересующий Вас период, например, `day`, `week`, `month`, `year` и т.д.;

2. В фигурных скобках `{ }` фиксировать количество продаж через запятую `,`;

1. В строке:
```java
System.out.println("Максимальное количество продаж за период: " + period.max() + " шт.");
```
заменить в выражение `period.max()` имя `period` на то, которое вы присвоили переменной в пункте 1;

4. Запустить программу, после чего Вы увидите макимальное значение продаж в заданном периоде.

*Хорошего дня и высоких продаж!*
