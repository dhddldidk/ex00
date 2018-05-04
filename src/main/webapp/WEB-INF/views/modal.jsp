<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<button type="button" class="btn btn-danger" data-target="#myModal"
			data-toggle="modal">로그인</button>
	<br>
	<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
        	<!-- data-dismiss="modal" 닫게 해줌 -->
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">로그인</h4>
        </div>
        <div class="modal-body">
          <form>
			<div class="form-group">
				<label for="id">아이디</label>
				<input type="text" placeholder="아이디" class="form-control" id="id">
			</div>
			<div class="form-group">
				<label for="pw">비밀번호</label>
				<input type="password" placeholder="비밀번호" class="form-control" id="pw">
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">전송</button>
			</div>
		</form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-primary" data-dismiss="modal">닫기</button>
        </div>
      </div>
      
    </div>
  </div>
</body>
</html>