<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="title">Line statistics</div>
<table>
    <tr>
        <th>id line</th>
        <th>id file</th>
        <th>longest word</th>
        <th>shortest word</th>
        <th>average word</th>
        <th>line length</th>
    </tr>
    <tbody>
        <c:forEach items="${requestScope.lineStatistic}" var="lineStatistic">
            <tr>
                <td>${lineStatistic.idLine}</td>
                <td>${lineStatistic.idFile}</td>
                <td>${lineStatistic.longestWord}</td>
                <td>${lineStatistic.shortestWord}</td>
                <td>${lineStatistic.avgWord}</td>
                <td>${lineStatistic.lineLength}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

