function pairwise(arr, arg) {
var result = 0;	
for(var i=0;i<arr.length;i++){
	for(var j=i+1;j<arr.length;j++){
		
		if(arr[i] + arr[j] === arg){
			result = result + i + j;
          
          arr[i] = arr[j] = NaN;
		}
	}
}	
  return result;
}

pairwise([1,4,2,3,0,5], 7);
