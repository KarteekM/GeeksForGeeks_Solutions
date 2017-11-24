function binaryAgent(str) {
  	var splitBinaryString = [];
	splitBinaryString = str.split(' ');
	convertedDecimalArray = [];
	var finalsentence = '';
	
	 //convert binary to decimal
	 var decimal = 0;
	for(var i=0;i<splitBinaryString.length;i++){
		for(j=0;j<splitBinaryString[i].length;j++){
			
			decimal = decimal + splitBinaryString[i][j]*Math.pow(2,splitBinaryString[i].length-1-j);
		}
		 finalsentence += (String.fromCharCode(decimal));
		 decimal = 0;
	}
	
  return finalsentence;
  
}




