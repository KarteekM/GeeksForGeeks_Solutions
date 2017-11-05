function rot13(str) { // LBH QVQ VG!
  
	
    str = str.toUpperCase();
  var decodedChar = [];
  for(var i=0;i<str.length;i++){
	  var code = str.charCodeAt(i);
	  if(code >= 65 && code <= 91){
		  
		  code = code + 13;
		  if(code >= 91){
			  code = code - 91 + 65;
		  }
		decodedChar[i] = String.fromCharCode(code);
	  }
	  
	  else{
		  decodedChar[i] = str[i];
	  }
  }
  return decodedChar.join("") ;
  
 
}

// Change the inputs below to test
rot13("SERR PBQR PNZC");
