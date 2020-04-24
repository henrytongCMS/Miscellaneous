var code;

function createCaptcha() {
	
	//clear the contents of captcha div first 
	document.getElementById('captcha').innerHTML = "";
	
	var charsArray = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	var lengthOtp = 4;
	var captcha = [];
	
	for(var i = 0; i < lengthOtp; i++) {
		  //below code will not allow Repetition of Characters
		  var index = Math.floor(Math.random() * charsArray.length);
		  if (captcha.indexOf(charsArray[index]) == -1)
		      captcha.push(charsArray[index]);
		  else i--;
	}
			
	var canv = document.createElement("canvas");
	canv.id = "captcha";
	canv.width = 100;
	canv.height = 50;
	
	var ctx = canv.getContext("2d");
	ctx.font = "25px Georgia";
	ctx.strokeText(captcha.join(""), 0, 30);
	
	//storing captcha so that can validate you can save it somewhere else according to your specific requirements
	code = captcha.join("");
	document.getElementById("captcha").appendChild(canv); // adds the canvas to the body element
	
}

function validateCaptcha() {
	
	event.preventDefault();
	
	if(document.getElementById("captchaTextBox").value == code) {
		document.getElementsByName('contact')[0].action = "LoginServlet";
		document.getElementsByName('contact')[0].submit();
	} else {
		alert("Captcha incorrect!");
		createCaptcha();
	}
	
}