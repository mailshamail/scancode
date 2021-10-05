#include <jni.h>
#include <string>
#include "lib/GetSerial.h"

//extern "C" JNIEXPORT jstring JNICALL
//Java_mailshamail_ru_MainActivity_stringFromJNI(JNIEnv* env,jobject /* this */) {
//
//    std::string hello = "Hello from C++";
//
//    return env->NewStringUTF(hello.c_str());
//}

extern "C"
JNIEXPORT jstring
JNICALL Java_mailshamail_ru_MainActivity_getSerial (JNIEnv *env, jobject obj, jstring string) {

    GetSerial getSerial(string);

    return getSerial.getSerial();
}


extern "C"
JNIEXPORT jobject
JNICALL Java_mailshamail_ru_MainActivity_getPackage (JNIEnv *env, jobject obj, jobject list) {

    GetSerial getPackage(list);

    return getPackage.getPackages();

}