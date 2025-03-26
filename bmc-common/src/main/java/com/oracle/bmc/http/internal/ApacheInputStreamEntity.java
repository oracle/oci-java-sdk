/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.util.internal.Validate;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Class for ApacheInputStream.
 * Apache connector in Jersey v2.32 supports passing an HttpEntity as the body. In this case Apache connector will not
 * read entire data into memory. Content length is a must to use this conversion.
 */
public class ApacheInputStreamEntity extends FilterInputStream implements HttpEntity {

    private final long contentLength;

    public ApacheInputStreamEntity(InputStream in, Long contentLength) {
        super(in);
        Validate.isTrue(contentLength != null, "Content length should be not null");
        Validate.isTrue(contentLength > 0, "Content length should be greater than zero");
        this.contentLength = contentLength;
    }

    @Override
    public boolean isRepeatable() {
        return false;
    }

    @Override
    public boolean isChunked() {
        return false;
    }

    @Override
    public long getContentLength() {
        return contentLength;
    }

    @Override
    public Header getContentType() {
        return null;
    }

    @Override
    public Header getContentEncoding() {
        return null;
    }

    @Override
    public InputStream getContent() throws IOException, UnsupportedOperationException {
        return this;
    }

    @Override
    public void writeTo(OutputStream outputStream) throws IOException {
        try {
            byte[] tmp = new byte[4096];

            int bytesRead;
            while ((bytesRead = read(tmp)) != -1) {
                outputStream.write(tmp, 0, bytesRead);
            }
        } finally {
            close();
        }
    }

    @Override
    public boolean isStreaming() {
        return true;
    }

    @Override
    public void consumeContent() throws IOException {}
}
