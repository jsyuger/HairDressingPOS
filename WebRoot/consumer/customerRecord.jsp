<%@ page contentType="text/html;charset=gbk" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
	<title>customer</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">   
	<script src="js/js/jquery.min.js"></script>
	<script src="js/js/bootstrap.min.js"></script>
</head>
<!-- <body onload="javascript:$('#showrecord2').hide();"> -->
<body>

	<div id="showrecord">		
					<table border="1" class="table table-condensed">
					<caption>用户消费记录</caption>
						<tr>
					      <th>编号</th>
					      <th>时间</th>
					      <th>客户</th>
					      <th>服务</th>
					      <th>理发师</th>
					      <th>价格</th>
					     </tr>
			<s:iterator value="#request['customers']" id="customers">
						<tr>
							<td>
								<s:property value="#customers.id"/>
							</td>
							<td>
								<s:property value="#customers.time"/>
							</td>
							<td>
								<s:property value="#customers.customerName"/>
							</td>
							<td>		
								<s:property value="#customers.service"/>
							</td>
							<td>
								<s:property value="#customers.barber"/>
							</td>
							<td>		
								<s:property value="#customers.money"/>
							</td>
						</tr>
			</s:iterator>	
					</table>
				
			
			<div align="right">
			<ul class="pagination">
				<s:set name="pager" value="#request.pager"/>
				<s:if test="#pager.hasFirst">
					<li><a href="customerRecord.action?currentPage=1&inputnumber=<s:property value="#pager.pageSize"/>">首页</a></li>
				</s:if>
				<s:if test="#pager.hasPrevious">
					<li><a href="customerRecord.action?currentPage=<s:property value="#pager.currentPage-1"/>&inputnumber=<s:property value="#pager.pageSize"/>">
						上一页
					</a></li>
				</s:if>
				<s:if test="#pager.hasNext">
					<li><a href="customerRecord.action?currentPage=<s:property value="#pager.currentPage+1"/>&inputnumber=<s:property value="#pager.pageSize"/>">
						下一页
					</a></li>
				</s:if>
				<s:if test="#pager.hasLast">
					<li><a href="customerRecord.action?currentPage=<s:property value="#pager.totalPage"/>&inputnumber=<s:property value="#pager.pageSize"/>">
						尾页
					</a></li>
				</s:if>
				</ul>
				
				当前第<s:property value="#pager.currentPage"/>页，总共<s:property value="#pager.totalPage"/>页
				
				<form action="customerRecordPage.action" method="post">
				每页显示的记录数为<input type="text" size=3 value=<s:property value="#pager.pageSize"/> id="inputnumber" name="inputnumber" />
				<button type="submit">显示</button>
				</form>
				
				</div>
		</div>

</body>
</html>
