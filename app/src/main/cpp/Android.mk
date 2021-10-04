LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := ru
LOCAL_DEFAULT_CPP_EXTENSION := cpp
LOCAL_SRC_FILES := native-lib.cpp
LOCAL_LDLIBS :=  -llog -landroid

include $(BUILD_SHARED_LIBRARY)