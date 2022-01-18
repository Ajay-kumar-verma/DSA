#include <iostream>;
using namespace std;
int fun(int a, int b=1, int c=2)
{ return (a + b + c);}
int main()
{ cout << fun(12,,2); return 0;}