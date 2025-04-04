# Лекція 1

# ЗАГАЛЬНІ УЯВЛЕННЯ ПРО МОВУ JAVA

## 1. Що таке Java?

Java широко відома як новітня об'єктно-орієнтована мова, легка у вивченні і дозволяє створювати програми, які можуть
виконуватися на будь-якій платформі без яких-небудь доопрацювань (кроссплатформність). Програмісти можуть додати до
цього опису, що мова схожа на спрощений С або С ++ з додаванням garbage collector'а - автоматичного збирача "сміття" (
механізм звільнення пам'яті, яка більше не використовується програмою).

Було випущено п'ять основних версій мови, починаючи з 1.0 в 1995 році і закінчуючи 1.4 в лютому 2002 року (21 вересня
2017 вийшла 9 версія). Наступна версія 1.5 випущена в 2004 році. Всі версії і документацію до них завжди можна було
безкоштовно отримати на офіційному web-сайті Java http://java.sun.com/.

Один з перших продуктів для Java - JDK 1.1 (засіб розробки на Java) - протягом перших трьох тижнів після оголошення був
завантажений більш 220000 разів. Версія 1.4 була завантажена більше 2 мільйонів разів за перші 5 місяців.

Практично всі провідні виробники програмного забезпечення ліцензували технологію Java і регулярно оголошують про вихід
побудованих на ній продуктів. Це і IBM, і творець платформи Macintosh фірма Apple, і лідер в області реляційних БД
Oracle, і навіть головний конкурент фірми Sun - корпорація Microsoft - ліцензувала Java ще в березні 1996 року.

Java створювалася як універсальна мова, призначена для прикладного програмування в неоднорідних комп'ютерних мережах як
з боку клієнтського комп'ютера, так і з боку сервера. Скомпільовані програми Java працюють тільки під управлінням
**віртуальної Java-машини**, тому вони називаються **додатками Java**.

Синтаксис операторів Java практично повністю збігається з синтаксисом мови C, але, на відміну від C++, Java не є
розширенням C - це абсолютно незалежна мова, зі своїми власними синтаксичними правилами. Вона є набагато більш сильно
типізованою в порівнянні з C і C ++, тобто вносить набагато більше обмежень на дії зі змінними і величинами різних
типів. Наприклад, в C / C ++ немає різниці між цілочисельними, булевими і символьними величинами, а також адресами в
пам'яті. Тобто, наприклад, можна помножити символ на булеве значення, з якого вирахувано ціле число, і розділити
результат на адресу! В Java є заборона на майже всі дії такого роду.

Java, JavaScript і C ++ є об'єктно-орієнтованими мовами програмування, і всі вони мають C-подібний синтаксис операторів.
Але як об'єктні моделі, так і базові конструкції цих мов (за винятком синтаксису операторів), в цих мовах принципово
різні. Жодна з них не є версією або спрощенням іншого - це зовсім різні мови, призначені для різних цілей.
Java-універсальна мова прикладного програмування, JavaScript - вузькоспеціалізована мова програмування HTML-документів,
C ++ - універсальна мова системного програмування.

**Висновок.** Java (вимовляється Джава) — об'єктно-орієнтована мова програмування, випущена 1995 року компанією «Sun
Microsystems» як основний компонент платформи Java. З 2009 року мовою займається компанія «Oracle».

## 2. Віртуальна Java-машина, байт-код, JIT-компіляція. Категорії програм, написаних на мові Java.

Програми, написані на мові Java, є наборами класів і зберігаються в текстових файлах з розширенням .java. При компіляції
текст програми перекладається (транслюються) в двійкові файли з розширенням .class. Такі файли містять байт-код -
інструкції для абстрактного Java-процесора у вигляді байтових послідовностей команд цього процесора і даних до них.

**Для того, щоб байт-код був виконаний на будь-якому комп'ютері, він повинен бути переведений в інструкції для
відповідного процесора.** Саме цим і займається віртуальна Java-машина. Спочатку байт-код завжди інтерпретувався: кожен
раз, як зустрічалася якась інструкція Java-процесора, вона переводилася в послідовність інструкцій процесора комп'ютера.
Природно, це значно уповільнювало роботу додатків Java.

