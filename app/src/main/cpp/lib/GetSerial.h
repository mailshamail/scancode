#include<iostream>
#include <jni.h>

using namespace std;

class GetSerial {
    jstring serial;
    jobject arrayList;
public:
    GetSerial(jstring serial);
    GetSerial(jobject list);

    jstring getSerial();
    jobject getPackages();
};