<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<#include 'common/header.ftl'/>
<!doctype html>
<html lang="en">
<head>
    <title>Главная страница</title>
</head>
<body>
<#if model.user??>
<div>
    ${model.user.id}
    <br>
    ${model.user.name}
</div>
<#else>
<div>
    <a href="/login">Войти</a>
</div>
</#if>
</body>
</html>