В даний час використовується більш складна схема, яка називається **JIT-компіляцією (Just-In-Time)** - компіляцією "по
ходу
справи", "нальоту". Коли будь-яка інструкція (або набір інструкцій) Java-процесора виконується в перший раз,
відбувається компіляція відповідного їй байт-коду із збереженням скомпільованого коду в спеціальному буфері. При
наступному виклику тієї ж інструкції замість її інтерпретації відбувається виклик з буфера скомпільованого коду. Тому
інтерпретація відбувається тільки при першому виклику інструкції.

Віртуальна Java-машина не тільки виконує байт-код (інтерпретує його, займається JIT-компіляцією та виконує JIT-компілює
код), а й виконує ряд інших функцій. Наприклад, взаємодіє з операційною системою, забезпечуючи доступ до файлів або
підтримку графіки. А також забезпечує автоматичне вивільнення пам'яті, зайнятої непотрібними об'єктами - так звану
збірку сміття (garbage collection).

Програми Java можна розділити на кілька основних категорій:

- **Додаток (application)** - аналог "звичайної" прикладної програми.
- **Аплет (applet)** - спеціалізована програма з обмеженими можливостями, що працює у вікні WWW-документа під
  управлінням
  браузера.
- **Сервлет (servlet)** - спеціалізована програма з обмеженими можливостями, що працює в WWW на стороні сервера.
  Використовується переважно в рамках технології JSP (Java Server Pages - серверних Сторінок Java) для програмування
  WWW-документів з боку сервера.
- **Серверний додаток (Enterprise application)** - призначено для багаторазового використання на стороні сервера.
- **Бібліотека** (Java Class Library - бібліотека класів, або NetBeans Module - модуль платформи NetBeans) - призначена
  для
  багаторазового використання програмами Java.

**Висновок.** Java -платформа має наступні переваги: переносимість, або кроссплатформність; об'єктна орієнтованість,
створена ефективна об'єктна модель; звичний синтаксис С / С ++; вбудована і прозора модель безпеки; орієнтація на
Internet-завдання, мережеві розподілені додатки; динамічність, легкість розвитку і додавання нових можливостей; простота
освоєння.

## 3. Середовища розробки Java-проектів

**IntelliJ IDEA** — інтегроване cередовище розробки програмного забезпечення багатьма мовами програмування. Community
версія середовища IntelliJ IDEA підтримує інструменти для проведення тестування TestNG і JUnit, системи контролю версій
CVS, Subversion, Mercurial і Git, засоби збирання Maven і Ant, мови програмування Java, Java ME, Scala, Clojure і
Groovy.

**Eclipse** є інтегрованим середовищем розробки, використовується для розробки програмного забезпечення під певну
платформу. Основна перевага роботи з Eclipse полягає в готових плагінах і модулях, які дуже просто встановити та
оновлювати. З їх допомогою можна персоналізувати інтерфейс Eclipse під конкретного користувача, встановити підтримку
необхідних мов програмування, поставити для кожного типу файлу свій редактор, налаштувати тип налагодження проекту.

**Висновок.** ІDEA - потужне середовище розробки мовою Java. Воно краще Eclipse в якості Java IDE.

## 4. Основні поняття ООП

**Об’єкт** означає об’єкт реального світу, такий як ручка, стілець, стіл, комп’ютер, годинник тощо.

**Об’єктно-орієнтоване програмування** – це методологія або парадигма для розробки програм з використанням класів та
об’єктів. Вона спрощує розробку та використання програмного забезпечення, надаючи деякі концепції:

- об’єкт;
- клас;
- успадкування;
- поліморфізм;
- абстрагування;
- інкапсуляція.’

Крім цих принципів, у об’єктно-орієнтованому програмуванні використовуються інші концепції:

- зв’язування;
- згуртованість;
- асоціація;
- агрегування;
- композиція.

### Клас

