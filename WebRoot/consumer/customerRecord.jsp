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
					<caption>�û����Ѽ�¼</caption>
						<tr>
					      <th>���</th>
					      <th>ʱ��</th>
					      <th>�ͻ�</th>
					      <th>����</th>
					      <th>��ʦ</th>
					      <th>�۸�</th>
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
					<li><a href="customerRecord.action?currentPage=1&inputnumber=<s:property value="#pager.pageSize"/>">��ҳ</a></li>
				</s:if>
				<s:if test="#pager.hasPrevious">
					<li><a href="customerRecord.action?currentPage=<s:property value="#pager.currentPage-1"/>&inputnumber=<s:property value="#pager.pageSize"/>">
						��һҳ
					</a></li>
				</s:if>
				<s:if test="#pager.hasNext">
					<li><a href="customerRecord.action?currentPage=<s:property value="#pager.currentPage+1"/>&inputnumber=<s:property value="#pager.pageSize"/>">
						��һҳ
					</a></li>
				</s:if>
				<s:if test="#pager.hasLast">
					<li><a href="customerRecord.action?currentPage=<s:property value="#pager.totalPage"/>&inputnumber=<s:property value="#pager.pageSize"/>">
						βҳ
					</a></li>
				</s:if>
				</ul>
				
				��ǰ��<s:property value="#pager.currentPage"/>ҳ���ܹ�<s:property value="#pager.totalPage"/>ҳ
				
				<form action="customerRecordPage.action" method="post">
				ÿҳ��ʾ�ļ�¼��Ϊ<input type="text" size=3 value=<s:property value="#pager.pageSize"/> id="inputnumber" name="inputnumber" />
				<button type="submit">��ʾ</button>
				</form>
				
				</div>
		</div>

</body>
</html>
