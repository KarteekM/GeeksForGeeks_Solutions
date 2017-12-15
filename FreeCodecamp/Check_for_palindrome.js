function palindrome(str) {
	    str = str.toLowerCase().replace(/[\W_]/g, '');
 var i=0;
 var j = str.length-1;
  for(;i<j;i++,j--){
	  
	  if(str[i] !== str[j])
		  return false;
  }
 
  return true;
}


