<%--
  Created by IntelliJ IDEA.
  User: aspire
  Date: 3/23/21
  Time: 8:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form action="student" method="post">
            <tr>
                <td>Name</td>
                <td><input name="name"/></td>
            </tr>
            <tr>
                <td>Surname</td>
                <td><input name="surname"/></td>
            </tr>
            <tr>
                <td>Course</td>
                <td><input name="course"/></td>
            </tr>
            <tr>
                <td>year</td>
                <td><input name="year"/></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td><input name="gender"/></td>
            </tr>
            </table>
            <input type="submit"/>
        </form>
    </div>
</body>
</html>
