function convertHTML(str) {
  
  // &colon;&rpar;
  str   =str.replace(/&/g,'&amp;').replace(/</g,'&lt;').replace(/>/g,'&gt;').replace(/"/g,'&quot;').replace(/'/g,"&apos;");
return str;
//  return str;
  
}
