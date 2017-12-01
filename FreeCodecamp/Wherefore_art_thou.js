function whatIsInAName(collection, source) {
	
	
  // What's in a name?
  var arr = [];
  // Only change code below this line
  
 var sourceKeys = Object.keys(source);
   
arr = collection.filter(function(obj){

for(var i=0;i<sourceKeys.length;i++){
	if( !obj.hasOwnProperty(sourceKeys[i]) || obj[sourceKeys[i]] != source[sourceKeys[i]]){
		return false;
	}
 }
	return true;
});   
 
  
  
  // Only change code above this line
  return arr;
}
