function smallestCommons(arr) {
 var maxValueinArray = Math.max(arr[0],arr[1]);
  
  var minValueinArray =Math.min(arr[0],arr[1]);
  
  var gcdNumber = maxValueinArray;
  
  while(true){
	  var booleanResult = true;
	  for(var j=minValueinArray;j<=maxValueinArray;j++){
		  if(gcdNumber%j !== 0){
			booleanResult = false;
            break;
		  }
		  else{
			  booleanResult = true;
		  }
	  }
	  
	  if(booleanResult == true){
		  return gcdNumber;
	  }
	  
      //gcdNumber = gcdNumber++; Unoptimized .So the tests are failing
	  gcdNumber = gcdNumber + maxValueinArray; //Optimized
	  
  }

 	
  return -1;
}
