<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<h3>${dto.productName }</h3>

<section>
	<div>
		<div><img src="${cpath }/upload/${dto.productImage }" width="300px"></div>
		<div><h3>${dto.price }원</h3></div>
		<div><h4>${dto.amount }개</h4></div>
	</div>
</section>

<div style="display: flex; width: 800px; margin: 20px auto;">
	<div></div>
	<div>
		<a href="${cpath }/product/modify/${dto.idx}"><button>재고 수정</button></a>
		<a href="${cpath }/product/delete/${dto.idx}"><button>상품 삭제</button></a>
	</div>
	
</div>

</body>
</html>