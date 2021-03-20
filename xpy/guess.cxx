#include <ctime>
#include <iostream>

using std::cout;
using std::endl;
using std::cin;

int main(int argc, char *argv[])
{
	cout << "Welcome to the guessing game" << endl;
	cout << "============================" << endl;
	srand(time(NULL));
	int rounds;
	cout << "How many times would you like to play: ";
	cin >> rounds;
	int rguesses[rounds];
	for(int round=0; round<rounds;round++){
		cout << "Round " << (round+1) << " of " << rounds << endl;
		bool rightGuess=false;
		int guess, number=rand() % 101;
    rguesses[round]=0;
		while(!rightGuess){
			cout << "Enter your guess between 0 and 100: ";cin>>guess;
			if(number==-1)
				cout << "Thank you for playing and have a nice day!\n";
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
	int sum=0;
	for(int i=0;i<rounds;i++){
		cout << "For round " << (i+1) << ", You guessed right after " << rguesses[i] << " attempts\n";
		sum+=rguesses[i];
	}
	cout << "Average guesses per round " << sum/rounds << " \n";
	
}