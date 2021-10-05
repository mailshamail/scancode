//
// Created by 1 on 04.10.2021.
//

#include "GetSerial.h"
#include <jni.h>
GetSerial::GetSerial(jstring serial) {
    GetSerial::serial = serial;
}

GetSerial::GetSerial(jobject list) {
    GetSerial::arrayList = list;
}

jstring GetSerial::getSerial() {
    return GetSerial::serial;
}

jobject GetSerial::getPackages() {
    return GetSerial::arrayList;
}








