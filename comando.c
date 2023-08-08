#include <stdlib.h>

int main()
{
    system("javac -d ./comunicaciones comunicaciones/*.java");
    system("java -cp comunicaciones comunicaciones.Main");
    return 0;
}