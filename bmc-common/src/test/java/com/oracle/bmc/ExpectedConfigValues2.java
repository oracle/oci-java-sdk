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
      expectedMap.put("user", "ocid1.user.oc1..aaaaaaaarqnt5lacwpgxa3wqsmec5w22wv3teohuflvdcrcd74agvsiq7upq");
      expectedMap.put("fingerprint", "53:35:b4:2d:c7:ca:ca:2b:86:53:3f:e5:56:cf:eb:21");
      expectedMap.put("tenancy", "ocid1.tenancy.oc1..aaaaaaaafqtdpajmhdh5drcxtiv3gadg6v56p4g4g7svx4vmf7k7srl6zwwa");
      expectedMap.put("region", "us-phoenix-1");
      expectedMap.put("key_file", "/Users/cbateman/.oci/cameron.bateman-06-16-16-40.pem");
      return expectedMap;
  }

}
