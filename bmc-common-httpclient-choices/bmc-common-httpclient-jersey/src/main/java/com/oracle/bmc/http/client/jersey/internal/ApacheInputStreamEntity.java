/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey.internal;

import org.apache.http.Header;
import org.apache.http.HttpConnection;
import org.apache.http.HttpEntity;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/**
 * Class for ApacheInputStream. Apache connector in Jersey v2.32 supports passing an HttpEntity as
 * the body. In this case Apache connector will not read entire data into memory. Content length is
 * a must to use this conversion.
 */
public class ApacheInputStreamEntity extends FilterInputStream implements HttpEntity {

    private final long contentLength;

    public ApacheInputStreamEntity(InputStream in, Long contentLength) {
        super(in);
        Objects.requireNonNull(contentLength, "Content length should be not null");
        if (contentLength <= 0) {
            throw new IllegalArgumentException("Content length should be greater than zero");
        }
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

    /**
     * From {@link HttpEntity}:
     *
     * <p>This method is deprecated since version 4.1. Please use standard java convention to ensure
     * resource deallocation by calling {@link InputStream#close()} on the input stream returned by
     * {@link #getContent()}
     *
     * <p>This method is called to indicate that the content of this entity is no longer required.
     * All entity implementations are expected to release all allocated resources as a result of
     * this method invocation. Content streaming entities are also expected to dispose of the
     * remaining content, if any. Wrapping entities should delegate this call to the wrapped entity.
     *
     * <p>This method is of particular importance for entities being received from a {@link
     * HttpConnection connection}. The entity needs to be consumed completely in order to re-use the
     * connection with keep-alive.
     *
     * @throws IOException if an I/O error occurs.
     * @deprecated (4.1) Use {@link org.apache.http.util.EntityUtils#consume(HttpEntity)}
     * @see #getContent() and #writeTo(OutputStream)
     */
    @Deprecated
    @Override
    public void consumeContent() throws IOException {}
}
