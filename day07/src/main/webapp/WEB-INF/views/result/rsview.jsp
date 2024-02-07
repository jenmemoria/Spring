<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<h3>설문 결과</h3>
<hr>

<div>
	<div>
		<h4>${dto.option1 }</h4>
		<img src="${cpath }/upload/${dto.imageA }" height="150px;">
		<div>득표 수 : ${dto.choice1Count } (${dto.choice1Rate }%)</div>
	</div>
	<div>
		<h4>${dto.option2 }</h4>
		<img src="${cpath }/upload/${dto.imageB }" height="150px;">
		<div>득표 수 : ${dto.choice2Count } (${dto.choice2Rate }%)</div>
	</div>
</div>

</body>
</html>