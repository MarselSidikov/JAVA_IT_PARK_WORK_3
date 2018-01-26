<#ftl encoding='UTF-8'>
<html>
<head>
    <title>News- Регистрация</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<#include 'common/header.ftl'/>
<form class="form-style-4" title="Регистрация"
      name="registrationForm"
      method="post"
      action="/registration">
    <input type="text" name="name" placeholder="Имя"/>
    <br>
    <input type="text" name="surname" placeholder="Фамилия"/>
    <br>
    <input type="text" name="email" placeholder="Почта"/>
    <br>
    <input type="password" name="password" placeholder="Пароль"/>
    <br>
    <textarea name="description" onkeyup="adjust_textarea(this)"></textarea>
    <input type="submit"/>
</form>
</body>
</html>