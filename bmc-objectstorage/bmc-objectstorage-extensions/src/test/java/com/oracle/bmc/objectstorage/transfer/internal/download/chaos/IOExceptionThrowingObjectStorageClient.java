/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal.download.chaos;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.function.Predicate;

import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;

public interface IOExceptionThrowingObjectStorageClient extends ObjectStorage {
    static IOExceptionThrowingObjectStorageClient build(
            ObjectStorage client, Predicate<Long> throwBasedOnBytesRead) {
        return (IOExceptionThrowingObjectStorageClient)
                Proxy.newProxyInstance(
                        IOExceptionThrowingObjectStorageClient.class.getClassLoader(),
                        new Class[] {IOExceptionThrowingObjectStorageClient.class},
                        new Handler(client, throwBasedOnBytesRead));
    }

    // proxy class

    /**
     * Implemented as proxy/invocation handler, so we don't have to add more and more methods that just
     * client to the inner {@link ObjectStorage} instance.
     * This will continue to work, even as new methods are added to the interface.
     */
    class Handler implements InvocationHandler {
        private final ObjectStorage client;
        private final Predicate<Long> throwBasedOnBytesRead;

        /**
         * Create an {@link ObjectStorage} client that throws IOExceptions for testing.
         *
         * @param client {@link ObjectStorage} client
         * @param throwBasedOnBytesRead predicate that returns true if an exception should be thrown, based on the number of bytes read
         */
        public Handler(ObjectStorage client, Predicate<Long> throwBasedOnBytesRead) {
            this.client = client;
            this.throwBasedOnBytesRead = throwBasedOnBytesRead;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // these are the methods for which we have special handling
            switch (method.getName()) {
                    // the overridden method
                case "getObject":
                    return getObject((GetObjectRequest) args[0]);
            }

            // no special handling, just client
            try {
                return method.invoke(client, args);
            } catch (InvocationTargetException ite) {
                throw ite.getCause();
            }
        }

        protected GetObjectResponse getObject(GetObjectRequest getObjectRequest) {
            GetObjectResponse response = client.getObject(getObjectRequest);

            GetObjectResponse chaosResponse =
                    GetObjectResponse.builder()
                            .copy(response)
                            .inputStream(
                                    new IOExceptionThrowingInputStream(
                                            response.getInputStream(), throwBasedOnBytesRead))
                            .build();

            return chaosResponse;
        }
    }

    class IOExceptionThrowingInputStream extends FilterInputStream {
        private volatile long bytesRead = 0L;
        private final Predicate<Long> throwBasedOnBytesRead;

        public IOExceptionThrowingInputStream(
                InputStream in, Predicate<Long> throwBasedOnBytesRead) {
            super(in);
            this.throwBasedOnBytesRead = throwBasedOnBytesRead;
        }

        @Override
        public int read() throws IOException {
            if (throwBasedOnBytesRead.test(bytesRead)) {
                throw new IOException("fake");
            }
            int read = super.read();
            ++bytesRead;
            return read;
        }
    }
}
