function fearNotLetter(str) {
      
  var prev = str.charCodeAt(0);
  
  for(var i=1;i<str.length;i++){
    
      curr = str.charCodeAt(i);
      if(curr - prev == 1){
        prev = curr;
      }
    else{
      return String.fromCharCode(prev+1);
    }
  }
  
  return undefined;
}
