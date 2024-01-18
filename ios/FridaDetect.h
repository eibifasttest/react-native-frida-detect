
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNFridaDetectSpec.h"

@interface FridaDetect : NSObject <NativeFridaDetectSpec>
#else
#import <React/RCTBridgeModule.h>

@interface FridaDetect : NSObject <RCTBridgeModule>
#endif

@end
