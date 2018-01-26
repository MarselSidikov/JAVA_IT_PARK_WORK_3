<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>News- Регистрация</title>
</head>
<body>
<#include 'common/header.ftl'/>
    <h1>Поздравляем, письмо для подтверждения регистрации отправлено на
        - ${model.email}</h1>
</body>
</html>