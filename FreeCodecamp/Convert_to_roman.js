function convertToRoman(num) {
var romanNumber ='';
var romanDecimalMapping =
    [
	    
    { d:1, r:'I' },
    { d:4, r:'IV' },
    { d:5, r:'V' },
    { d:9, r:'IX' },
    { d:10, r:'X' },
    { d:40, r:'XL' },
    { d:50, r:'L' },
    { d:90, r:'XC' },
    { d:100, r:'C' },
    { d:400, r:'CD' },
    { d:500, r:'D' },
    { d:900, r:'CM' },
    { d:1000, r:'M' } ];
	
	
   while(num > 0){
	   
	   var partiallyFoundValue = romanDecimalMapping[0];
	   
	   romanDecimalMapping.forEach(function(obj){
		   
		   if(obj.d <= num){
			   
			   partiallyFoundValue = obj;
			   
		   }
			   
	   });
	   
	   	   romanNumber = romanNumber + partiallyFoundValue.r;
		   num = num-partiallyFoundValue.d;
	   
	   
	   
   }
   return romanNumber;
}
