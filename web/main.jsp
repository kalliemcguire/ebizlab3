<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Company Name</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <p2>Welcome, ${employee.firstName} ${employee.lastName}!</p2>
        <form action="timecard" method="post">
            <input type="hidden" name="option" value="list">
            <input type="submit" value="Select" style="margin-left">
            <label> Process time cards </label> 
        </form>
        <form action="login.jsp" method="post">
            <input type="hidden" name="option" value="return">
            <input type="submit" value="Select" style="margin-left">
            <label> Exit </label>
        </form>
        <form action="calculatepayroll.jsp" method="post">
            <input type="hidden" name="option" value="list">
            <input type="submit" value="Select" style="margin-left">
            <label> Calculate payroll </label>
        </form>
    </body>
</html>