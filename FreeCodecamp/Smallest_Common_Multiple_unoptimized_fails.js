function smallestCommons(arr) {
 
 //The current code logically is fine but crashes the browser and also fails the tests.
 //I also wrote another version of code where it is optimized.
 //Please check for "Small_common_multiple.js" for the same
  var maxValueinArray = arr.reduce(function(a,b){
	   return Math.max(a,b);	 
  });
  
  var minValueinArray = arr.reduce(function(a,b){
         return Math.min(a,b);   
	 
  });
  
  var gcdNumber = maxValueinArray;
  
  while(true){
	  var booleanResult = true;
	  for(var j=minValueinArray;j<=maxValueinArray;j++){
		  if(gcdNumber%j === 0){ 
			  booleanResult = booleanResult && true;
		  }
		  else{
			  booleanResult = booleanResult && false;
		  }
	  }
	  
	  if(booleanResult == true){
		  return gcdNumber;
	  }
	  
	  gcdNumber++;
	   console.log(gcdNumber);
	  
  }


  return -1;
}
