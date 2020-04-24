var calc = require('./area.js');

var mycalc = new calc()

console.log('半徑5的圓面積：'+ mycalc.circleArea(5));
console.log('8的三次方: ' + mycalc.cube(8));
console.log('name的值: ' + mycalc.name);