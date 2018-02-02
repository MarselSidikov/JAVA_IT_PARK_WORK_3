<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<#include 'common/header.ftl'/>
<head>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
</head>
<body>
<h1>Привет, ${model.user.name}</h1>
<input id="fileInput" type="file" placeholder="Выбрать файл">
<button name="uploadButton" onclick="uploadFile(
    document.getElementById('fileInput')['files'][0])">Загрузить</button>
</body>
