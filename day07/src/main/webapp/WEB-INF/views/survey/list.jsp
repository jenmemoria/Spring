<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<h3>설문 참여</h3>
<hr>

<table>
<thead>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
	</tr>
</thead>
<tbody>
<c:forEach var="dto" items="${list }">
	<tr>
		<td>${dto.idx }</td>
		<td>
			<a href="${cpath }/survey/view/${dto.idx}">${dto.title }</a>
		</td>
		<td>${dto.writer }</td>
	</tr>
</c:forEach>
</tbody>
</table>

<table></table>
</body>
</html>