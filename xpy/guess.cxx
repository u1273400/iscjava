#include <ctime>
#include <iostream>

using std::cout;
using std::endl;
using std::cin;

int main(int argc, char *argv[])
{
	cout << "Welcome to the guessing game" << endl;
	cout << "===========================" << endl;
	srand(time(NULL));
	int rounds;
	cout << "How many times would you like to play: ";
	cin >> rounds;
	int rguesses[rounds];
	for(int round=0; round<rounds;round++){
		cout << "Round " << round << " of " << rounds << endl;
		bool rightGuess=false;
		int guess, number=rand() % 101;
		cout << "Enter your guess between 0 and 100 "  << endl;
		while(!rightGuess){
			if(number==-1)
				return 0;
			if(number==guess){
				rightGuess=true;
			}else if(number<guess){
				cout << "the number is less" << endl;
			}else{
				cout << "the number is greater" << endl;
			}
			rguesses[round]++;
		}
	}
	cout << "\n========Game Summary=========" << endl;
	
}