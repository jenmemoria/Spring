<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<style>
	table {
		border-collapse: collapse;
		width: 800px;
		margin: 20px auto;
	}
	td, th {
		padding: 10px;
	}
	thead > tr {
		background-color: silver;
	}
	tbody > tr {
		border-bottom: 1px solid grey;
	}
	tbody > tr:hover {
		background-color: #eee;
	}
	thead > tr > th:nth-child(1) { width: 10%; }
	thead > tr > th:nth-child(2) { width: 50%; }
	thead > tr > th:nth-child(3) { width: 10%; }
	thead > tr > th:nth-child(4) { width: 15%; }
	tbody > tr > td {
		text-align: center;
	}
	tbody > tr > td:nth-child(2) {
	text-align: left;	
}
</style>

<h3>상품 리스트</h3>

<table>
<thead>
	<tr>
		<th>번호</th>
		<th>상품 이름</th>
		<th>가격</th>
		<th>재고</th>
	</tr>

</thead>
<tbody>
	<c:forEach var="dto" items="${list }">
		<tr>
			<td>${dto.idx }</td>
			<td>
				<a href="${cpath }/product/view/${dto.idx}">${dto.productName }</a>
			</td>
			<td>${dto.price }</td>
			<td>${dto.amount }</td>
		</tr>
	</c:forEach>
</tbody>
</table>

<div style="display: flex; width: 800px;">
	<div></div>
	<div>
		<a href="${cpath }/product/add"><button>상품 등록</button></a>
	</div>
</div>
</body>
</html>