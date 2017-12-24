<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>File Statistics</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>

<div id="main_container">
    <div class="center_content">
        <div class="center_left">
            <div class="welcome_box">
                <p class="welcome">
                    <span class="orange">Task 2</span><br />
                    Implement web-interface for viewing collected statistic using Servlet/JSP + HTML/CSS/JS.
                </p>
            </div>
            <div class="features">
                <div class="title">File statistics</div>
                <ul class="list">
                    <c:forEach items="${requestScope.fileStatistic}" var="fileStatistic">
                        <li><span>${fileStatistic.idFile}</span>
                            <div class="example">
                                <table>
                                    <tr>
                                        <th>id file</th>
                                        <th>longest word</th>
                                        <th>shortest word</th>
                                        <th>average word</th>
                                        <th>average line length</th>
                                        <th>show result</th>
                                    </tr>
                                    <tbody>
                                        <tr>
                                            <td>${fileStatistic.idFile}</td>
                                            <td>${fileStatistic.longestFileWord}</td>
                                            <td>${fileStatistic.shortestFileWord}</td>
                                            <td>${fileStatistic.avgFileWord}</td>
                                            <td>${fileStatistic.avgFileLineLength}</td>
                                            <td id="load-result${fileStatistic.idFile}"><a href="#">show line statistic</a></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <div class="example" id="container${fileStatistic.idFile}">
                                <script>
                                    $('#load-result${fileStatistic.idFile} a').on('click', function(){
                                        $('#container${fileStatistic.idFile}').load('/linestatistic?id=${fileStatistic.idFile}');
                                    });
                                </script>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>
</body>
</html>
