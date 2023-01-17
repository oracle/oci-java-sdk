/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.transfer.internal.download.DownloadExecution;
import com.oracle.bmc.objectstorage.transfer.internal.download.MultithreadStream;
import com.oracle.bmc.objectstorage.transfer.internal.download.RetryingStream;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;

/**
 * Download manager, which automatically breaks a larger download into parallel downloads, based on
 * object size. It also handles possible retries.
 *
 * <p>The retries in the download manager are smarter than the retries built into the client: The
 * download manager modifies the request to only retry the parts that haven't been read yet. The
 * client would retry the entire request, and re-download parts that have already been downloaded.
 *
 * <p>Since these retries have been implemented independent of the regular client retries, client
 * retries set using {@link com.oracle.bmc.retrier.RetryConfiguration} are ignored.
 */
public class DownloadManager {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DownloadManager.class);
    private static final RetryConfiguration NO_RETRIES_IN_CLIENT =
            RetryConfiguration.builder()
                    .terminationStrategy(new MaxAttemptsTerminationStrategy(1))
                    .build();

    private final ObjectStorage objectStorage;
    private final DownloadConfiguration config;

    /**
     * This calls acts just like {@link ObjectStorage#getObject(GetObjectRequest)} except that the
     * {@link InputStream} returned {@link GetObjectResponse#getInputStream()} will automatically
     * retry the get operation if there is failure.
     *
     * <p>These retries introduce a new set of possible failures. If the object is modified during a
     * get operation a retry can fail with a 412 or 404 status code.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws com.oracle.bmc.model.BmcException when an error occurs.
     */
    public GetObjectResponse getObject(GetObjectRequest request) {
        // The retries in the download manager are smarter than the retries built into the client:
        // The download
        // manager modifies the request to only retry the parts that haven't been read yet. The
        // client would retry
        // the entire request, and re-download parts that have already been downloaded.
        // We need to make sure we don't get (download manager) retries on top of (client) retries,
        // though.
        request =
                GetObjectRequest.builder()
                        .copy(request)
                        .retryConfiguration(NO_RETRIES_IN_CLIENT)
                        .build();

        final DownloadExecution execution = DownloadExecution.fromConfig(this.config);

        // Perform the first request. Even if we are going to do a multi-threaded
        // download we request the entire object so that we know the total size.
        // (We can close the response early if needed.)
        GetObjectResponse response;
        while (true) {
            try {
                response = this.objectStorage.getObject(request);
                break;
            } catch (Throwable t) {
                if (execution.shouldRetryOn(t)) {
                    continue;
                }
                throw t;
            }
        }

        // When an if-match request fails (i.e. the object matches the etag)
        // the getObject call does not throw an exception, but also does not
        // return any data. Match that behavior.
        if (response.isNotModified()) {
            return response;
        }

        // We have read the object. Remember the etag so that a retried request
        // will fail if the object is changed underneath us.
        final String etag = response.getETag();
        final GetObjectRequest.Builder requestWithEtagBuilder =
                GetObjectRequest.builder().copy(request).ifMatch(etag);

        // This input stream will read the first part of the object.
        final InputStream retryingStream =
                new RetryingStream(
                        this.objectStorage, requestWithEtagBuilder.build(), response, execution);

        // Do we want a single-threaded, or multi-threaded download?
        final InputStream stream;
        if (this.config.getParallelDownloads() > 0
                && response.getContentLength() > this.config.getMultipartDownloadThresholdInBytes()
                && response.getContentLength() > DownloadConfiguration.MIN_PART_SIZE_IN_BYTES) {
            // This is a big object so we will use multiple threads to download
            // it. How big should each part be?
            //
            // The first part will be downloaded by the foreground thread
            // so we count it as a worker.
            final int totalWorkers = this.config.getParallelDownloads() + 1;
            assert totalWorkers >= 2;

            // Is the object large enough to give each worker at least partSizeInBytes
            // of data to download?
            final int partSize;
            if (response.getContentLength()
                    >= (long) totalWorkers * (long) this.config.getPartSizeInBytes()) {
                // This is a really big object -- each worker has at least partSizeInBytes
                // of data to download.
                partSize = this.config.getPartSizeInBytes();
            } else {
                // Divide the data evenly between the workers, respecting the minimum
                // part size for all except the last part.
                partSize =
                        Math.max(
                                Math.toIntExact(response.getContentLength() / totalWorkers),
                                DownloadConfiguration.MIN_PART_SIZE_IN_BYTES);
            }
            assert partSize <= this.config.getPartSizeInBytes();
            assert partSize >= DownloadConfiguration.MIN_PART_SIZE_IN_BYTES;
            LOG.trace("partSizeInBytes = {}", partSize);

            // Total number of parts we will be downloading
            final int numParts =
                    Math.toIntExact((response.getContentLength() + partSize - 1) / partSize);
            assert numParts >= 2;

            // The first part is downloaded by the foreground thread so we
            // do not need more than numParts-1 threads
            final int numThreads = Math.min(this.config.getParallelDownloads(), numParts - 1);
            assert numThreads > 0;

            // In cache, some requests set if-none-match to get an unchanged response back if the
            // object hasn't changed.
            // For parallel downloads, the download manager adds the if-match header to ensure all
            // parts are from the same
            // object version. But it is illegal to have both if-match and if-none-match in the same
            // request. Therefore,
            // we need to set if-none-match to null for the following parts to allow downloads using
            // download manager.
            if (request.getIfNoneMatch() != null) {
                requestWithEtagBuilder.ifNoneMatch(null);
            }

            stream =
                    new MultithreadStream(
                            this,
                            requestWithEtagBuilder.build(),
                            response.getContentLength(),
                            retryingStream,
                            this.config.getParallelDownloads(),
                            this.config.getExecutorService(),
                            partSize);
        } else {
            // This is a small object. Use a single-threaded download.
            stream = retryingStream;
        }

        final GetObjectResponse retryingResponse =
                GetObjectResponse.builder().copy(response).inputStream(stream).build();
        return retryingResponse;
    }

    /**
     * Download the object and save it to a file.
     *
     * <p>This calls acts just like {@link ObjectStorage#getObject(GetObjectRequest)} except that
     * the {@link InputStream} returned {@link GetObjectResponse#getInputStream()} will
     * automatically retry the get operation if there is failure.
     *
     * <p>These retries introduce a new set of possible failures. If the object is modified during a
     * get operation a retry can fail with a 412 or 404 status code.
     *
     * <p>The downloaded object will be saved in the specified file.
     *
     * <p>The response will be returned, but note that the stream has already been consumed.
     *
     * @param request The request object containing the details to send
     * @param target The file where the object should be saved
     * @return A response object containing details about the completed operation, but with already
     *     consumed stream
     * @throws com.oracle.bmc.model.BmcException when an error occurs.
     */
    public GetObjectResponse downloadObjectToFile(GetObjectRequest request, File target)
            throws IOException {
        GetObjectResponse response = getObject(request);

        // use the stream contents; make sure to close the stream, e.g. by using try-with-resources
        try (final InputStream stream = response.getInputStream();
                final OutputStream outputStream = new FileOutputStream(target)) {
            // use fileStream
            byte[] buf = new byte[8192];
            int bytesRead;
            while ((bytesRead = stream.read(buf)) > 0) {
                outputStream.write(buf, 0, bytesRead);
            }
        } // try-with-resources automatically closes streams

        return response;
    }

    /** Used by {@link MultithreadStream}. This does NOT multithread the download. */
    public GetObjectResponse getObject_singleThreaded(GetObjectRequest request) {
        final DownloadExecution execution = DownloadExecution.fromConfig(this.config);

        // Perform the first request. Even if we are going to do a multi-threaded
        // download we request the entire object so that we know the total size.
        // (We can close the response early if needed.)
        GetObjectResponse response;
        while (true) {
            try {
                response = this.objectStorage.getObject(request);
                break;
            } catch (Throwable t) {
                if (execution.shouldRetryOn(t)) {
                    continue;
                }
                throw t;
            }
        }

        // We have read the object. Remember the etag so that a retried request
        // will fail if the object is changed underneath us.
        final String etag = response.getETag();
        final GetObjectRequest requestWithEtag =
                GetObjectRequest.builder().copy(request).ifMatch(etag).build();

        // This input stream will read from the
        final InputStream retryingStream =
                new RetryingStream(this.objectStorage, requestWithEtag, response, execution);

        final GetObjectResponse retryingResponse =
                GetObjectResponse.builder().copy(response).inputStream(retryingStream).build();
        return retryingResponse;
    }

    @java.beans.ConstructorProperties({"objectStorage", "config"})
    public DownloadManager(final ObjectStorage objectStorage, final DownloadConfiguration config) {
        this.objectStorage = objectStorage;
        this.config = config;
    }
}
