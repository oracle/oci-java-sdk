/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal.download;

import java.io.IOException;
import java.io.InputStream;
import com.oracle.bmc.model.Range;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.util.StreamUtils;

/**
 * An InputStream that can resume a broken download by making a range read request to Object
 * Storage.
 */
public class RetryingStream extends InputStream {

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RetryingStream.class);

    /** ObjectStorage client. */
    private final ObjectStorage objectStorage;

    /** Used to control retries of the download. */
    private final DownloadExecution execution;

    /** Current request. */
    private GetObjectRequest request;

    /** Current response. */
    private GetObjectResponse response;

    /** Number of bytes in the response */
    private long bytesInResponse;

    /** Total bytes read from the object. */
    private long bytesReadFromResponse;

    /** True if this stream has been closed. */
    private boolean isClosed;

    public RetryingStream(
            ObjectStorage objectStorage,
            GetObjectRequest request,
            GetObjectResponse response,
            DownloadExecution execution) {
        this.objectStorage = objectStorage;
        this.request = request;
        this.response = response;
        this.bytesReadFromResponse = 0;
        this.bytesInResponse = response.getContentLength();
        this.execution = execution;
        this.isClosed = false;
    }

    @Override
    public synchronized void close() throws IOException {
        if (this.response != null) {
            StreamUtils.closeQuietly(this.response.getInputStream());
        }
        this.response = null;
        this.request = null;
        this.isClosed = true;
    }

    @Override
    public synchronized int read() throws IOException {
        if (this.bytesInResponse == this.bytesReadFromResponse) {
            return -1;
        }

        this.throwIfClosed();

        while (true) {
            try {
                final int value = this.response.getInputStream().read();
                if (value >= 0) {
                    ++this.bytesReadFromResponse;
                }
                return value;
            } catch (Throwable t) {
                if (this.execution.shouldRetryOn(t)) {
                    LOG.info("Refreshing request on retry", t);
                    this.refresh();
                    continue;
                }
                throw t;
            }
        }
    }

    @Override
    public synchronized int read(byte[] b, int off, int len) throws IOException {
        if (len == 0) {
            return 0;
        }

        if (this.bytesInResponse == this.bytesReadFromResponse) {
            return -1;
        }

        this.throwIfClosed();

        while (true) {
            try {
                final int bytesRead = this.response.getInputStream().read(b, off, len);
                LOG.trace("Read {} bytes", bytesRead);
                if (bytesRead > 0) {
                    this.bytesReadFromResponse += bytesRead;
                }
                return bytesRead;
            } catch (Throwable t) {
                if (this.execution.shouldRetryOn(t)) {
                    LOG.info("Refreshing request on retry", t);
                    this.refresh();
                    continue;
                }
                throw t;
            }
        }
    }

    private void throwIfClosed() throws IOException {
        if (this.isClosed) {
            throw new IOException("Stream has been closed");
        }
    }

    /**
     * Called when we hit an exception reading from the InputStream. This performs a range read to
     * pick up reading where the previous request left off.
     */
    private void refresh() {
        // We no longer need data from the current response
        StreamUtils.closeQuietly(this.response.getInputStream());

        // Create a new request to read the remaining bytes
        this.refreshRequest();

        // Get the object, with retries
        while (true) {
            try {
                this.response = this.objectStorage.getObject(this.request);
                break;
            } catch (Throwable t) {
                if (this.execution.shouldRetryOn(t)) {
                    continue;
                }
                throw t;
            }
        }

        this.bytesInResponse = this.response.getContentLength();
        this.bytesReadFromResponse = 0;
    }

    /**
     * Called when we get an exception reading from the response. We calculate a new request that
     * does a range read starting with the last byte that was successfully read.
     */
    private void refreshRequest() {
        // Prepare the new request
        final GetObjectRequest.Builder requestBuilder = GetObjectRequest.builder();
        requestBuilder.copy(this.request);

        // Compute the new range
        Range newRange = null;
        Range currentRequestRange = this.request.getRange();
        Range currentResponseRange = this.response.getContentRange();

        // Range requests should always return correct start and end byte in the response
        // content-range
        if (currentRequestRange == null) {
            newRange = new Range(this.bytesReadFromResponse, null);
        } else if (currentResponseRange != null) {
            newRange =
                    new Range(
                            currentResponseRange.getStartByte() + this.bytesReadFromResponse,
                            currentResponseRange.getEndByte());
        }
        LOG.info(
                "Current range was {}. New byte corrected range  is = {}",
                currentRequestRange,
                newRange);
        requestBuilder.range(newRange);

        this.request = requestBuilder.build();
    }
}
