
function updateInventory(arr1, arr2) {
    // All inventory must be accounted for or you're fired!
  
  //Edge cases
  if(arr1.length === 0){
    arr1 = arr2;
  }
  
  //Happy path
  else{
  for(var i=0;i<arr2.length;i++){
	for(var j=0;j<arr1.length;j++){
		
		if(arr2[i][1] === arr1[j][1]){
			arr1[j][0] = arr1[j][0] + arr2[i][0];
			j = arr1.length;
		}
		
		else if(j === arr1.length-1){
			arr1.push([arr2[i][0],arr2[i][1]]);
			j = arr1.length;
		}
	}
 }
}  

//sort
arr1.sort(function(a,b){
	
	if(a[1]>b[1]){
		return 1;
	}
	if(a[1]<b[1]){
		return -1;
	}
	return 0;
});

    return arr1;
  
   
}

// Example inventory lists
var curInv = [
    [21, "Bowling Ball"],
    [2, "Dirty Sock"],
    [1, "Hair Pin"],
    [5, "Microphone"]
];

var newInv = [
    [2, "Hair Pin"],
    [3, "Half-Eaten Apple"],
    [67, "Bowling Ball"],
    [7, "Toothpaste"]
];

updateInventory(curInv, newInv);
