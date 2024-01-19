#import "FridaDetect.h"
#import <dlfcn.h>
#import <sys/types.h>
#import <stdio.h>
#include <syslog.h>


typedef int (*ptrace_ptr_t)(int _request, pid_t _pid, caddr_t _addr, int _data);

@implementation FridaDetect
RCT_EXPORT_MODULE()

void anti_debug() {
  ptrace_ptr_t ptrace_ptr = (ptrace_ptr_t)dlsym(RTLD_SELF, "ptrace");
  ptrace_ptr(31, 0, 0, 0); // PTRACE_DENY_ATTACH = 31
}

RCT_EXPORT_METHOD(detect)
{
  anti_debug();
  NSLog(@"anti_debug() trigerred");
}


@end
