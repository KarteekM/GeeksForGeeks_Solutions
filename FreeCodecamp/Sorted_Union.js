function uniteUnique(arr) {

var newFilteredArray = [];
for(var i=0;i<arguments.length;i++){

	for(var j=0;j<arguments[i].length;j++){
		
		if(newFilteredArray.indexOf(arguments[i][j]) < 0 ){
			newFilteredArray.push(arguments[i][j]);
		}
		
	}
	
}
 

  return newFilteredArray;
}
