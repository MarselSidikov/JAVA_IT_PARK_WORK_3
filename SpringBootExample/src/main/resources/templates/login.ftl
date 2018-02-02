<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>News- Вход</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<#if model.error == true>
    <h1>Неверно введен имя пользователяи пароль</h1>
</#if>
<form class="form-style-4" title="Регистрация"
      name="registrationForm"
      method="post"
      action="/login">
    <br>
    <input type="text" name="email" placeholder="Почта"/>
    <br>
    <input type="password" name="password" placeholder="Пароль"/>
    <input type="checkbox" name="remember-me">Запомнить
    <br>
    <input type="submit">
</form>
</body>
</html>