Клас можна визначити як шаблон, за яким можна створити окремий об’єкт. Клас не займає жодного місця.

### Об’єкт

Будь-яка сутність, яка має властивості та поведінку, відома як об’єкт. Наприклад, стілець, ручка, стіл, клавіатура,
велосипед тощо. Об’єкт може бути фізичним або логічним.

Об’єкт можна визначити як екземпляр класу. Об’єкт має адресу і займає деяке місце в пам’яті. Об’єкти можуть спілкуватись
між собою, не вдаючись до деталей даних або коду один одного. Єдине, що необхідно, – це тип прийнятого повідомлення та
тип відповіді, що повертається об’єктами. Наприклад, собака – це об’єкт, оскільки вона має такі стани, як колір, ім’я,
порода тощо, а також поведінку, наприклад, махає хвостом, гавкає, їсть тощо.

### Успадкування

Коли один об’єкт набуває всіх властивостей та поведінки батьківського об’єкта, це називається успадкуванням. Він
забезпечує повторне використання коду. Він використовується для досягнення поліморфізму під час виконання.

### Поліморфізм

Якщо одне завдання виконується по-різному, це називається поліморфізмом. Наприклад: переконати клієнта, намалювати щось,
наприклад, форму, трикутник, прямокутник тощо. У Java ми використовуємо перевантаження та перевизначення (заміну)
методів для досягнення поліморфізму. Інші приклади поліморфізму: собака гавкає тощо.

### Абстракція

Приховування внутрішніх деталей та демонстрація функціональності називається абстракцією. Наприклад, під час прийому
телефонного дзвінка нам невідомо, як проходить процес внутрішньої обробки сигналів. У Java ми використовуємо абстрактний
клас та інтерфейс для досягнення абстрагування.

### Інкапсуляція

Інкапсуляція Java є механізмом обгортання даних (змінних) і коду, що працює з даними (методами), в одне ціле. В
інкапсуляції змінні класу будуть приховані від інших класів і доступ до них можна отримати лише за допомогою методу їх
поточного класу. Інакше це називається прихованням даних.
Для досягнення інкапсуляції в Java:

