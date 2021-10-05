#include<iostream>
#include <jni.h>

using namespace std;

class GetSerial {
    jstring serial;
public:
    GetSerial(jstring serial);
    jstring getSerial();
};