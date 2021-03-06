<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <table class="table table-striped">
        <caption>This is the list of our users:</caption>
        <thead>
        <tr>
            <th>user id</th>
            <th>username</th>
            <th>userpass</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
            <tr>
            	<td>${user.id}</td>
            	<td>${user.username}</td>
            	<td>${user.password}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@ include file="common/footer.jspf" %>