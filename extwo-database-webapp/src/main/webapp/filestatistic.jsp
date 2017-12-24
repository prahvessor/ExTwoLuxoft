<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>File Statistics</title>
    <script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js'></script>
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
                                    </tr>
                                    <tbody>
                                        <tr>
                                            <td>${fileStatistic.idFile}</td>
                                            <td>${fileStatistic.longestFileWord}</td>
                                            <td>${fileStatistic.shortestFileWord}</td>
                                            <td>${fileStatistic.avgFileWord}</td>
                                            <td>${fileStatistic.avgFileLineLength}</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <br>
                            <script type="text/javascript">
                                jQuery(document).ready(function(){
                                    jQuery('#${fileStatistic.idFile}').click(function(){
                                        jQuery(this).load('/linestatistic?id=${fileStatistic.idFile}');
                                    })
                                });
                            </script>
                            <div class="example cursor" id="${fileStatistic.idFile}">Show line statistics</div>
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
