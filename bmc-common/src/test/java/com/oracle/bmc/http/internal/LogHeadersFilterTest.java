/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LogHeadersFilterTest {

    LogHeadersFilter filterUnderTest = new LogHeadersFilter();

    @Test
    public void testMask() {
        List<String> valueList = new ArrayList<>();
        valueList.add(
                "Signature headers=\"date (request-target) host\",keyId=\"secretJWTToken\",algorithm=\"rsa-sha256\"");
        List<String> result = filterUnderTest.maskValue(valueList);
        Assert.assertEquals(
                result.get(0),
                "Signature headers=\"date (request-target) host\",keyId=\"REDACTED\",algorithm=\"rsa-sha256\"");
    }
}