```text
- Оголосіть змінні класу як private.
- Надайте public до методів встановлення та отримання (сеттеру та геттеру) для зміни та перегляду значень змінних.	```
```

### Зв’язування

Зв’язування відноситься до знань або інформації або залежності іншого класу. Зв’язування виникає тоді, коли класи
використовують один одного. Якщо клас містить детальну інформацію про інший класу, то існує сильний зв’язок. У Java ми
використовуємо приватні, захищені та відкриті модифікатори для відображення рівня видимості класу, методу та поля. Ви
можете використовувати інтерфейси для слабшого зв’язку у випадку відсутності конкретної реалізації.

### Згуртованість

Згуртованість відноситься до рівня компонента, який виконує єдине чітко визначене завдання. Єдине чітко визначене
завдання виконується дуже згуртованим методом. Слабо згуртований метод розділить завдання на окремі частини. Пакет
java.io – це дуже згуртований пакет, оскільки він має класи та інтерфейс, пов’язані з введенням-виведенням. Однак пакет
java.util є слабо згуртованим, оскільки має непов’язані класи та інтерфейси.

### Асоціація

Асоціація означає зв’язок між об’єктами. Тут один об’єкт може бути пов’язаний з одним об’єктом або з багатьма об’єктами.
Між об’єктами може бути чотири типи зв’язку:

```text
- один до одного;
- один до багатьох;
- багато до одного;
- багато до багатьох.
```

Давайте розберемося у відносинах на прикладах у реальному часі. Наприклад, в одній країні може бути один
прем’єр-міністр (один до одного), а у прем’єр-міністра може бути багато міністрів (один до багатьох). Крім того, багато
депутатів можуть мати одного прем’єр-міністра (багато до одного), а багато міністрів можуть мати багато відомств (багато
до багатьох).

### Агрегування

Агрегування – це спосіб досягнення асоціації. Агрегування передбачає такі відносини, коли один об’єкт містить інші
об’єкти як частину свого стану. Це спосіб, який забезпечує слабкий зв’язок між об’єктами. Це ще один спосіб повторного
використання об’єктів.

### Композиція

Композиція також є способом досягнення асоціації. Композиція – це відносини, при якому один об’єкт містить інші об’єкти
як частину свого стану. Між об’єктом, що містить інші об’єкти, і залежним об’єктом існує міцний зв’язок. Це стан, коли
об’єкти, що містять інші об’єкти, не мають незалежного існування. Якщо видалити батьківський об’єкт, усі дочірні об’єкти
будуть видалені автоматично.

### Переваги ООП над процедурно-орієнтованим програмуванням

1. На відміну від процедурно-орієнтованого програмування ООП полегшує розробку та використання програм у випадку
   зростання коду із збільшенням розміру проєкту.
2. ООП забезпечує приховування даних, тоді як у процедурно-орієнтованій мові програмування до глобальних даних можна
   отримати доступ із будь-якого місця.
3. ООП дає можливість значно ефективніше імітувати події в реальному світі.

## 2. Правила іменування Java

Правила іменування Java – це правила, яких слід дотримуватися, коли потрібно назвати свої ідентифікатори, такі як клас,
пакет, змінна, константа, метод тощо.
Правила іменування запропоновані кількома спільнотами Java, такими як Sun Microsystems та Netscape. Усі класи,
інтерфейси, пакети, методи та поля мови програмування Java наведені згідно з умовами іменування Java. Якщо не
дотримуватись цих правил, то це може призвести до плутанини або помилкового коду.

### Перевага правил іменування в Java

Дотримання стандартних правил іменування Java полегшує читання коду програми, при цьому менше часу витрачається на
з’ясування того, що робить код. Нижче наведені основні правила, яких потрібно дотримуватись, надаючи назву кожному
ідентифікатору: - ім’я не повинно містити пробілів; - ім’я не повинно починатися зі спеціальних символів, таких як & (
амперсанд), $ (долар), _ (підкреслення). Давайте розглянемо інші правила, яких слід дотримуватись під час іменування
ідентифікаторів.

### Клас

```text
- Починати слід з великої літери;
- це має бути іменник, такий як Color, Button, System, Thread тощо;
- використовуйте відповідні слова замість скорочень. Приклад:
```

```java
public class Employee {
    // фрагмент коду
}
```

### Інтерфейс

```text
- Починати слід з великої літери;
- це має бути прикметник, як Runnable, Remote, ActionListener;
- використовуйте відповідні слова замість скорочень. Приклад:
```

```java
interface Printable {
    // фрагмент коду
}
```

### Змінна

```text
- Повинна починатися з малої літери;
- вона не повинна починатися зі спеціальних символів, таких як & (амперсанд), $ (долар), _ (підкреслення);
- якщо назва містить кілька слів, почніть її з малої літери, а потім із великої літери, наприклад firstName, lastName;
- уникайте використання односимвольних змінних, таких як x, y, z.
```

Приклад:

```java
class Employee {
    // змінна
    int id;
    // фрагмент коду
}
```

### Пакет

```text
- Він має записаним малими літерами, наприклад java, lang; 
- якщо назва містить кілька слів, її слід розділити крапками (.), Такими як java.util, java.lang.
```

Приклад:

```java
package com.javatpoint; // пакет

class Employee {
// фрагмент коду
}
```

### Константа

```text
- Вона має бути написана великими літерами, такими як RED, YELLOW;
- якщо назва містить кілька слів, її слід відокремити підкресленням (_), таким як MAX_PRIORITY;
- вона може містити цифри, але не на першому місці. Приклад:
```

```java
class Employee {
    // константа
    static final int MIN_AGE = 18;
// фрагмент коду
}
```

### CamelCase в найменуваннях Java

Java дотримується синтаксису верблюжого регістру для іменування класу, інтерфейсу, методу та поля. Якщо ім’я поєднує два
слова, друге слово має завжди починатися з великої літери, наприклад actionPerformed(), firstName, ActionEvent,
ActionListener тощо.
