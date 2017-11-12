function findElement(arr, func) {
 /* var num = 0;
  for(var i=0;i<arr.length;i++){
	 
	 if(func(arr[i]) === true){
		 
		 return arr[i];
	 }
 } 
 return undefined; */
  var filteredArray = arr.filter(func);
 return filteredArray[0];
 
}
