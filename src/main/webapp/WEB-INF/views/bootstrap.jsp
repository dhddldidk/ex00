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
<style type="text/css">
	/* .row .nav li{
		width:300px;
		height:60px;
		line-height:60px;
		border:1px solid red;
		padding-left: 20px;
	} */
</style>

</head>
<body>
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Project Name</a>
    </div>
    <!-- <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
    </ul> -->
    
    <ul class="nav navbar-nav navbar-right">
    <li><form class="navbar-form navbar-left" action="/action_page.php">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form></li>
      <li><a href="#"><span></span> Dashboard</a></li>
      <li><a href="#"><span></span> Settings</a></li>
      <li><a href="#"><span></span> Profile</a></li>
      <li><a href="#" data-target="#myModal" data-toggle="modal"><span ></span> 로그인</a>
      	<!-- <button type="button" class="btn btn-danger" data-target="#myModal"
			data-toggle="modal">로그인</button>
	<br> -->
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
      
      </li>
    </ul>
  </div>
</nav>

	<div class="row">
		<div class="col-md-2">
			<ul class="nav">
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
				<li><a href="#">메뉴1</a></li>
			</ul>
		</div>
		<div class="col-md-10">
<button type="button" class="btn btn-primary btn-block">Button 1</button>
<button type="button" class="btn btn-default btn-block">Button 1</button>
			<table class="table table-striped">
				<thead>
				<tr>
					<th>#</th>
					<th>Header</th>
					<th>Header</th>
					<th>Header</th>
					<th>Header</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1001</td>
					<td>body</td>
					<td>body</td>
					<td>body</td>
					<td>body</td>
				</tr>
				<tr>
					<td>1001</td>
					<td>body</td>
					<td>body</td>
					<td>body</td>
					<td>body</td>
				</tr>
				<tr>
					<td>1001</td>
					<td>body</td>
					<td>body</td>
					<td>body</td>
					<td>body</td>
				</tr>
				<tr>
					<td>1001</td>
					<td>body</td>
					<td>body</td>
					<td>body</td>
					<td>body</td>
				</tr>
				<tr>
					<td>1001</td>
					<td>body</td>
					<td>body</td>
					<td>body</td>
					<td>body</td>
				</tr>
			</tbody>
			</table>
		
		</div>
	</div>


</body>
</html>