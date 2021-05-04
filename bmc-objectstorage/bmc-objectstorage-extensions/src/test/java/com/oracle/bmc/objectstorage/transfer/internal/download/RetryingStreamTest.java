/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal.download;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import org.junit.Test;

public class RetryingStreamTest {
    @Test
    public void testCloseTwice() throws IOException {
        InputStream inputStream = new ByteArrayInputStream("foo".getBytes());
        GetObjectResponse response =
                GetObjectResponse.builder().inputStream(inputStream).contentLength(3L).build();
        RetryingStream rs = new RetryingStream(null, null, response, null);
        rs.close();
        rs.close();
    }
}
