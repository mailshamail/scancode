#include<iostream>
#include <jni.h>

using namespace std;

class GetSerial {
    string serial;
public:
    GetSerial(string serial);

    string getSerial();
};


JNIEXPORT void
java_mailshamail_ru_MainActivity_getSerial(JNIEnv * env, jobject obj, jstring str);