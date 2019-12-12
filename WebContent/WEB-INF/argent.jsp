<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>MoneyWeb</title>
	</head>
	<body>
		<form method="post" action="argentContent">
			<p>
				<label for="amoun01t">Amount :</label>
				<input type="text" id="amount01" name="amount01" />
				<label for="currency01">Currency :</label>
				<select id="currency01" name="currency01"  size="1">
					<option>EUR</option>
					<option>USD</option>
					<option>GBP</option>
					<option>CHF</option>
				</select>
			</p>
			
						<p>
				<label for="amount02">Amount :</label>
				<input type="text" id="amount02" name="amount02" />
				<label for="currency02">Currency :</label>
				<select id="currency02" name="currency02"  size="1">
					<option>EUR</option>
					<option>USD</option>
					<option>GBP</option>
					<option>CHF</option>
				</select>
			</p>
			
			<input type="submit" value="Add">
		</form>
		
		<c:if test="${! empty poche }">			
			<p>
				<c:forEach items="${poche.getPortefeuil()}" var="money" begin="0" end="100">
					<p><c:out value="${ money.getfAmount() } ${ money.getfCurrency() }"></c:out></p>	
				</c:forEach>
			</p>
			
		</c:if>


	</body>
</html>