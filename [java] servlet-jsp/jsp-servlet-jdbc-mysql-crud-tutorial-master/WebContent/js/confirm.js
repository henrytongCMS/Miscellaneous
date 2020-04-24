
function confirmDelete(userid){
	if( window.confirm("Confirm delete?") )
		location.href = "DeleteServlet?id=" + userid;	
}