<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<div class="container mt-3">
  <h2>포스트 등록</h2>
  <form >
    <div class="mb-3 mt-3">
      <label for="title">제목:</label>
      <input type="text" class="form-control" id="title" placeholder="Enter title" name="title">
    </div>
    <div class="mb-3">
      <label for="content">내용:</label>
      <input type="text" class="form-control" id="content" placeholder="Enter content" name="content">
    </div>

    <button id="btn-insertPost" type="submit" class="btn btn-primary">포스트 등록</button>
  </form>
</div>

<script src="post.js"></script>
</body>
</html>