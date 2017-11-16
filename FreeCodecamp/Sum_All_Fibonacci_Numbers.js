function sumFibs(num) {


var firstNumber = 1;
var secondNumber =1;
var arrayFibonacci = [];
arrayFibonacci.push(1);
arrayFibonacci.push(1);
var sum = firstNumber+secondNumber;
while( sum <= num ){
 if(sum %2 != 0) {
  arrayFibonacci.push(sum);
 }
  firstNumber = secondNumber;
  secondNumber = sum;
  sum = firstNumber+secondNumber;
}

sum =	arrayFibonacci.reduce(function (a, b) {
  return a + b;
}, 0);
	
  return sum;
}
