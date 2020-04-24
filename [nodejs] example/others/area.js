const PI = Math.PI.toPrecision(5);

module.exports = function(){
  
  this.name = 'lucky';

  this.circleArea = function(r){
    return PI*r*r;
  };
  
  this.cube = function(n){
    return n*n*n;
  };

};