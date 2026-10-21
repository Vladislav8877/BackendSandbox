# BackendSandbox
Практический репозиторий по Java Backend: небольшие упражнения и эксперименты по темам backend. Каждая тема лежит в отдельном Maven-модуле со своими зависимостями и точкой входа.
Крупные проекты (итоговые работы по модулям и основной проект **employeeRegistry**) живут в отдельных репозиториях и здесь только перечислены.

## Стек
- Java 21
- Maven (multi-module)
- Spring Framework
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
- [ ] Введение: роль Spring, экосистема, зависимости между классами
- [ ] Inversion of Control (IoC) и ApplicationContext
- [ ] Dependency Injection (DI): способы внедрения зависимостей
- [ ] Создание бинов: Java-конфигурация, аннотации, XML
- [ ] Жизненный цикл бина
- [ ] Scope бинов: Singleton, Prototype
- [ ] Внешние файлы свойств (.properties)
- [ ] Aspect-Oriented Programming (AOP)
- [ ] Итоговая работа: консольное банковское приложение (отдельный репозиторий)

### Следующие модули
---

## Рабочий процесс
- Ветка на тему или версию, небольшие коммиты в формате `feat:`, `refactor:`, `test:`, `docs:`, `chore:`
- Изменения в `main` попадают через Pull Request
- Ruleset на `main`: запрет удаления ветки, запрет force push