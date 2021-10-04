#include<iostream>
#include <jni.h>

using namespace std;

class GetSerial {
    string serial;
public:
    GetSerial(string serial);
    string getSerial();
};