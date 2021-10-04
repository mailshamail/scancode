#include <jni.h>
#include <string>
#include "lib/GetSerial.h"

extern "C" JNIEXPORT jstring JNICALL
Java_mailshamail_ru_MainActivity_stringFromJNI(JNIEnv* env,jobject /* this */) {

    std::string hello = "Hello from C++";

    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT void
Java_mailshamail_ru_MainActivity_getSerial(JNIEnv * env, jobject obj, jstring str){

    //jboolean isCopy;
    //const char * Str;
    //Str = env->GetStringUTFChars(str, &isCopy);
    //strcpy(serial,Str);
    //LOGI("string = \"%s\"",serial);
}