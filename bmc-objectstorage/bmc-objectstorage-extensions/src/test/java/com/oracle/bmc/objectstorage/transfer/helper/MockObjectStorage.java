/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.helper;

import com.oracle.bmc.objectstorage.ObjectStorage;
import org.mockito.Mockito;

public final class MockObjectStorage {

    private MockObjectStorage() {}

    /**
     * Create a mock ObjectStorage client that can return the specified object.
     */
    public static ObjectStorage create(MockObject mockObject) {
        final ObjectStorage objectStorage = Mockito.mock(ObjectStorage.class);
        Mockito.when(objectStorage.getObject(Mockito.anyObject())).thenAnswer(mockObject);
        return objectStorage;
    }
}
