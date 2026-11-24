# BackendSandbox
Практический репозиторий по Java Backend: небольшие упражнения и эксперименты по темам backend. Каждая тема лежит в отдельном Maven-модуле со своими зависимостями и точкой входа.
Крупные проекты (итоговые работы по модулям и основной проект **employeeRegistry**) живут в отдельных репозиториях и здесь только перечислены.

## Стек
- Java 21
- Maven (multi-module)
- Spring Framework 7.0.9
- Git / GitHub (ветки, Pull Request, теги)

## Структура репозитория
```
BackendSandbox/
├── pom.xml                      # родительский pom (packaging = pom)
├── 01-spring-core-intro/        # введение в Spring Core
└── ...                          # новые модули добавляются по мере прохождения тем
```

Каждый модуль собирается независимо:
```
mvn -pl 01-spring-core-intro verify
```

Сборка всех модулей:
```
mvn verify
```

## Программа и прогресс
### Spring Core
- [x] Введение: роль Spring, экосистема, зависимости между классами
- [x] Inversion of Control (IoC) и ApplicationContext
- [ ] Dependency Injection (DI): способы внедрения зависимостей
- [ ] Создание бинов: Java-конфигурация, аннотации, XML
- [ ] Жизненный цикл бина
- [ ] Scope бинов: Singleton, Prototype
- [ ] Внешние файлы свойств (.properties)
- [ ] Aspect-Oriented Programming (AOP)
- [ ] Итоговая работа: консольное банковское приложение (отдельный репозиторий)

### Практика по пакетам: 01-spring-core-intro
Путь: `01-spring-core-intro/src/main/java/io/github/vladislav8877/springcore/`. В каждом пакете своя точка входа с `main`, запуск: Run рядом с `main`.

#### IoC и ApplicationContext
| Пакет | Что показывает |
|-------|----------------|
| `step1_problem` | Жёсткая связность: `NotificationManager` сам создаёт `EmailService` через `new` |
| `step2_di` | DI через конструктор, заглушка `FakeEmailService` для теста |
| `step2b_di_interface` | Зависимость от интерфейса `MessageSender`: две реализации и лямбда |
| `step3_javaconfig` | Java-конфиг: `@Configuration`, `@Bean`, `ApplicationContext`, singleton, имена бинов |
| `step4_scan` | `@Component` и `@ComponentScan`, анти-паттерн с `new` внутри бина |
| `step5_sorokin` | Пример написания scan от Павла Сорокина |
| `step6_example` | Очень полезные примеры и их краткое описание - когда нужно использовать Spring с интерфейсом |

### Следующие модули
---

## Рабочий процесс
- Ветка на тему или версию, небольшие коммиты в формате `feat:`, `refactor:`, `test:`, `docs:`, `chore:`
- Изменения в `main` попадают через Pull Request
- Ruleset на `main`: запрет удаления ветки, запрет force push