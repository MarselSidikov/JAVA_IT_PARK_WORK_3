<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Подтвреждение</title>
</head>
<body>
<#include 'common/header.ftl'/>
<#if model.result == true>
    <h1>Вы успешно подтвердили почту</h1>
<#else>
    <h1>Ссылка не верна, либо истекло время жизни</h1>
</#if>
</body>
</html>