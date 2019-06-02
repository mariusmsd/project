<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <form:form method="get" action="/list-users" modelAttribute="user">
        <form:hidden path="id"/>
        <fieldset class="form-group">
            <form:label path="name">user id</form:label>
            <form:input path="name" type="text" class="form-control" required="required"/>
            <form:errors path="name" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="form-group">
            <form:label path="type">username</form:label>
            <form:input path="type" type="text" class="form-control" required="required"/>
            <form:errors path="type" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="form-group">
            <form:label path="price">userpass</form:label>
            <form:input path="price" type="text" class="form-control" required="required"/>
            <form:errors path="price" cssClass="text-warning"/>
        </fieldset>

    </form:form>
</div>

<%@ include file="common/footer.jspf" %>