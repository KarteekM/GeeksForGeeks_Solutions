function translatePigLatin(str) {

  str = str.toLowerCase();
   var firstLetter = "";
   var withoutFirstLetter = "";
   var i=0;
	if(str[0] != 'a' &&  str[0] != 'e' && str[0] != 'i' && str[0] != 'o' && str[0] != 'u'){
      
	  for(i=0;i<str.length;i++){
        
        if(str[0] != 'a' &&  str[0] != 'e' && str[0] != 'i' && str[0] != 'o' && str[0] != 'u'){
          
          firstLetter = str[0];
		  withoutFirstLetter = str.substr(1,str.length-1);
		  str = withoutFirstLetter.concat(firstLetter);		           
        }
        else
         return str.concat("ay");       
        
      } 
		
	}
	else
	return str.concat("way");
}
