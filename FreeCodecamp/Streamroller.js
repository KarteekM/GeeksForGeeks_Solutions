function steamrollArray(arr) {
  // I'm a steamroller, baby
  var flattenedValues =[];
  for(var i=0;i<arr.length;i++){
	  if(Array.isArray(arr[i])){
		  var intermediateArray = steamrollArray(arr[i]);
		  flattenedValues = flattenedValues.concat(intermediateArray);
	  }
	  else{
		  flattenedValues.push(arr[i]);
	  }
  }
  
  return flattenedValues;
}
