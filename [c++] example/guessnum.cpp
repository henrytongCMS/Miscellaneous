#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main(){

  cout << "\n";
  cout << "     ####################\n";
  cout << "     ##  GUESS NUMBER  ##\n";
  cout << "     ##  Version  2.0  ##\n";
  cout << "     ##                ##\n";
  cout << "     ## Wrote by Henry ##\n";
  cout << "     ##   2013/10/05   ##\n";
  cout << "     ####################\n";
  cout << "\n";
  cout << "A: The number is at the right position.\n";
  cout << "B: The number is match but not at the right position.\n\n";

  int guess, answer;
  int num[4];
  int count, tries;
  int a, b, n;

  //Player choose game mode
  cout << "1.Easy(15 tries)\n2.Medium(10 tries)\n3.Hard(7 tries)\n";
  cin >> n;

  if(n == 1){
    tries=15;
    cout << "You choose an easy game!\n";
  }else if(n == 2){
    tries=10;
    cout << "You choose a medium game!\n";
  }else if(n == 3){
    tries=7;
    cout << "You choose a hard game!\n";
  }else{
    cout << "Wrong choice!\n";
    return 0;
  }

  cout << "\n";
  cout << "     ####################\n";  
  cout << "     ##   GAME START   ##\n";
  cout << "     ####################\n"; 
  cout << "\n";

  //Generate four-no-repeating-digits number randomly 
  srand(time(NULL));
  for(int i=0; i<4; i++){
    if(i == 0)
      num[i]=rand()%9+1;
    else
      num[i]=rand()%10;
    for(int j=0; j<i; j++){
      if(num[i] == num[j]){
	i--;
	break;
      }
    }
  }
  answer=num[0]*1000+num[1]*100+num[2]*10+num[3];

  count=1;
  while(guess != answer){
    a=0;
    b=0;
 
    cout << count << " tries: " << endl;
    cout << "Please guess four numbers:" << endl;
    cin >> guess;

    //Only enter four numbers
    while(guess < 1000 || guess > 9999){
      cout << "Enter four numbers only!" << endl;
      return 1;
    }

    //Each input number cannot repeat
    for(int i=1; i<=1000; i*=10){
      for(int j=1; j<=1000; j*=10){	
	if(i==j){ 
	  j*=10;
	}
	if((guess/i%10) == (guess/j%10)){
	  cout << "Each number cannot repeat!" << endl; 
	  return 2;
	}
      }
    }

    //Calculate A: num is in the right position
    for(int i=1; i<=1000; i*=10){
      if(guess/i%10 == answer/i%10)
	a+=1;
    }

    //Calculate B: num is match but in the wrong position
    for(int i=1; i<=1000; i*=10){
      for(int j=1; j<=1000; j*=10){
	if(i==j){ 
	  j*=10;
	}
	if((guess/i%10) == (answer/j%10)){
	  b+=1;
	  break;
	}
      }
    }

    count++;
    cout << "Results: " << "A" << a << "B" << b << "\n\n";

    //Only y tries
    while(count > tries){
      cout << "You guess too many times! Please work hard!" << endl;
      cout << "The number is " << answer << ".\n\n"; 
      cout << "     ####################\n";  
      cout << "     ##   GAME  OVER   ##\n";
      cout << "     ####################\n"; 
      cout << "\n";
      return 3;
    }
  }

  //If player succeed
  cout << "Congrats! Your guess is right!" << endl;
  cout << "The number is " << answer << ".\n\n"; 
  cout << "     ####################\n";  
  cout << "     ##   GAME  OVER   ##\n";
  cout << "     ####################\n"; 
  cout << "\n";
  return 4;
}
