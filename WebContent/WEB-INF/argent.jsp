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
		<p> <c:out value="<p>Bonjour Money Money from JSTL</p>"/></p>
		<p> <c:out value="J'ai ${ monGrisbis.getfAmount()  } ${ monGrisbis.getfCurrency() } from JSTL"/></p>
		
		<p> <c:out value="J'ai ${ monGrisbis02.getfAmount()  } ${ monGrisbis02.getfCurrency() } from JSTL" default="\"Touche pas au Grisbis SALOPE !!!\"" escapeXml="false"/></p>
		
		<c:set var="pseudoPage" value="zak39Page01" scope="page"/>
		<p><c:out value="${ pseudoPage }"></c:out></p>
		<c:set var="pseudoPage" value="zak39Page02" scope="page"/>
		<p><c:out value="${ pseudoPage }"></c:out></p>
		
		<c:set var="pseudoRequest" value="zak39Request" scope="request"/>
		<c:set var="pseudoSession" value="zak39Session" scope="session"/>
		<c:set var="pseudoApplication" value="zak39Application" scope="application"/>
		
		<form method="post" action="argentContent">
			<p>
				<label for="login">Login :</label>
				<input type="text" id="login" name="login" />
				<input type="submit">
			</p>
			
			<p>
				<label for="pass">Mot de passe :</label>
				<input type="password" id="pass" name="pass" />
				<input type="submit">
			</p>
		</form>
		
		<c:if test="${! empty form.resultat }">
			<p><c:out value="${form.resultat}"></c:out></p>
		</c:if>
		
		<p>Bonjour Money Money !</p>
		<p>Vive le capitalisme !!!</p>
		<p><%
			String variable = (String) request.getAttribute("variable");
			out.println(variable);
		%></p>
	
		<p>Je suis en ${ !empty currency ? currency : '' }</p>
		
		<p>
			J'ai ${ monGrisbis.getfAmount()  } ${ monGrisbis.getfCurrency()  }
		</p>
	
		
		<c:set target="${ monGrisbis }" property="fAmount" value="350"></c:set>
		<c:out value="J'ai ${ monGrisbis.getfAmount()  } ${ monGrisbis.getfCurrency()  } from JSTL"></c:out>
	
		<c:remove var="peudoPage" scope="page"/> <!-- Permet de supprimer la variable de la memoire -->
		<c:if test="${50 > 10 }" var="variable" scope="session"> 
			<p><c:out value="C'est vrai 50 est supérieur à 10 !"></c:out></p>
		</c:if>
		
		<c:choose>
			<c:when test="${ variable02 }">La variable02 existe !</c:when>
			<c:when test="${ variable03 }">La variable03 existe !</c:when>
			<c:otherwise>Il n'y a pas de variableXX !!!</c:otherwise>
		</c:choose>
		
		<c:forEach var="i" begin="0" end="10" step="2">
		
		<p>Un message n°<c:out value="${ i }"></c:out>!</p>
		
		</c:forEach>
		
		<c:forEach items="${titres}" var="titre" begin="0" end="2" varStatus="status">
			<p>n°<c:out value="${status.index }"></c:out> <c:out value="${titre}"></c:out> </p>	
		</c:forEach>
		
		<c:forTokens var="morceau" items="Un élément/Encore un autre élément/Un dernier pour la route" delims="/ ">
			<p> <c:out value="${morceau}"></c:out> </p>
		</c:forTokens>
		
		<p>
	    <%
        for (int i = 0 ; i < 20 ; i++) {
            out.println("Une nouvelle ligne !<br />");
        }
    	%>
		</p>

	</body>
</html>