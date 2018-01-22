<#ftl encoding='UTF-8'>
<html>
<head>
    <title>News- Регистрация</title>
</head>
<body>
<form title="Регистрация"
      name="registrationForm"
      method="post"
      action="/registration">
    <input type="text" name="name" placeholder="Имя"/>
    <input type="text" name="surname" placeholder="Фамилия"/>
    <input type="text" name="email" placeholder="Почта"/>
    <input type="password" name="password" placeholder="Пароль"/>
    <input type="submit"/>
</form>
</body>
</html>