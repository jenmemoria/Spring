<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>


<h3>게시글 조회</h3>
<hr>

<form method="POST" enctype="multipart/form-data">
	<div>${dto.idx }${dto.title }</div>
	<div>작성자 : ${dto.writer }</div>
	<div style="display: flex; ">
		<div>
			<img src="${cpath }/upload/${dto.imageA}" height="150px">
			<label><input type="radio" name="choice" value="1" checked>${dto.contentA }</radio></label>
		</div>
		<div>
			<img src="${cpath }/upload/${dto.imageB}" height="150px">
			<label><input type="radio" name="choice" value="2">${dto.contentB }</radio></label>
		</div>
	</div>
	<p><input type="submit" value="설문 제출"></p>
</form>
<%-- <table>
	<tr>
		<td>${dto.idx }${dto.title }</td>
	</tr>
	<tr>
		<td>작성자 : ${dto.writer }</td>
	</tr>
	<tr>
		<td>
			<img src="${cpath }/upload/${dto.imageA}" height="150px">
			<pre>${dto.contentA }</pre>
		</td>
		<td>
			<img src="${cpath }/upload/${dto.imageB}" height="150px">
			<pre>${dto.contentB }</pre>
		</td>
	</tr>
</table> --%>

<div>
	<div></div>
	<div>
		
	</div>
</div>
</body>
</html>