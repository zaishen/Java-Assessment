$(document).ready(function() {
	$.ajax({
		url : "https://api.github.com/users"
	}).then(function(data) {
//		console.log(data);
		var table=$("#usersTable");
		var contents="";
		$.each(data,function(idx){
			contents += "<tr>";
			contents += "<td>"+data[idx].id+"</td>";
			contents += "<td style='color:blue' onclick='followersCount(this)'>"+data[idx].login+"</td>";
			contents += "<td id='f'>"+"0"+"</td>";
			contents += "<td> <img src='"+data[idx].avatar_url+"'width=60 height=60/> </td>";
			contents += "</tr>";
		})
//		console.log(contents);
		table.append(contents);
	})	
})

function followersCount(obj){
	$('#usersTable').on('click','td:nth-child(2)',function() {
		 var name = $(this).text();
		 var row_index = $(this).parent().index()+1;
		 $.ajax({
				url:"https://api.github.com/users/" + name + 
				"/followers"
			}).then(function(data){
				console.log(data.length);
				$('#usersTable tr:nth-child('+row_index +') td:nth-child(3)').html(data.length);
			});
	});
}