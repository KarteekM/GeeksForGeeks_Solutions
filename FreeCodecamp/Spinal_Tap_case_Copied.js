function spinalCase(str) {
  // "It's such a fine line between stupid, and clever."
  // --David St. Hubbins
  var result="";
  for (var i = 0; i<str.length; i++){
    
    var codeCheck = str.charCodeAt(i);
    
    if(codeCheck>=65 && codeCheck<=90){
      result+=String.fromCharCode(codeCheck+32); // converting to lower case
    }
    else if(codeCheck>=97 && codeCheck<=122){
      
      if(str.charCodeAt(i+1)>=65 && str.charCodeAt(i+1)<=90){ // if the next character is Uppercase, then add the "-"
        result+=String.fromCharCode(codeCheck);
        result+="-";
      }
      else
        result+=String.fromCharCode(codeCheck);
      } 
    else
      result+="-";
  }
  return result;
}
