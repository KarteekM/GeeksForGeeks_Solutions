function truthCheck(collection, pre) {
 for(var i=0;i<collection.length;i++){
	 if( collection[i].hasOwnProperty(pre) == false){
		 		 
		 return false;
	 } 
	 else{
		 if(Boolean(collection[i][pre]) == undefined || Boolean(collection[i][pre]) == false){
			 return false;
		 }
	 }
 }
  return true;
}
