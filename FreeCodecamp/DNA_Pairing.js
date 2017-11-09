
function pairElement(str) {
	
var twodArray = [];
var arrayToBePushed = [];

for(var i=0;i<str.length;i++){
	
	if(str[i] == 'A'){
     	  
	  arrayToBePushed = [ "A","T"];
	 
	}
	
	else if(str[i] == 'T'){
		arrayToBePushed = ["T","A"];
		
	}
	
	else if(str[i] == 'C'){
	    arrayToBePushed = ["C","G"];
		
		
	}
	
	else if(str[i] == 'G'){
		arrayToBePushed = ["G","C"];
		
		
	}
  twodArray.push(arrayToBePushed);
  
}	

	
  return twodArray;
}
