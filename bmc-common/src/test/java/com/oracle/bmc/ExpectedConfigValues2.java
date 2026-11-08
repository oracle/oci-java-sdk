package com.oracle.bmc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpectedConfigValues2 {

  public static List<String> getExpectedProfileNames() {
    return Arrays.asList("DEFAULT", "ALWAYSFREE", "ONPREMJAVA", "ASHBURN");  
  }

  public static Map<String, String> createDefaultExpectedMap() {
      Map<String,String> expectedMap = new HashMap<>();
      expectedMap.put("user", "ocid1.user.oc1..aaaaaaaarqntblargh");
      expectedMap.put("fingerprint", "xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx");
      expectedMap.put("tenancy", "ocid1.tenancy.oc1.aaaaablah");
      expectedMap.put("region", "us-phoenix-1");
      expectedMap.put("key_file", "/Users/homer/.oci/hsimpson/homer-simpson-06-16-12.pem");
      return expectedMap;
  }

}
