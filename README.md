# Fantym Utility Mod

Полезный утилитарный мод для сервера Fantym Minecraft 1.21.6

## 🎮 Особенности

- ⚡ Красивый GUI интерфейс
- 🔧 Множество утилитарных функций
- 🎨 Темный стиль интерфейса
- 🌍 Поддержка русского языка
- ⌨️ Горячая клавиша (U) для быстрого доступа

## 📋 Требования

- Minecraft 1.21.6
- Fabric Loader 0.16.9+
- Java 21+

## 🚀 Установка

1. Скачайте последнюю версию мода из репозитория
2. Поместите JAR файл в папку `mods` вашего Minecraft
3. Запустите игру через Fabric профиль

## ⌨️ Управление

- **U** - Открыть/закрыть GUI мода
- **ESC** - Закрыть окно мода

## 🛠️ Функции

### 1. 📍 Телепортация
Быстрая телепортация в предварительно сохраненные точки

### 2. ℹ️ Информация
Показывает информацию о моде и версии

### 3. ✨ Эффекты
Включает специальные визуальные эффекты

### 4. ⚙️ Настройки
Открывает панель настроек мода

## 🔨 Разработка

### Сборка из исходного кода

```bash
# Клонируем репозиторий
git clone https://github.com/levvokhmanov-hub/fantym-utility-mod.git
cd fantym-utility-mod

# Собираем проект
./gradlew build

# JAR файл будет находиться в: build/libs/
```

### Структура проекта

```
fantym-utility-mod/
├── src/main/java/
│   └── com/fantym/mod/
│       ├── FantymUtilityMod.java          # Главный класс мода
│       ├── FantymUtilityModClient.java    # Client инициализация
│       └── screen/
│           └── UtilityModScreen.java      # GUI экран
├── src/main/resources/
│   ├── fabric.mod.json                    # Метаданные мода
│   └── assets/fantym_utility_mod/
│       └── lang/
│           ├── en_us.json                 # Английский язык
│           └── ru_ru.json                 # Русский язык
├── build.gradle                            # Gradle конфигурация
└── gradle.properties                       # Свойства Gradle
```

### Добавление новой функции

1. Добавьте кнопку в `UtilityModScreen.java`:
```java
this.addDrawableChild(ButtonWidget.builder(
    Text.literal("📦 Новая функция"),
    button -> handleNewFeature()
).dimensions(centerX - buttonWidth / 2, centerY + 100, buttonWidth, buttonHeight)
    .build());
```

2. Реализуйте обработчик:
```java
private void handleNewFeature() {
    FantymUtilityMod.LOGGER.info("Новая функция активирована");
    if (this.client != null && this.client.player != null) {
        this.client.player.sendMessage(
            Text.literal("§6[Мод] §eНовая функция работает!"),
            false
        );
    }
}
```

## 📄 Лицензия

MIT License

## 👨‍💻 Автор

- **levvokhmanov-hub** - Разработчик

---

**Версия:** 1.0.0
