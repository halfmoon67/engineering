<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="empJoin" method="get" name="frm"> <!-- 공개:get or 비공개:post -->
<table border=1 width="500" align="center">
	<tr><td width="130">직원번호</td>
		<td width="370">
			<input type="text" name="empNo">
		</td></tr>
	<tr><td>아이디</td>
		<td>
			<input type="text" name="empId">
		</td></tr>
	<tr><td>비밀번호</td>
		<td>
			<input type="password" name="empPw">
		</td></tr>
	<tr><td>비밀번호 확인</td>
		<td>
			<input type="password" name="empPwCon">
		</td></tr>
	<tr><td>이름</td>
		<td>
			<input type="text" name="empName">
		</td></tr>
	<tr><td>부서명</td>
		<td>
			<input type="text" name="empDeptNum">
		</td></tr>
	<tr><td>이메일</td>
		<td>
			<input type="text" name="empEmail">
		</td></tr>
	<tr><td>연락처</td>
		<td>
			<input type="text" name="empPhoneNum" 
					placeholder="000-0000-0000">
		</td></tr>
	<tr><td>입사일</td>
		<td>
			<input type="text" name="hireDate" 
					placeholder="0000-00-00">
		</td></tr>
	<tr><td>급여</td>
		<td>
			<input type="text" name="salary">
		</td></tr>
	<tr><td colspan=2>
		<input type="submit" value="직원등록 완료">
		<input type="reset" value="초기화">
	</td></tr>
</table>
</form>
</body>
</html>