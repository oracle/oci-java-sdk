/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RequestSignerImplStaticTest {
    private static final String DATA =
            "Though I admire, your angel eyes. There's something else, I idolize! Your nose! Oh whoa whoa whoa your nose!";

    @Test
    public void testEncode() {
        String base64Encode = RequestSignerImpl.base64Encode(DATA.getBytes(StandardCharsets.UTF_8));
        assertEquals(
                "VGhvdWdoIEkgYWRtaXJlLCB5b3VyIGFuZ2VsIGV5ZXMuIFRoZXJlJ3Mgc29tZXRoaW5nIGVsc2UsIEkgaWRvbGl6ZSEgWW91ciBub3NlISBPaCB3aG9hIHdob2Egd2hvYSB5b3VyIG5vc2Uh",
                base64Encode);
    }
}
