<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>News- Регистрация</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Дата регистрации</th>
    </tr>
    <#list model.users as user>
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.registrationTime}</td>
    </tr>
    </#list>
</table>
</body>
</html>