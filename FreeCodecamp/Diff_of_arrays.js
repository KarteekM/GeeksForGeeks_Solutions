function diffArray(arr1,arr2){
var newArr = [];

  var k =0;
  var i =0;
  var j =0;
  
  if(arr1.length == 0){
    newArr = arr2 ;
    return newArr;
  }
  
  for( i=0;i<arr1.length;i++){
	  
	  for( j=0;j<arr2.length;j++){
	  
	     
		 if(arr1[i] === arr2[j]){
			 
			 break;
		 }
		 
		 
		 else{
			
			if( j === arr2.length-1 ){
				
				newArr[k] = arr1[i];
				k++;
			}
		}
	  
	  }
  }
  
  
     for( i=0;i<arr2.length;i++){
	 for( j=0;j<arr1.length;j++){
		 
		 if(arr2[i] === arr1[j]){
			 break;
		 }
		 
		else if(arr2[i] !== arr1[j]){
			
			if( j === arr1.length-1 ){
				
				newArr[k] = arr2[i];
				k++;
			}
		}
	 }
  }
  
  return newArr;
}









diffArray([1, 2, 3, 5], [1, 2, 3, 4, 5]);
