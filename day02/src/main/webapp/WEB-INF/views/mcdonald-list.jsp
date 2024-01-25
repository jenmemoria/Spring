<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="home.jsp" %>

<section class="frame">
	<div>
		<a href="${cpath }/mcdonald/add"><button>추가</button></a>
	</div>
	
	<div class="box">
		<c:forEach var="dto" items="${list }">
		<div class="item">
			<div class="img">
			<!-- 여기서 씨패스 하는 이유는 내 컴퓨터에 저장된거에서 가져오는 거니까 -->
			<!-- 인터넷에서 주소 복사해서 가녀오면 그냥 바로 dto.~~ 박으면 돼 -->
			<a href="${cpath }/mcdonald/view/${dto.idx }">
				<img src="${cpath }/resources/image/${dto.imgName}" height="120"></a>
			</div>
			<div class="name">${dto.name }</div>
			<div class="price">${dto.price }원</div>
		</div>
		</c:forEach>
	</div>
</section>

</body>
</html>

<%-- <c:forEach var="dto" items="${list }">
<div>${dto.name }</div>
<div><img src="${cpath }/resources/image/${dto.imgName}" height="120"></div>
<div>${dto.price }</div>
</c:forEach> --%>

