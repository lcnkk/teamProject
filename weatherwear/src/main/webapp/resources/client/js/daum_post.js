/**
 * 다음 주소
 */
 
 function daumPost(){
    new daum.Postcode({
        oncomplete: function(data) {
        	console.log(data.zonecode);
        	console.log(data.userSelectedType);
        	console.log(data.roadAddress);
        	console.log(data.jibunAddress);
        	
        	let addr;
        	if(data.userSelectedType == "J"){
        		addr = data.jibunAddress;
        	}else{
        		addr = data.roadAddress;
        	}
        	document.getElementById("addr1").value = data.zonecode;
        	document.getElementById("addr2").value = addr;
        	document.getElementById("addr3").focus();
        }
    }).open();
}